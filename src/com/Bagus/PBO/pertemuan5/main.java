package com.Bagus.PBO.pertemuan5;

public class main {
    public static void main(String[] args) {

        Barang[] keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie", 2000),
                new Barang("Mie sedap", 2000),
                new Barang("Beras", 15000),
                new Barang("Gula", 12000)
        };

//        melihat panjang array
        System.out.println(
                "Banyak barang di etalase: " + etalase.length
        );

        etalase[0].showinfo();

//  menampilkan daftar barang dalam array yang batas nya tidak diketahui (Python)

//        System.out.println("Daftar barang: ");
//
//        int i=1;
//        for(Barang barang : etalase){
//            System.out.println("Barang ke-"+i);
//            barang.showinfo();
//            i++;
//        }

//      yang memiliki batas
        for(int j=0; j<etalase.length; j++){
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showinfo();
        }

//        memasukkan barang ke keranjang
        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang: ");
        keranjang[0].showinfo();
    }
}
