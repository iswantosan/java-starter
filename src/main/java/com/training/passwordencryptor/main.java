package com.training.passwordencryptor;

import java.util.function.BiFunction;

import java.util.function.Function;



public class main {



    //step 1 username:password

    public static void main (String[] args)
    {

    BiFunction<String, String, String> join = (username, password) -> username + ":" + password;


    //step 2 trim start and end
    Function <String, String> trim = (userPwd) -> userPwd.trim();

    //step 3 ubah to lower case
    Function <String, String> lower = (userPwd) -> userPwd.toLowerCase();

    //step 4 ganti huruf a jadi *
    Function <String, String> replaceA = (userPwd) -> userPwd.replaceAll("a", "*");


    String hasil = join.andThen(trim).andThen(lower).andThen(lower).andThen(replaceA).apply("Budi", "Admin12345");
    
        System.out.println("hasil: " + hasil);

}


}
