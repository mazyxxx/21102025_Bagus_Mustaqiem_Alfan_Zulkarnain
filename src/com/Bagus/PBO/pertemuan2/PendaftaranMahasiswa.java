package com.Bagus.PBO.pertemuan2;

import java.util.Scanner;

public class PendaftaranMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Menambahkan scanner.nextLine() untuk membaca newline character

        String nama;
        int umur;
        String programStudi = "";

        System.out.println("== Program Form Pendaftaran Mahasiswa Baru ==");
        // Meminta input dari user untuk nama

        System.out.print("Masukkan nama lengkap: ");
        nama = scanner.nextLine();

        // Memeriksa apakah user memasukkan nama
        if (nama.isEmpty()) {
            System.out.println("Nama harus diisi");
            System.exit(0);
        }

        // Meminta input dari user untuk umur
        System.out.print("Masukkan umur: ");
        umur = scanner.nextInt();


        // Memeriksa apakah user berusia kurang dari 17 tahun
        if (umur < 17) {
            System.out.println("Umur Anda Belum Cukup");
            System.exit(0);
        }

        // Menampilkan menu pilihan program studi
        System.out.println("Program Studi yang Tersedia:");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Manajemen Informatika");

        // Meminta input dari user untuk memilih program studi
        System.out.print("Masukkan pilihan program studi (1-3): ");
        int pilihan = scanner.nextInt();

        // Menentukan program studi berdasarkan pilihan user
        if (pilihan == 1) {
            programStudi = "Teknik Informatika";
            // Menampilkan informasi pendaftaran
            System.out.println("== Data Pendaftaran ==");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jurusan: " + programStudi);
        } else if (pilihan == 2) {
            programStudi = "Sistem Informasi";
            // Menampilkan informasi pendaftaran
            System.out.println("== Data Pendaftaran ==");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jurusan: " + programStudi);
        } else if (pilihan == 3) {
            programStudi = "Manajemen Informatika";
            // Menampilkan informasi pendaftaran
            System.out.println("== Data Pendaftaran ==");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jurusan: " + programStudi);
        } else {
            System.out.println("Pilihan program studi tidak valid");
            System.exit(0);
        }




    }
}
