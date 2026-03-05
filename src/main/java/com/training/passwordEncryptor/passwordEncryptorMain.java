package com.training.passwordEncryptor;

import java.util.function.BiFunction;
import java.util.function.Function;

public class passwordEncryptorMain {
    public static void main(String[] args) {
        
        String username = " Budi";
        String password = "Admin12345 ";

        BiFunction<String,String,String> combineFunction = (a,b) -> a + ":" + b;

        Function<String,String> trimFunction = res -> res.trim();

        Function<String,String> lowerFunction = res -> res.toLowerCase();

        Function<String,String> encryptFunction = res -> res.replace("a","*");

        String result = combineFunction
        .andThen(trimFunction)
        .andThen(lowerFunction)
        .andThen(encryptFunction)
        .apply(username,password);

        System.out.println(result);
    }
}