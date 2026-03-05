package com.training.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HashingPassword {
    public static void main(String[] args) {
        // diketahui
        // username: " Budi"
        // password: "Admin12345 "

        // buatlah pipeline hashing password dengan urutan sbb
        // step 1 -> gabungkan username dan password dengan tanda :
        BiFunction<String, String, String> combined = (username, password) -> username + ":" + password;

        // step 2 -> hilangkan spasi di awal dan akhir string menggunakan trim
        Function<String, String> trimSpace = (combinedText) -> combinedText.trim();

        // step 3 -> ubah semua huruf menjadi lowercase
        Function<String, String> toLower = (trimSpaceText) -> trimSpaceText.toLowerCase();

        // step 4 -> ganti semua huruf a menjadi karakter *
        Function<String, String> changes = (toLowerText) -> toLowerText.replace("a", "*");

        String result = combined
                .andThen(trimSpace)
                .andThen(toLower)
                .andThen(changes)
                .apply(" Budi", "Admin12345 ");
        
        System.err.println(result);

        
    }
}
