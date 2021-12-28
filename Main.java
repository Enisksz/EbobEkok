package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1,sayi2,ebob=1,ekok;

        Scanner input =new Scanner(System.in);

        System.out.println("İlk sayı: ");
        sayi1 = input.nextInt();

        System.out.println("İkinci sayı: ");
        sayi2 = input.nextInt();

        int i=sayi1;
        while (i>=1){
            if(sayi1 % i == 0 && sayi2 % i == 0 ){

                ebob = i;
                System.out.println("Ebob -> "+ebob);
                break;
            }
            i--;
        }
        ekok = (sayi1*sayi2)/ebob;
        System.out.println("Ekok -> "+ekok);
    }
}
