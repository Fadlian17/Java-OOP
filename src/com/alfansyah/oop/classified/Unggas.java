package com.alfansyah.oop.classified;

public class Unggas extends Hewan{

    public int umur;

    public Unggas(String nama, int umur, String jenis) {
        super(nama, umur, jenis);
    }


    @Override
    public String statusHewan(){
        if(umur<1){
            return "belum siap ternak";
        }else{
            return "siap ternak";
        }
    }
}
