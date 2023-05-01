package com.Bagus.PBO.pertemuan2;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int angkaTebakan = rand.nextInt(100) + 1;
        int tebakan = 0;
        int jumlahTebakan = 0;

        System.out.println("Selamat datang di game Tebak Angka!");
        System.out.println("Saya telah memilih sebuah angka antara 1 hingga 100.");
        System.out.println("Silakan tebak angka tersebut.");

        while (tebakan != angkaTebakan) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaTebakan) {
                System.out.println("Tebakan Anda terlalu rendah, coba lagi!");
            } else if (tebakan > angkaTebakan) {
                System.out.println("Tebakan Anda terlalu tinggi, coba lagi!");
            }
        }

        System.out.println("Selamat! Anda berhasil menebak angka tersebut dalam " + jumlahTebakan + " tebakan.");
        input.close();
    }
}
