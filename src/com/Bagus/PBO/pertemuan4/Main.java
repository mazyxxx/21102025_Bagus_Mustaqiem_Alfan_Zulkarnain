package com.Bagus.PBO.pertemuan4;

public class Main {

    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        manajer.nip = 123;
        manajer.nama = "Bagus";

        manajer.showinfo();

        /*polymorphism*/
        manajer.bonus();

        manajer.bonus(12000);


    }
}
