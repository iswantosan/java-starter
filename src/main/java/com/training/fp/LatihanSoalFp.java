package com.training.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LatihanSoalFp {
    
    public static void main(String[] args) {
        
        // admin : " Budi"
        // password : "Admin12345"

        BiFunction<String, String, String> initAdmin = 
        (admin, password) -> admin + ":" + password;

        Function<String, String> trimSpace =
        space -> space.trim();

        Function<String, String> toLowerCase =
        lower -> lower.toLowerCase();

        Function<String, String> replaceString =
        replace -> replace.replaceAll("a", "*");

        String result = initAdmin
        .andThen(trimSpace)
        .andThen(toLowerCase)
        .andThen(replaceString)
        .apply(" Budi", "Admin12345");

        System.out.println("result : " + result);
    }
}
