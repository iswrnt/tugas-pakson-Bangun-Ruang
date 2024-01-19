package com.mycompany.bangun_ruang_pakson;

public class Bola extends Bangun_Ruang_Pakson {
    double r;
    
    double volume(){
        double volume = (double) (4*Math.PI*r*r*r/3);
        System.out.println("Volume Bola: "+ volume);
        return volume;       
    }
    double luasPermukaan(){
        double luasPermukaan = (double) (4*Math.PI*r*r);
        System.out.println("Luas Permukaan Bola: "+ luasPermukaan);
        return luasPermukaan;
    }
}  