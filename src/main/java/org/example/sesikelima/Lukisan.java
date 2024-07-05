package org.example.sesikelima;

public class Lukisan implements Menggambar{
    public static void main(String[] args) {
        Lukisan meth = new Lukisan();

        meth.hehe("mantap gais");
    }


    @Override
    public void hehe(String mantap) {
        System.out.println(mantap);
    }
}
