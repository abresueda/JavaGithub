package Week2;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
   static int Number(int n) {

       System.out.print( n + " ");

           if (n<=0) {                 //Sayının 0'dan küçük olana kadar ilerlemesi için n ifadesini döndürüyoruz.
               return n;
           }

           Number(n-5);             //Sayıdan her seferinde -5 çıkarmasını istiyoruz.

       System.out.print( n + " ");     //Sayının +5 kısmında da ilerlemesini görmek için sayının çıktısını alıyoruz.
       return n;
   }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= inp.nextInt();
        Number(n);
    }
}
