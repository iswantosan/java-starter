package com.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo3 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(DbConfig.getUrl(), DbConfig.getUser(), DbConfig.getPass());
        try (PreparedStatement ps = con.prepareStatement("update accounts set balance = balance - 200 where id = 1");
                PreparedStatement ps2 = con
                        .prepareStatement("update accounts set balance = balance + 200 where id = 2")) {
            con.setAutoCommit(false);
            ps.executeUpdate();
            // ini untuk test kalo ditengah2 proses transaksi terjadi error, maka semua
            // perubahan yang sudah dilakukan akan dibatalkan
            // if (true) {
            // throw new RuntimeException("Lost db connection");
            // }
            ps2.executeUpdate();
            con.commit();

        } catch (Exception ex) {
            con.rollback();
            System.getLogger(Demo3.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } finally {
            con.close();
        }
    }
}
