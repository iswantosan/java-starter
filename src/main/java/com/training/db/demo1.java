package com.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo1 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try (Connection con = DriverManager.getConnection(
                    DbConfig.getUrl(), DbConfig.getUser(),
                    DbConfig.getPass()); PreparedStatement stmt
                    = con.prepareStatement("select * from accounts"); 
                    ResultSet rs = stmt.executeQuery();) { // open connection

                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " " + rs.getString("name")
                            + " " + rs.getDouble("balance"));
                }

                System.out.println("Connection: " + System.identityHashCode(con));

            } catch (SQLException ex) {
                System.getLogger(demo1.class.getName()).log(System.Logger.Level.ERROR,
                        (String) null, ex);
            }

        }

    }
}
