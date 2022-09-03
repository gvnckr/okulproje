package okulproje;

import day12_okulProjesi.Ogretmen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler2 {

    static List<Ogretmen> ogretmenlist2=new ArrayList<Ogretmen>();
    static List<kisi2>ogrencilist2=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
   static    String kisituru;

    public  static  void girisPaneli(){

        System.out.println("====================================");
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("====================================");
        System.out.println("1- OGRENCI ISLEMLERI");
        System.out.println("2- OGRETMEN ISLEMLERI");
        System.out.println("Q- CIKIS");

        String secim=scan.next().toUpperCase();//kullanici kucuk harf girse bile buyuk harfe c


        switch (secim){
            case "1":
                islemmenusu();
                kisituru=" OGRENCI ";
                break;
            case "2":
                islemmenusu();
                kisituru=" OGRETMEN ";
                break;
            case "Q":
                kisituru= "CIKIS";
                break;
            default:
                System.out.println("hatali giris");
                girisPaneli();
                break;
        }


    }

    private static void islemmenusu() {
        System.out.println("sectigin kisi turu  "+kisituru +"  lutfen asagidaki islmleri seciniz");


        System.out.println("============= IŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LISTELEME\n" +
                "         4-SILME\n" +
                "         5-ANA MENU\n" +
                "         0-CIKIS");

        System.out.println("islem tercihinizi giriniz: ");
        int secilenislem= scan.nextInt();
        switch (secilenislem){
            case 1:
                ekle();
                islemmenusu();
            case 2:
                islemmenusu();
            case 3:
                islemmenusu();
            case 4:
                islemmenusu();
            case 5:
                islemmenusu();
            case 0:
            default:
                System.out.println("belirtilen nolari giriniz");

        }






    }

    public static void ekle() {
        System.out.println("**** "+ kisituru+" ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim gir");
        String adSoyad=scan.nextLine();
        scan.nextLine();
        System.out.println("kimlik gir");
        String kimliNo=scan.nextLine();
        System.out.println("yas gir");
        int yas=scan.nextInt();
        if (kisituru.equals("OGRENCI")){//TODO sonra doldur
        }else{
            System.out.println("bolum gir");
            String bolum= scan.nextLine();
            scan.nextLine();//dummy6 kod hata almamak icin
            System.out.println("sicil no gir");
            String sicilNo= scan.nextLine();
            Ogretmen ogretmen=new Ogretmen(adSoyad,kimliNo,yas,bolum,sicilNo);


            ogretmenlist2.add(ogretmen);
            System.out.println(ogretmenlist2);
        }




    }


}
