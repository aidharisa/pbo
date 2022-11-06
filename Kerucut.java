package com.sesi6;
import java.util.Scanner;

public class Kerucut extends BangunRuang {
    Scanner input = new Scanner(System.in);
    int sisi; 
    int tinggi;
    int r;
    double phi = 3.14;
    double LuasPermukaan ;
    double Volume ;


    @Override
    public double LuasPermukaan() {
            System.out.println("MENGHITUNG LUAS PERMUKAAN KERUCUT");
            System.out.print("Masukan Sisi : ");
            sisi =input.nextInt();
            System.out.print("Masukan Tinggi : ");
            tinggi =input.nextInt();
            System.out.print("Masukan Jari-Jari : ");
            r =input.nextInt();
            LuasPermukaan =( phi * ( r * r)) + (phi * sisi * r);
            System.out.println("Luas Permukaan Kerucut Tersebut Adalah : "+LuasPermukaan);
            return LuasPermukaan;
    }

    @Override
    public double Volume () {
            System.out.println("MENGHITUNG VOLUME KERUCUT");
            System.out.print("Masukan Sisi : ");
            sisi = input.nextInt();
            System.out.print("Masukan Tinggi : ");
            tinggi =input.nextInt();
            System.out.print("Masukan Jari-jari : ");
            r =input.nextInt();
            Volume =0.3 * phi * (r * r) * tinggi;
            System.out.println("Volume Kerucut Tersebut Adalah : "+Volume);
            return Volume;
    }

    @Override
    public void display() {
        LuasPermukaan();
        Volume();
        
    }

}