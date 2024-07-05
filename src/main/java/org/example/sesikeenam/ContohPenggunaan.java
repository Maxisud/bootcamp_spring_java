package org.example.sesikeenam;

public class ContohPenggunaan {

    int number = 0;

    Integer angka = null; //object atau tipe data bukan primitiv bisa diiniate dengan null


    public static void main(String[] args) {
        String nama = "ilham";

        if (null != nama) {
            nama = "Zakariya"; //mengubah nilai
            // System.out.println("Nama: " + nama);
        }

        //Akses class mahasiswa

        Mahasiswa mahasiswa = new Mahasiswa();

        //Mengambil Nilai

        String namaMahasiswa = mahasiswa.getNama();
        Integer angkatanMahasiswa = mahasiswa.getAngkatan();

        // System.out.println(angkatanMahasiswa);

        //Menetapkan nilai awal

        mahasiswa.setNama("Ilham Zakariya");
        mahasiswa.setJurusan("TI");
        mahasiswa.setAngkatan(2017);

        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getJurusan());
        System.out.println(mahasiswa.getAngkatan());
    }
}
