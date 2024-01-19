package com.mycompany.bangun_ruang_pakson;

public class Tabung extends Bangun_Ruang_Pakson {
    double r;
    double t;
    
    double volumeTabung(){
        double volumeTabung = (double) (Math.PI*r*r*t);
        System.out.println("Volume Tabung: "+ volumeTabung);
        return volumeTabung;
    }
    double luasPermukaanTabung(){
        double luasPermukaanTabung = (double) (2*Math.PI*r*(r+t));
        System.out.println("Luas Permukaan Tabung: "+ luasPermukaanTabung);
        return luasPermukaanTabung;
    }
}
