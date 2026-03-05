package com.training.functional;

import java.util.List;

public class CollectionStream {
  public static void main(String[] args) {
    List<Integer> transactions = List.of(500, 1200, 300, 2000, 1500, 700, 1000);
    int result = transactions.stream()
        .filter(x -> x >= 1000)
        .distinct()
        .map(x -> x + 50)
        .max((x, y) -> x.compareTo(y))
        .orElse(0);
    System.out.println("Result " + result);

  }
}
