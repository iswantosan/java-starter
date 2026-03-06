package com.training.db;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(
                    DbConfig.getUrl(),
                    DbConfig.getUser(),
                    DbConfig.getPass());
             PreparedStatement stmt = con.prepareStatement("select * from accounts");
             ResultSet rs = stmt.executeQuery()) {  // open connection

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " + rs.getString("name") + " " +
                                rs.getDouble("balance")
                );
            }

            System.out.println("Press enter to continue");
            new Scanner(System.in).nextLine();

        } catch (SQLException e) {
            System.getLogger(Demo1.class.getName()).log(
                    System.Logger.Level.ERROR,
                    (String) null,
                    e
            );
        }
    }
}
