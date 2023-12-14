package com.workintech.pazararabasi.main;

import com.workintech.pazararabasi.model.Pazar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba, Pazar arabasına hoşgeldiniz.");
        System.out.println("yapmak istediğiniz işlemi giriniz.");
        System.out.println("0: çıkış");
        System.out.println("1: ekle");
        System.out.println("2: çıkar");
        pazarArabasiUygulamasi();
    }
    public static void pazarArabasiUygulamasi(){
        Scanner scanner =new Scanner(System.in);

        List<String> pazarListesi = new LinkedList<>();

        while(true){

            int input =scanner.nextInt();
            if(input==0){
                break;
            }
            if (input == 1) {
                System.out.println("eklenmesini istediğiniz elemanları giriniz");
                Pazar.addItems(pazarListesi);

            }

            if (input == 2) {
                System.out.println("çıkarılmasını istediğiniz elemanları giriniz");
                Pazar.removeItems(pazarListesi);
            }
        }

    }
}
