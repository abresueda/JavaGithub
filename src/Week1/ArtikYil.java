package Week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        //Scanner sınıfını tanımla.
        Scanner inp = new Scanner(System.in);

        //Değişkenleri tanımla ve kullanıcıdan bilgileri al.
        int year;
        boolean leapyear;
        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();
        leapyear = ((year % 4 == 0 ) || (year % 400 == 0 && year % 100 == 0));

        //If-else yapısını kullanarak artık yıl hesabını yazdır.
        if (leapyear) {
            System.out.print(year + " bir artık yıldır.");
        } else{
                System.out.print(year + " artık yıl değildir.");
            }
    }
}