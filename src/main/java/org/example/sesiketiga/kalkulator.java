package org.example.sesiketiga;

public class kalkulator {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;

        System.out.println("Hasil Penjumlahan antara nomor %d dan %d = ".formatted(angka1, angka2) + penjumlahan(angka1, angka2));
        System.out.println("Hasil Perkalian antara nomor %d dan %d = ".formatted(angka1, angka2) + perkalian(angka1, angka2));
    }

    public static int penjumlahan(Integer a, Integer b) {
        return a + b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }
}
