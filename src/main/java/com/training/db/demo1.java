package com.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class demo1 {
    @SuppressWarnings("resource")
    public static void main(String[] args)  {
        //try resource
        for(int i = 0; i < 5; i++) {
            try(Connection conn = DriverManager.getConnection(DbConfig.getUrl(),
                DbConfig.getUser(),
                DbConfig.getPass());
                PreparedStatement stmt = conn.prepareStatement("SELECT * from accounts");
                ResultSet rs = stmt.executeQuery();) {
                
                while(rs.next()) {
                    System.out.println("ID: "+rs.getInt("id")+", Name: "+rs.getString("name")+", Balance: "+rs.getDouble("balance"));
                    
                }
                
                System.out.println("connection: "+ System.identityHashCode(conn));

                System.out.println("Press Enter to continue...");
                new Scanner(System.in).nextLine();

            } catch (SQLException ex) {
                System.getLogger(demo1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}
