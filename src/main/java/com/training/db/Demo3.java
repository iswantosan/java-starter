package com.training.db;

import java.sql.*;

public class Demo3 {

    public static void main(String[] args) throws SQLException {
        // transfer 200 dari account 1 ke account 2
        Connection con = DriverManager.getConnection(
                DbConfig.getUrl(),
                DbConfig.getUser(),
                DbConfig.getPass());
        try (con;
             PreparedStatement ps1 = con.prepareStatement(
                     "update accounts set balance = balance - 200 where id = 1"
             );
             PreparedStatement ps2 = con.prepareStatement(
                     "update accounts set balance = balance + 200 where id = 2"
             )) {

            con.setAutoCommit(false);

             ps1.executeUpdate();
             if (true) {
                 throw new RuntimeException("Lost db connetion");
             }
             ps2.executeUpdate();

             con.commit();

        } catch (Exception e) {
            con.rollback();
            System.getLogger(Demo3.class.getName()).log(
                    System.Logger.Level.ERROR,
                    (String) null,
                    e
            );
        }
    }
}
