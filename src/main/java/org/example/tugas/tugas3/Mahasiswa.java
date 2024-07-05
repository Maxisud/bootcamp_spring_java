package org.example.tugas.tugas3;

public class Mahasiswa {
    public String nama;
    public String jurusan;
    public int angkatan;

    public Mahasiswa(String newNama, String newJurusan, int newAngkatan){
        this.nama = newNama;
        this.jurusan = newJurusan;
        this.angkatan = newAngkatan;
    }

    private static void infoMahasiswa(Mahasiswa dataMhs) {
        System.out.println(dataMhs.nama);
        System.out.println(dataMhs.jurusan);
        System.out.println(dataMhs.angkatan);
    }

    public static void main(String[] args) {
        Mahasiswa dataMhs = new Mahasiswa("Dilla", "Sistem Komputer", 2014);

        infoMahasiswa(dataMhs);
    }
}
