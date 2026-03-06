package com.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // try resource -> otomatis close connection
        System.out.println(DbConfig.getUrl());
        try (Connection con = DriverManager.getConnection(DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass());
                PreparedStatement stmt = con.prepareStatement("select * from accounts");
                ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("balance"));
            }

            // ini untuk cek koneksi nya, karena connection pool itu akan buat beberapa
            // koneksi, jadi kita bisa cek dengan identityHashCode
            System.out.println("Connection: " + System.identityHashCode(con));

            // Scanner scan = new Scanner(System.in);
            // System.out.print("Enter: "); // -> ini hanya untuk menahan program agar tidak
            // langsung selesai
            // scan.nextLine();

            // cek nya ada di query
            // select * from pg_catalog.pg_stat_activity psa
            // where psa.application_name not like '%DBeaver%'
            // and psa.application_name != ''

        } catch (SQLException ex) {
            System.getLogger(Demo1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
