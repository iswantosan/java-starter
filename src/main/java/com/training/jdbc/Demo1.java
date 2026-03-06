package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.db.DbConfig;

public class Demo1 {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
        DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass()); 
        PreparedStatement stmt = con.prepareStatement("select * from accounts"); 
        ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("balance"));
            }

            System.out.println("Connection : " + System.identityHashCode(con));

        } catch (SQLException ex) {
            System.getLogger(Demo1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        };
    }
}
