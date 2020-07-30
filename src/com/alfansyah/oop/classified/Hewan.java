package com.alfansyah.oop.classified;

public class Hewan {

    public String nama="",jenis="";
    public int umur;

    public Hewan(String nama,int umur,String jenis) {
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


    public void profileHewan(){
        System.out.println("Nama Hewan: "+nama+" Jenis Hewan: "+jenis+" Umur Hewan: "+umur);
    }

}
