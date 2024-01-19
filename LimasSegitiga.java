package com.mycompany.bangun_ruang_pakson;

public class LimasSegitiga extends Bangun_Ruang_Pakson {
    double la;
    double tl;
    
    double volumeLimasSegitiga(){
        double volumeLimasSegitiga = (double) (la*tl/3);
        System.out.println("Volume Limas Segitiga: "+ volumeLimasSegitiga);
        return volumeLimasSegitiga;
    }
    double luasPermukaanLimas(){
        double luasPermukaanLimas = (double) (4*la*tl/2);
        System.out.println("Luas Permukaan Limas Segitiga: "+ luasPermukaanLimas);
        return luasPermukaanLimas;
    }
}
