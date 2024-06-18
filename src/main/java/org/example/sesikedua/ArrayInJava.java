package org.example.sesikedua;

public class ArrayInJava {
    public static void main(String[] args) {
        /**
         * ARRAY
         */

        // 1.1 Menentukan Ukuran array dari awal
        int[] numbers = new int[3];

        // pakai kata kunci new untuk assign new object

        numbers[0] = 1;
        numbers[1] = 13;
        numbers[2] = 11;

        // 1.2 Menetukan array sudah duluan

        String[] names = {"abi", "budi", "michelle"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("====================");

        for (String name : names){
            System.out.println(name);
        }
    }
}
