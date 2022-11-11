
package com.sesi5;

import java.util.Scanner;

public class Main {

    void display() {
        System.out.println("Nama  : Risa Aidha");
        System.out.println("Nim   : 20210040026");
        System.out.println("Kelas : TI21C");

        System.out.println(" TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 5 ");


    }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        Main main = new Main();
        main.display();
        for (int i = 0; i <= 99; i++) {

            System.out.println("1. MAHASISWA");
            System.out.println("2. DOSEN");
            System.out.print("Masukan pilihan data yang ingin ditampilkan : ");
            pilih = input.nextInt();

            if (pilih == 1) {

                System.out.println("\n MAHASISWA \n");
                Mahasiswa mahasiswa1 = new Mahasiswa("Jisoo", "202100256", "Teknik Informatika", 3.85);
                mahasiswa1.display();
                Mahasiswa mahasiswa2 = new Mahasiswa("Jennie", "2021002554", "Teknik Informatika", 3.48);
                mahasiswa2.display();
                Mahasiswa mahasiswa3 = new Mahasiswa("Lalisa", "2021057845", "Teknik Informatika", 4.00);
                mahasiswa3.display();
            } else if (pilih == 2) {

                System.out.println("\n******** D0SEN ********\n");
                Dosen dosen1 = new Dosen("Jerome", "44966", "Rekayasa Perangkat Lunak");
                dosen1.display();
                Dosen dosen2 = new Dosen("Fadil", "22356", "Organisasi Komputer");
                dosen2.display();
                Dosen dosen3 = new Dosen("Leo", "45965", "Basis Data");
                dosen3.display();
            } else {
                System.out.println("Data Tidak Ditemukan");
            }
        }

    }
}