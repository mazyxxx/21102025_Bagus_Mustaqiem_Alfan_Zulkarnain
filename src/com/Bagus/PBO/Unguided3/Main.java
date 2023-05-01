package com.Bagus.PBO.Unguided3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bagus Mustaqiem Alfan Zulkarnain");
        System.out.println();
        Koperasi BukuTulis = new Koperasi("Buku", 2000, 20);
        Koperasi Pensil = new Koperasi("Pensil", 3000, 10);
        BukuTulis.HargaSatuan = 5000;
        BukuTulis.JumlahBarang = 10;
        BukuTulis.TotalHarga= (BukuTulis.getHargaSatuan()*BukuTulis.getJumlahBarang());
        Pensil.HargaSatuan = 3000;
        Pensil.JumlahBarang = 20;
        Pensil.TotalHarga= (Pensil.getHargaSatuan()*Pensil.getJumlahBarang());
        BukuTulis.showinfo();
        Pensil.showinfo();
        System.out.println(("Total Harga : "+(Pensil.getHargaSatuan()*Pensil.getJumlahBarang()+(BukuTulis.getHargaSatuan()*BukuTulis.getJumlahBarang()))));
    }
}
