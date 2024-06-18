package org.example.sesipertama;

public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 8;
        int d = 5;

         /**
          * Operator
          * Biasa */

        // Penjumlahan
        int hasilPenjumlahan = a + b;
        // System.out.println(hasilPenjumlahan);

        // Pengurangan
        int hasilPengurangan = b - a;
        // System.out.println(hasilPengurangan);

        // Perkalian
        int hasilPerkalian = a * b;
        // System.out.println(hasilPerkalian);

        // Pembagian
        int hasilPembagian = c / a;
        // System.out.println(hasilPembagian);

        // Modulus
        int hasilModulus = d % a;
        // System.out.println(hasilModulus);

        /**
         * OPERATOR RELASIONAL
         * - Digunakan untuk membandingkan dua nilai
         * - Karena digunakan untuk perbandingan, maka hasil perbandingannya antara bernilai BENAR atau SALAH
         */

        // Sama Dengan `==`
        boolean isSamaDengan = (a == b);
        // System.out.println(isSamaDengan);

        // Tidak Sama Dengan `==`
        boolean isTidakSamaDengan = (a != b);
        // System.out.println(isTidakSamaDengan);

        // Lebih Besar `>`
        boolean isLebihBesar = (a > b);
        // System.out.println(isLebihBesar);

        // Lebih Kecil `<`
        boolean isLebihKecil = (a < b);
        // System.out.println(isLebihKecil);

        // Lebih Besar atau Sama Dengan `>=`
        boolean isLebihBesarAtauSamaDengan = (a >= b);
        // System.out.println(isLebihBesarAtauSamaDengan);

        // Lebih Kecil atau Sama Dengan `<=`
        boolean isLebihKecilAtauSamaDengan = (a <= b);
        // System.out.println(isLebihKecilAtauSamaDengan);

        /**
         * OPERATOR LOGIKA
         */

        boolean isA = true;
        boolean isB = false;

        // Logika 'Dan/AND' (&&)
        boolean isAnd = isA && isB;
        System.out.println(isAnd);

        // Logika 'Atau/OR' (||)
        boolean isOr = isA || isB;
        System.out.println(isOr);


        /**
         * OPERATOR INCREMENT (penambahan)
         * - Digunakan untuk menambah nilai variabel sebanyak 1
         */

        int newAngka = 10;
        newAngka++;
        // System.out.println(newAngka);

        /**
         * OPERATOR DECREMENT (pengurangan)
         * - Digunakan untuk menambah nilai variabel sebanyak 1
         */
        newAngka--;
        // System.out.println(newAngka);

        /**
         * OPERATOR TERNARY (KONDISIONAL)
         *
         * RUMUS: hasil = condition ? valueIfTrue : valueIfElse
         */

        int hasilTernaryOperator = (a > b) ? c : d;
        System.out.println("Hasil Ternary : " + hasilTernaryOperator);

    }
}
