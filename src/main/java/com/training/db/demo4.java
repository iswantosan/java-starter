package com.training.db;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo4 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass());
        String sql = "INSERT INTO accounts (name, balance) VALUES (?, ?)";
        try (conn; PreparedStatement ps = conn.prepareStatement(sql);) {

            // 1. baca csv dari path resources
            InputStream stream = demo4.class.getClassLoader().getResourceAsStream("account.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

            // 2. add ke batchnya
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("name")) {
                    continue;
                }
                String[] parts = line.split(",");
                ps.setString(1, parts[0]);
                ps.setDouble(2, Double.parseDouble(parts[1]));
                System.out.println("Adding to batch: name=" + parts[0] + ", balance=" + parts[1]);
                ps.addBatch();
            }

            // 3. execute batch
            conn.setAutoCommit(false);
            ps.executeBatch();
            conn.commit();
        } catch (Exception ex) {
            try {
                conn.rollback();
            } catch (SQLException e) {
                System.getLogger(demo4.class.getName()).log(System.Logger.Level.ERROR, (String) null, e);
            }
            System.getLogger(demo4.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
