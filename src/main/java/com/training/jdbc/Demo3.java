package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.db.DbConfig;

public class Demo3 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(DbConfig.getUrl(),
                DbConfig.getUser(), DbConfig.getPass());
                
        try (PreparedStatement statement = con.prepareStatement(
                        "update accounts set balance = balance - 200 where id = 1");
                PreparedStatement statement2 = con.prepareStatement(
                        "update accounts set balance = balance - 200 where id = 2")) {
            con.setAutoCommit(false);
            statement.executeUpdate();
            if (true) {
                throw new RuntimeException("Lost db connection");
            }
            statement2.executeUpdate();
            con.commit();

        } catch (Exception ex) {
            con.rollback();
            System.getLogger(Demo3.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
