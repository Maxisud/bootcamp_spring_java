package org.example.sesikelima;

public class Kucing extends Animal{
    public static void main(String[] args) {
        // Kucing miaw = new Kucing();
        // System.out.println(miaw.tidur());
        Kucing miaw = new Kucing();
        miaw.tidur();
    }

    // jika ada nama method yang sama di class induk / super class
    // @Override
    // public void tidur(){
    //     System.out.println("Miawww");
    // }
}
