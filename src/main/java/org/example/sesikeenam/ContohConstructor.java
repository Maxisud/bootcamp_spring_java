package org.example.sesikeenam;

public class ContohConstructor {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("ilham");

        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getJurusan());
        System.out.println(mahasiswa.getAngkatan());
    }
}
