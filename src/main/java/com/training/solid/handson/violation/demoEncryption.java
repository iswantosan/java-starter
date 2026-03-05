package com.training.solid.handson.violation;

import java.util.function.BiFunction;
import java.util.function.Function;

public class demoEncryption {

    public static void main(String[] args) {
        
        // 1. gabungkan username dengan password menggunaakn tanda :

        BiFunction<String,String,String>
        comnbineUserPassword = (Username,Password) -> Username + ":" + Password;

        // 2. hilangkan spasi diawal dan diakhir

        Function<String,String>
        excludeSpace = (excludeSpaces) -> excludeSpaces.trim();

        // 3. Ubah semua menjadi lowercase

        Function<String,String>
        lowerText = (lowerTextCombined) -> lowerTextCombined.toLowerCase();

        // 4. ganti semua a menjadi *

        Function<String,String>
        encryptText = (encryptTextCombined) -> encryptTextCombined.replaceAll("a", "*");

        String result = comnbineUserPassword
        .andThen(excludeSpace)
        .andThen(lowerText)
        .andThen(encryptText)
        .apply("hamdhany abdhi", "hamdhany482@gmail.com");

        System.out.println("Hasil "+ result);

    }
    
}
