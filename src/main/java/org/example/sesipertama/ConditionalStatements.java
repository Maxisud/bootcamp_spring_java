package org.example.sesipertama;

public class ConditionalStatements {
    public static void main(String[] args) {
        int angka = 700;

        // if else if else

        if (angka == 1000){
            System.out.println("ini angka 1000");
        } else {
            System.out.println("bukan 1000");
        }

        if (angka == 1000){
            System.out.println("ini angka 1000");
        } else if (angka == 900){
            System.out.println("ini angka 900");
        } else {
            System.out.println("bukan angka 900 maupun 1000");
        }

        // Ternery Operator
        // Rumus : tipe_data nama_variable = kondisi ? keluaran true : keluaran false

        String hasil =  angka > 100 ? "ini lebih dari 100" : "ini kurang dari 100";

        System.out.println(hasil);

        // Switch Case
        char iniChar = 'B';
        switch (iniChar){
            case 'A' :
                System.out.println("ini Huruf A");
                break;
            case 'B' :
                System.out.println("ini huruf B");
                break;
            default:
                System.out.println("ini default");
        }
    }
}
