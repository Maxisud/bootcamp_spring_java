package org.example.sesipertama;

public class Looping {
    public static void main(String[] args) {
        int count = 2;

        // while

        while(count <=5) {
           // System.out.println("Print ini: " + count);
            count++;
        }

        // do while

        int number = 10; //inisialisasi nilai awal

        do {
           // System.out.println("Number: " + number);
            number--;
        } while (number >= 0);

        //for loop


        for (int i = 0; i <= 5; i++){
           // System.out.println("Print ini: " + i);
        }

        // for each

        String[] names = {"ilham", "Budi", "Lukman"};

        for (String name : names){
           // System.out.println(name);
        }

        // Mengetahui Ukuran Array
        int ukuranArray = names.length;

        for (int i = 0; i < ukuranArray; i++){
            System.out.println("nama: " + names[i]);
        }
    }
}
