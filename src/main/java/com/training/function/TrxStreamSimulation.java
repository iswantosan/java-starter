package com.training.function;

import java.util.List;

public class TrxStreamSimulation {

	public static void main(String[] args) {
		List<Integer> transactions = List.of(500,1200,300,2000,1500,700,1800);
		
		//ambil hanya transaksi diatas 1000
		Integer trxNew = transactions.stream()
		.filter((transaction) -> transaction >= 1000)
		.distinct()
		.map((trx) -> trx + 50)
		.max(Integer::compare)
		.orElse(0);
		
		System.out.println("hasil akhire " + trxNew);
	}

}
