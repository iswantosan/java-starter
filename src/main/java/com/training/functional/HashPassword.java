package com.training.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HashPassword {
  public static void main(String[] args) {
    String username = " Budi";
    String password = "Admin12345 ";

    BiFunction<String, String, String> concateString = (a, b) -> a + ":" + b;
    Function<String, String> trimString = (a) -> a.trim();
    Function<String, String> toLowerCaseString = (a) -> a.toLowerCase();
    Function<String, String> replaceCharacter = (a) -> a.replaceAll(".", "*");

    String output = concateString
      .andThen(trimString)
      .andThen(toLowerCaseString)
      .andThen(replaceCharacter)
      .apply(username, password);

      System.out.println(output);
  }
}
