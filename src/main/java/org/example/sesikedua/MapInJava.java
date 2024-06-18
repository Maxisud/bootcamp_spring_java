package org.example.sesikedua;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
    public static void main(String[] args) {
        // inisialisasi object map baru
        Map<Integer, String> buah = new HashMap<>();
        buah.put(1, "Pepaya");
        buah.put(2, "Mangga");
        buah.put(3, "Pisang");

        String elemenKetiga = buah.get(3);

        System.out.println("Buah Ketiga : " + elemenKetiga);

        // cek apakah ada value di map
        if (buah.containsValue("Pepaya")){
            System.out.println("Ada!");
        } else {
            System.out.println("TIdak ada");
        }

        for (int key : buah.keySet()){
            System.out.println("Key for each keyset : " + key + " " + "valuenya : " + buah.get(key));
        }

        buah.forEach((key, value) -> {
            System.out.println("Key for each keyset : " + key + " " + "valuenya : " + buah.get(key));
        });


    }
}
