package com.alfansyah.oop.classified;

public class Jalankan {

    public static void main(String[] args) {
        // write your code here

        var reptil = new Hewan("buaya",2,"vertebrata");
        var unggas = new Hewan("merpati",1,"vertebrata");

        reptil.profileHewan();
        unggas.profileHewan();
    }
}
