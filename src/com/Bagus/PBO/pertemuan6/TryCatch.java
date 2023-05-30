package com.Bagus.PBO.pertemuan6;

public class TryCatch {

    public static void main(String[] args) {
//        membuat array
        int[] angka= {
                1,2,3,4,5
        };
//        memanggil array berdasarkan index

        System.out.println("index ke 3:");

        try{

           System.out.println(
                   angka[3]
           );
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Index yang anda masukkan melebihi batas!");
       }

        System.out.println("index yang anda masukkan : ");
        try{

            System.out.println(
                    angka[6]
            );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index yang anda masukkan melebihi batas!");
        }


        System.out.println(
                "akhir dari program"
        );
    }

}
