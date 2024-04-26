package Week1;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        //Değişkenlerimizi girelim.
        int age;
        double km;

        //Scanner sınıfımızı ve değişkenleri alalım.
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM türünden giriniz: ");
        km = inp.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();

        //Yolcunun tek yön veya gidiş-dönüş seçeneğini tanımladık.
        System.out.println("Yolculuk tipinizi seçiniz.\n1 / 2");
        int flight = inp.nextInt();

        if (flight == 1) {
            System.out.println("Tek yön yolculuk seçtiniz.");
        } else if (flight==2) {
            System.out.println("Gidiş-Dönüş yolculuk seçtiniz.");
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }

        double price=km*0.10, saleprice=price;
        if(age<0) {
            System.out.print("Hatalı sayı girdiniz.");
        } else if(age<13) {
            saleprice = price - (price * 0.50);
        } else if (12<age && age<25) {
            saleprice = price - (price * 0.10);
        } else if(age>65) {
            saleprice = price - (price * 0.30);
        } else {
            saleprice = price; //indirim uygulanmayacak durumlar için.
        }
        if(flight==2) {
            saleprice = saleprice- (saleprice*0.20);
        }
        System.out.println("Toplam Tutar: " + saleprice + "TL");
        }
    }

