package org.example.sesiketiga;

public class Kalkulator {
    public static void main(String[] args) {
        Kalkulator kalk = new Kalkulator();

        System.out.println(kalk.penjumlahan(2,3));
        System.out.println(kalk.perkalian(2,3));
    }

    public int penjumlahan(Integer a, Integer b) {
        return a + b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }


    // private static final String NAME = "YOUR NAME";
    //
    // public static void main(String[] args) {
    //     String myName = printMyName(null);
    //     System.out.print("Output: " + myName);
    // }
    //
    // public static String printMyName(String name) {
    //     if (name.isEmpty() || name.isBlank()) {
    //         return NAME;
    //     } else {
    //         return name;
    //     }
    // }
}