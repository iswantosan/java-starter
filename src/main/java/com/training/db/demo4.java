package com.training.db;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class demo4 {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    DbConfig.getUrl(), DbConfig.getUser(),
                    DbConfig.getPass());
            PreparedStatement stmt
                    = con.prepareStatement("insert into accounts (name,balance) values (?,?)");

            // 1. baca csv
            InputStream stream = demo4.class.getClassLoader().getResourceAsStream("account.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));

            // 2. add batch
            con.setAutoCommit(false);

            String line;
            br.readLine(); //skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                BigDecimal balance = new BigDecimal(data[1]);
                stmt.setString(1, name);
                stmt.setBigDecimal(2, balance);
                stmt.addBatch();
            }

            // 3. execite batch
            stmt.executeBatch();
            con.commit();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
