package com.training.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UsernamePassword {

    public static void main(String[] args) {
        // 1. combined = username + :": + password
        BiFunction<String, String, String> combine = (username, pswd) -> username + ":" + pswd;

        // 2. trim
        Function<String, String> trim = String::trim;

        // 3. lowercase
        Function<String, String> lowercase = String::toLowerCase;

        // 4. a --> *
        Function<String, String> encrypt  = (text) -> text.replaceAll("a", "*");

        // gabungin time
        String result = combine
                .andThen(trim)
                .andThen(lowercase)
                .andThen(encrypt)
                .apply(" Budi", "Admin12345 ");

        System.out.println(result);
    }
}
