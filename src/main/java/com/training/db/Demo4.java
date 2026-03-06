package com.training.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.*;

public class Demo4 {

    public static void main(String[] args) {
        String sql = "insert into accounts (name, balance) values (?, ?)";
        try (Connection con = DriverManager.getConnection(
                DbConfig.getUrl(),
                DbConfig.getUser(),
                DbConfig.getPass());
             PreparedStatement stmt = con.prepareStatement(sql)) {  // open connection

            // 1. baca csv
            InputStream stream =  Demo4.class
                    .getClassLoader()
                    .getResourceAsStream("account.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));

            // 2. add batchnya
            con.setAutoCommit(false);

            String line;
            br.readLine();          // skip header
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                BigDecimal balance = new BigDecimal(data[1]);
                stmt.setString(1, name);
                stmt.setBigDecimal(2, balance);
                stmt.addBatch();
            }

            // 3. execute batch
            stmt.executeBatch();
            con.commit();
        } catch (SQLException | IOException e) {
            System.getLogger(Demo1.class.getName()).log(
                    System.Logger.Level.ERROR,
                    (String) null,
                    e
            );
        }
    }
}
