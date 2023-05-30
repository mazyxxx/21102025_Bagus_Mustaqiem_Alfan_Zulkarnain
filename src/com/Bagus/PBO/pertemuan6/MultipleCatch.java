package com.Bagus.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        try{
            System.out.println("masukkan angka: ");
            int angka1 = input.nextInt();

            System.out.println("masukkan angka pembagi: ");
            int angka2 = input.nextInt();

            int hasil = angka1/angka2;
            System.out.println(angka1 + "/" + angka2 + " = " + hasil+"(dibulatkan)");
        }
//        multiple exception
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("error: " + e);
        }

        finally {
            System.out.println("Finally akan selalu jalan");
        }

        System.out.println("akhir dari program!");
    }

}
