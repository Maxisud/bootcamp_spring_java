package org.example.sesikedua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLamdaDanJavaStream {
    public static void main(String[] args) {
        List<String> buah = Arrays.asList("Pepaya", "Mangga", "Pisang");


        // JAVA STREAM
        List<String> buahSetelahDiubah = new ArrayList<>();

        buahSetelahDiubah = buah.stream().map(String::toUpperCase).toList();

        // buahSetelahDiubah.forEach(System.out::println);

        // JAVA LAMBDA

        buahSetelahDiubah.forEach((value)->{
            System.out.println(value);
        });

    }
}
