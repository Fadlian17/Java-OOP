package com.alfansyah.oop.classified;

public class Hewan {

    public String nama = "", jenis = "";
    public int umur;

    public Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }


    public String profileHewan() {

        return ("Nama Hewan: " + nama + "\n Jenis Hewan: " + jenis + "\n Umur Hewan: " + umur);
    }

    //2. OOP IMplementation

    public String statusHewan() {
        try {
            if (umur < 1) {
                return "belum siap diternakan";
            } else if (umur >=1 && umur<= 4) {
                return "siap diternakan";
            } else {
                return "hewan sudah tua";
            }
        } catch (Exception e) {
            return e.getMessage();
        }

    }

}
