package org.example.tugas.tugas4.model;


public class RegisterRequest {

    private String nama;

    private Long nomorHp;

    private String ttl;

    private String email;

    private String password;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(Long nomorHp) {
        this.nomorHp = nomorHp;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
