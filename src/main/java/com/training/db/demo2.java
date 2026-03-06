package com.training.db;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.zaxxer.hikari.HikariDataSource;


public class demo2 {
    public static void main(String[] args)  {
        // create pool nya
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(DbConfig.getUrl());
        ds.setUsername(DbConfig.getUser());
        ds.setPassword(DbConfig.getPass());
        ds.setMaximumPoolSize(DbConfig.getMaxPoolSize());
        
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int j = 0; j < 10; j++) {
            executor.submit(() -> {
                try(Connection conn = ds.getConnection()) {
                    System.out.println("Thread: "+ Thread.currentThread().getName() + " got connection: "+ conn);
                    Thread.sleep(1000); // Simulate work
                } catch (Exception ex) {
                    System.getLogger(demo2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            });
        }
        executor.shutdown();
    }
}
