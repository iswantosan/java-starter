package com.training.profiling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GcDemo {

    // ditahan lama supaya masuk Old (nanti kita buang juga biar kelihatan)
    private static final List<byte[]> longLived = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("PID = " + ProcessHandle.current().pid());
        System.out.println("Start... attach jstat/VisualVM now.\n");

        // tunggu sebentar biar kamu sempat attach tool
        Thread.sleep(3000);

        for (int round = 1; round <= 30; round++) {

            // 1) Banyak object kecil/menengah yang cepat mati (Eden penuh -> Minor GC)
            for (int i = 0; i < 20_000; i++) {
                byte[] shortLived = new byte[1024]; // 1 KB
                // tidak disimpan kemana2 => cepat jadi garbage
            }

            // 2) Setiap beberapa round, simpan object besar supaya survive dan naik umur
            if (round % 3 == 0) {
                longLived.add(new byte[2 * 1024 * 1024]); // 2 MB
                System.out.println("Round " + round + " keep longLived size=" + longLived.size());
            }

            // 3) Kadang buang sebagian long-lived supaya nanti Old bisa berkurang
            if (round == 20) {
                System.out.println("Clearing longLived references...");
                longLived.clear();
            }

            // Biar alokasi terasa bertahap
            Thread.sleep(200);
        }

        System.out.println("\nDone. Press ENTER to exit...");
        new Scanner(System.in).nextLine();
    }
}
