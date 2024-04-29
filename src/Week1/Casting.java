package Week1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        //Kullanıcıdan veri almak için Scanner sınıfını tanımladık ve verileri aldık.
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int t= inp.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double o= inp.nextDouble();

        //Casting yapmak için işlemleri yapalım.
        double newInt= (double) t; //Tam sayıyı double türüne dönüştürerek yeni double türündeki değişkene atadık.
        System.out.println("Tam sayının ondalıklı sayıya dönüşmüş hali: " + newInt
        );

        int newDouble= (int) o;  //Ondalıklı sayıyı int türüne dönüştürerek yeni int türündeki değişkene atadık.
        System.out.println("Ondalıklı sayının tam sayıyı dönüşmüş hali: " + newDouble);
    }
}
