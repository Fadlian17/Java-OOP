package com.alfansyah.oop.classified;

public class Ikan extends Hewan {
    public Ikan(String nama, int umur, String jenis) {
        super(nama, umur, jenis);
    }

    public Integer hitungBerat(int bobot) {
        return Math.multiplyExact(umur, bobot);
    }

    public Integer hitungBerat(int bobot, int kandunganAir) {
        return Math.multiplyExact(umur, bobot) - kandunganAir;
    }
}
