package com.Bagus.PBO.pertemuan4;

public class Manajer extends Pegawai{
//    metdhod
    public  void bonus(int bonus){
        System.out.println("Pegawai dengan nama: " + nama + " Dengan NIP: " + nip + " Mendapat bonus: "+ bonus);
    }
//    polymorphism
    public void bonus(){
        System.out.println("Nilai bonus tidak boleh kosong");
    }

}
