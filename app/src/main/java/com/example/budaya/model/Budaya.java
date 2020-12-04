package com.example.budaya.model;

public class Budaya {
    private String jenis;
    private String nama;
    private String asal;
    private String deskripsi;
    private int gambar;

    public Budaya(String jenis, String nama, String asal, String deskripsi, int gambar) {
        this.jenis = jenis;
        this.nama = nama;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() { return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {

        this.gambar = gambar;
    }
}
