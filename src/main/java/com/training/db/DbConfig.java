package com.training.db;

import java.io.InputStream;
import java.util.Properties;

public class DbConfig {

    private static final Properties props = new Properties();

    static {
        try (InputStream input =
                DbConfig.class
                        .getClassLoader()
                        .getResourceAsStream("application.properties")) {

            if (input == null) {
                throw new RuntimeException("application.properties not found");
            }

            props.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config", e);
        }
    }

    public static String getUrl() {
        return props.getProperty("db.url");
    }

    public static String getUser() {
        return props.getProperty("db.user");
    }

    public static String getPass() {
        return props.getProperty("db.pass");
    }

    public static int getMaxPoolSize() {
        return Integer.parseInt(props.getProperty("db.pool.maxSize"));
    }

    public static int getMinIdle() {
        return Integer.parseInt(props.getProperty("db.pool.minIdle"));
    }

    public static long getConnectionTimeout() {
        return Long.parseLong(props.getProperty("db.pool.connectionTimeout"));
    }

    public static long getIdleTimeout() {
        return Long.parseLong(props.getProperty("db.pool.idleTimeout"));
    }

    public static long getMaxLifetime() {
        return Long.parseLong(props.getProperty("db.pool.maxLifetime"));
    }
}