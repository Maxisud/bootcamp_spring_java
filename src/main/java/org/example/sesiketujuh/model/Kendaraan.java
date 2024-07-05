package org.example.sesiketujuh.model;

public class Kendaraan {

    private Integer nomor_registrasi;
    private String merek;
    private String model_kendaraan;

    public Integer getNomor_registrasi() {
        return nomor_registrasi;
    }

    public void setNomor_registrasi(Integer nomor_registrasi) {
        this.nomor_registrasi = nomor_registrasi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel_kendaraan() {
        return model_kendaraan;
    }

    public void setModel_kendaraan(String model_kendaraan) {
        this.model_kendaraan = model_kendaraan;
    }
}
