package org.example.sesiketiga;

public class MethodNonStatic {
    public static void main(String[] args) {
        // Panggil method non static harus pakai class yang method mau diambil
        MethodNonStatic methodNonStatic = new MethodNonStatic();

        String name = methodNonStatic.printNamaSaya("Ilham");

        System.out.println(name);

        methodNonStatic.hehe();

    }

    public String printNamaSaya(String name){
        return name;
    }

    public void hehe(){
        System.out.println(1);
    }
}
