package org.example.sesikedua;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main(String[] args) {

        /* Set tidak ada item duplikat (unique) */
        Set<String> names = new HashSet<>();

        names.add("Ilham");
        names.add("Intan");
        names.add("Sadila");
        names.add("Alifia");
        names.add("Syifa");
        names.add("Fitri");

        for (String name : names){
            System.out.println(name);
        }

        names.remove("Fitri");

        System.out.println("===========");

        for (String name : names){
            System.out.println(name);
        }

    }
}
