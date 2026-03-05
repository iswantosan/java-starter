package com.training.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UsernameManipulation {

	public static void main(String[] args) {
		String username = " Budi";
		String password = "Admin12345 ";
		
		//step 1 
		BiFunction<String, String, String> gabungan = (uname, pwod) -> uname + ":" + pwod;
		
		//step 2
		Function<String,String> ilangSpasi = (word) -> word.trim();
		
		//step 3
		Function<String,String> lowerCase = (word) -> word.toLowerCase();
		
		//step 4
		Function<String,String> maskingBintang = (word) -> word.replaceAll(".", "*"); 
		
		String endResult = gabungan.andThen(ilangSpasi).andThen(lowerCase).andThen(maskingBintang).apply(username, password);
		
		System.out.println("Hasil Akhirnya : " + endResult);
		
	}

}
