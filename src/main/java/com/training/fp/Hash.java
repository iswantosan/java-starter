package com.training.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Hash {
    public static void main(String[] args) {
//        diketahui
//        username: "Budi"
//        password: "Admin12345 "
//
//        buatlah pipeline hashing password dengan urutan sbb menggunakan lambda
//
//        Step 1
//        Gabungkan username dan password dengan tanda :
//        rumus:
//        combined = username + ":" + password
        BiFunction<String, String, String> combine = (username, password) -> username + ":" + password;

//        Step 2
//        Hilangkan spasi di awal dan akhir string menggunakan trim
        Function<String, String> trim = (string) -> string.trim();

//        Step 3
//        Ubah semua huruf menjadi lowercase
        Function<String, String> lowerCase = (string) -> string.toLowerCase();

//        Step 4
//        Ganti semua huruf a menjadi karakter *
        Function<String, String> hash = (string) -> string.replaceAll("a", "*");

        String result = combine.andThen(trim).andThen(lowerCase).andThen(hash).apply("Bangun", "Password");

        System.out.println(result);
    }
}
