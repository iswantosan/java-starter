
import java.util.function.BiFunction;
import java.util.function.Function;



public class demo2 {

    public static void main(String[] args) {
        // 1. bunga = saldo x interestRate
        BiFunction<Double,Double,Double>
        calculateBunga = (saldo,interestRate) -> saldo * interestRate;

        // 2. saldo baru = saldo + bunga
        Function<Double, Double>
        calculateSaldo = (Interest) -> 1000 + Interest;

        // 3. saldo setelah pajak = saldoBaru x 0.9
        Function<Double,Double>
        calculateSaldoAfterTax = (saldo) -> saldo * 0.9;

        // 4. saldoAkhir = saldoSetelahPajak - 5
        Function<Double,Double>
        calculateSaldoAkhir = (saldo) -> saldo - 5;

        double result = calculateBunga
        .andThen(calculateSaldo)
        .andThen(calculateSaldoAfterTax)
        .andThen(calculateSaldoAkhir)
        .apply(1000.0, 0.5);

        System.out.println("Saldo Akhir " + result);
    }
}
