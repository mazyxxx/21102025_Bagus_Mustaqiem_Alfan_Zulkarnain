package com.Bagus.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor honda = new SepedaMotor();

//        suzuki.merek = "Suzuki";
//        suzuki.tipe = "Hayabusa";
//        suzuki.harga = 210000000;
//
//        yamaha.merek = "Yamaha";
//        yamaha.tipe = "YZF R15";
//        yamaha.harga = 190000000;
//
//        honda.merek = "Honda";
//        honda.tipe = "CBR 100R";
//        honda.harga = 29000000;

//        suzuki.showinfo();
//        yamaha.showinfo();
//        honda.showinfo();

        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa matic", 40000000);

        vespa.showinfo();

//         sebelum perubahan
        System.out.println(
                        "Motor Meerek : " + vespa.getMerek() +
                        "Dengan tipe (before) : " + vespa.getTipe()
        );

        // melakukan proses perubahan tipe motor
        vespa.setTipe("Sprint");

//        Lihat hasil Perubahan
        System.out.println(
                "Motor Meerek : " + vespa.getMerek() +
                        "Dengan tipe (after) : " + vespa.getTipe()
        );
    }
}
