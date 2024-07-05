package org.example.tugas.tugas4.services.implementation;

import org.example.tugas.tugas4.model.RegisterRequest;
import org.example.tugas.tugas4.services.RegisterService;

import java.util.Scanner;

public class RegisterServiceImpl implements RegisterService {


    @Override
    public void register(RegisterRequest register) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang di Aplikasi Pemesanan Tiket");

        System.out.println("==================================================");
        System.out.println("Masukan Nama Anda: ");
        String Nama = scan.nextLine();
        register.setNama(Nama);
        System.out.println("Masukan No hp Anda: ");
        Long noHp = scan.nextLong();
        scan.nextLine(); // saya masukin ini karena kalau pakai nextLong, jadi keskip kalau tanpa next line dulu (ada \n nya), liat di stackoverflow
        register.setNomorHp(noHp);
        System.out.println("Masukan tempat tanggal lahir Anda: ");
        String ttl = scan.nextLine();
        register.setTtl(ttl);
        System.out.println("Masukan Email anda: ");
        String email = scan.nextLine();
        register.setEmail(email);
        System.out.println("Masukan Password Anda: ");
        String password = scan.nextLine();
        register.setPassword(password);
        System.out.println("Nama Anda: " + register.getNama());
        System.out.println("Nomor HP Anda: " + register.getNomorHp());
        System.out.println("Tempat Tanggal Lahir Anda: " + register.getTtl());
        System.out.println("Email Anda: " + register.getEmail());
        System.out.println("Password Anda: " + register.getPassword());
    }

    public static void main(String[] args) {
        RegisterServiceImpl registerService = new RegisterServiceImpl();
        RegisterRequest registerRequest = new RegisterRequest();

        registerService.register(registerRequest);

    }
}
