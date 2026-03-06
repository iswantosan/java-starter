package com.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo3 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass());
        try (con; PreparedStatement ps1 = con.prepareStatement(
                "update accounts set balance = balance - 200 where id = 1"
        ); PreparedStatement ps2 = con.prepareStatement(
                "update accounts set balance = balance + 200 where id = 2"
        );) {
            con.setAutoCommit(false);
            ps1.executeUpdate();
            // if (true) {
            //     throw new RuntimeException("Lost db connecntion");
            // }
            ps2.executeUpdate();
            con.commit();
        } catch (Exception ex) {
            // TODO: handle exception
            System.getLogger(demo3.class.getName()).log(System.Logger.Level.ERROR, ex);
            con.rollback();
        }
    }
}
