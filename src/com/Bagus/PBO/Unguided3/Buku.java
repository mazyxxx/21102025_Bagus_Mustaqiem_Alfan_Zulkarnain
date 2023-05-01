package com.Bagus.PBO.Unguided3;

public class Buku {
    int No_Buku;
    String Judul_Buku;
    String Pengarang;
    int Tahun_Terbit;
    int Harga;
    public int getNo_Buku(){
        return No_Buku;
    }
    public void setNo_Buku(int no_Buku) {
        No_Buku = no_Buku;
    }
    public String getJudul_Buku() {
        return Judul_Buku;
    }
    public void setJudul_Buku(String judul_Buku) {
        Judul_Buku = judul_Buku;
    }
    public String getPengarang() {
        return Pengarang;
    }
    public void setPengarang(String pengarang) {
        Pengarang = pengarang;
    }
    public int getTahun_Terbit() {
        return Tahun_Terbit;
    }
    public void setTahun_Terbit(int tahun_Terbit) {
        Tahun_Terbit = tahun_Terbit;
    }
    public int getHarga() {
        return Harga;
    }
    public void setHarga(int harga) {
        Harga = harga;
    }
    public void showinfo() {
        System.out.println("NO_Buku :" + No_Buku);
        System.out.println("Judul_Buku :" + Judul_Buku);
        System.out.println("Pengarang :" + Pengarang);
        System.out.println("Tahun_Tebit :" + Tahun_Terbit);
        System.out.println("Harga :" + Harga);
        System.out.println();
    }
    public void beli(int beli) {
    }
    public void bayar (int bayar){
    }
}
