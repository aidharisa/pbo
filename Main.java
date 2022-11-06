package com.sesi6;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    

    void display() {
        
        System.out.println("Nama  : Risa Aidha");
        System.out.println("Nim   : 20210040026");
        System.out.println("Kelas : TI21C");
        System.out.println("TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 6");

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.display();


                Kerucut kerucut = new Kerucut();
                kerucut.display();
                Balok balok = new Balok();
                balok.display();
            

                Bola bola = new Bola();
                bola.display();
            
            }
        }

    

