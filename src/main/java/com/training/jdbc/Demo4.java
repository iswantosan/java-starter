package com.training.jdbc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.training.db.DbConfig;

public class Demo4 {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
        DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass()); 
        PreparedStatement stmt = con.prepareStatement("insert into accounts (name, balance) values (?, ?)");) {

            // baca csv
            InputStream inputStream = Demo4.class
            .getClassLoader()
            .getResourceAsStream("account.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            // add batch
            // String sql = "insert into accounts (name, balance) value (?, ?)";
            con.setAutoCommit(false);

            String line;
            bufferedReader.readLine(); // skip header atau baris pertama dalam file csv
            while((line = bufferedReader.readLine()) != null) {
                String [] data = line.split(",");
                String name = data[0];
                BigDecimal balance = new BigDecimal(data[1]);
                stmt.setString(1, name);
                stmt.setBigDecimal(2, balance);
                stmt.addBatch();
            }

            // execute batch
            stmt.executeBatch();
            con.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
