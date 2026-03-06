package com.training.db;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {

    public static void main(String[] args) {
        // Create pool nya
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(DbConfig.getUrl());
        ds.setUsername(DbConfig.getUser());
        ds.setPassword(DbConfig.getPass());
        ds.setMaximumPoolSize(DbConfig.getMaxPoolSize());

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            executorService.submit(() -> {
                try (Connection con = ds.getConnection()) {

                    System.out.println("Thread " + Thread.currentThread()
                            .getName() + " got connection: " + con);

                    Thread.sleep(200);

                } catch (Exception ex) {
                    System.getLogger(Demo2.class.getName()).log(
                            System.Logger.Level.ERROR,
                            (String) null,
                            ex
                    );
                }
            });
        }
    }
}
