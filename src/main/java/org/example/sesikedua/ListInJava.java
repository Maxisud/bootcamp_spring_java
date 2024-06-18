package org.example.sesikedua;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
    public static void main(String[] args) {
        // inisialisasi list, pakai new object dari Array List
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(1);

        int elementPertama = numbers.get(0);
        int elemenKedua = numbers.get(1);

        // for
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("=========");

        // for each
        for (int number : numbers){
            System.out.println(number);
        }

        numbers.set(0, 12);
        // for each
        for (int number : numbers){
            System.out.println("Setelah diubah : " + number);
        }


    }
}
