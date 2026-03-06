package com.training.db;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.zaxxer.hikari.HikariDataSource;

public class Demo2 {
    public static void main(String[] args) {
        // create connection pool
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(DbConfig.getUrl());
        ds.setUsername(DbConfig.getUser());
        ds.setPassword(DbConfig.getPass());
        ds.setMaximumPoolSize(DbConfig.getMaxPoolSize());

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                try (Connection con = ds.getConnection()) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " got connection: " + con);
                    Thread.sleep(1000); // Simulate some work with the connection
                } catch (Exception ex) {
                    System.getLogger(Demo2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            });
        }
        executor.shutdown();
    }
}
