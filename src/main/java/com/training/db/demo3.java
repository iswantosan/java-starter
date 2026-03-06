package com.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo3 {
    public static void main(String[] args) throws SQLException {
        // transfer 200 dari account 1 ke account 2
        Connection conn = DriverManager.getConnection(DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass());
        try (conn;
                PreparedStatement ps1 = conn
                        .prepareStatement("update accounts set balance = balance - 200 where id = 1");
                PreparedStatement ps2 = conn
                        .prepareStatement("update accounts set balance = balance + 200 where id = 2");) {
            conn.setAutoCommit(false);
            ps1.executeUpdate();
            // if (true) {
            // throw new Exception("Lost Db connection");
            // }
            ps2.executeUpdate();
            conn.commit();

        } catch (Exception ex) {
            conn.rollback();
            System.getLogger(demo3.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
