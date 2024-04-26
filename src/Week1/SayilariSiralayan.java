package Week1;

import java.util.Scanner;

public class SayilariSiralayan {
    public static void main(String[] args) {
        //Scanner sınıfımızı ve değişkenleri tanımladık.
        Scanner inp = new Scanner(System.in);
        int a, b, c;

        //Kullanıcıdan değerlerimizi alalım.
        System.out.print("a.sayısı: ");
        a = inp.nextInt();

        System.out.print("b.sayısı: ");
        b = inp.nextInt();

        System.out.print("c.sayısı: ");
        c = inp.nextInt();

        //Sayıları karşılaştırmak için kodumuzu yazalım.

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
       }else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("b>a>c");
            } else {
                System.out.print("b>c>a");
            }
       }else {                                       //if((c>a) && (c>b)) ifadesini sildik.//
            if (a>b) {
                System.out.print("c>a>b");
            } else {
                System.out.print("c>b>a");
   }
  }
 }
}