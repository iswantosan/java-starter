package com.training.jdbc;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.db.DbConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Demo2 {
    public static void main(String[] args) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(DbConfig.getUrl());
        ds.setUsername(DbConfig.getUser());
        ds.setPassword(DbConfig.getPass());
        ds.setMaximumPoolSize(DbConfig.getMaxPoolSize());

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                try (Connection connection = ds.getConnection()) {
                    System.out.println("thread : " + Thread.currentThread().getName() + " got Connection : " + connection
                // System.identityHashCode(connection)
            );
            // Thread.sleep(3000);
                } catch (Exception ex){
                    System.getLogger(Demo2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            });
        }
    }
}
