package com.alfansyah.oop.classified;

public class Jalankan {

    public static void main(String[] args) {
        // write your code here

        var reptil = new Hewan("buaya",2,"vertebrata");
        var unggas = new Hewan("merpati",1,"vertebrata");

        System.out.println(reptil.profileHewan());
        System.out.println(unggas.profileHewan());
        System.out.println("\n");

        System.out.println("==Unggas==\n");
        var murai = new Unggas("murai batu",6,"vertebrata");
        murai.setNama("murai batu");
        murai.setUmur(6);
        murai.setJenis("vertebrata");
        System.out.println(murai.profileHewan());
        System.out.println("status : "+murai.statusHewan());

        System.out.println("==Ikan==\n");
        var tenggiri = new Ikan("tenggiri laut",3,"vertebrata");
        System.out.println(tenggiri.profileHewan());
        System.out.println("status : "+tenggiri.statusHewan());
        System.out.println("berat tanpa kandungan air( hanya bobot):"+tenggiri.hitungBerat(10));
        System.out.println("berat dengan kandungan air:"+tenggiri.hitungBerat(10,5));
    }
}
