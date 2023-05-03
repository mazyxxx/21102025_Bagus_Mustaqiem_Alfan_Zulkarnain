package com.Bagus.PBO.pertemuan5;

public class Barang {
//    atribut
    String nama;
    int harga;

//    construktor
    public Barang(){}

    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;

    }

//    method
    public void showinfo(){
        System.out.println("Nama Barang: " +this.nama);
        System.out.println("Harga Barang: " +this.harga);
        System.out.println();
    }
}
