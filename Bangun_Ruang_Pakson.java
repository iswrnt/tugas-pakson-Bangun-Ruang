package com.mycompany.bangun_ruang_pakson;

public class Bangun_Ruang_Pakson {

    public static void main(String[] args) {
        
        Bola bola = new Bola();
        bola.r = 7;
        
        Balok balok = new Balok();
        balok.p = 5;
        balok.l = 3;
        balok.t = 7;
        
        Tabung tabung = new Tabung();
        tabung.r = 6;
        tabung.t = 5;
        
        LimasSegitiga limas = new LimasSegitiga();
        limas.la = 12;
        limas.tl = 15;
        
        limas.volumeLimasSegitiga();
        limas.luasPermukaanLimas();
        System.out.println("");
        tabung.volumeTabung();
        tabung.luasPermukaanTabung();
        System.out.println("");
        balok.volumeBalok();
        balok.luasPermukaanBalok();
        System.out.println("");
        bola.volume();
        bola.luasPermukaan();
      
    }
}
