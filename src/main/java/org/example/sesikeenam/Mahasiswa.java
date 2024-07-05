package org.example.sesikeenam;

public class Mahasiswa {

    //nama, jurusan, dan angkatan itu namanya field
    private String nama;

    private String jurusan;

    private int angkatan;


    // kalau mau getter setter otomatis, bisa pencet alt + insert di intelij

    // Getter = mengambil nilai


    // this itu untuk merujuk ke kelas sendiri
    public String getNama() {
        return this.nama = nama;
    }

    //Setter = untuk assign atau mengubah nilai
    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }


    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }


    //Constructor Default

    public Mahasiswa(){

    }

    //Constructor Parameterized (pake overloading, cek materi sebelumnya)
    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public Mahasiswa(String nama, String jurusan, int angkatan){
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }
}
