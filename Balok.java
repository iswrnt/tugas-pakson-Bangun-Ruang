package com.mycompany.bangun_ruang_pakson;

public class Balok extends Bangun_Ruang_Pakson {
  
    double p;
    double l;
    double t;
    
    double volumeBalok(){
        double volumeBalok = (double) (p*l*t);
        System.out.println("Volume Balok: "+ volumeBalok);
        return volumeBalok;
    }
    double luasPermukaanBalok(){
        double luasPermukaanBalok = (double) (2*(p*l)+(p*t)+(l*t));
        System.out.println("Luas Permukaan Balok: "+ luasPermukaanBalok);
        return luasPermukaanBalok;
    }
}
