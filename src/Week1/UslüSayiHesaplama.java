package Week1;

import java.util.Scanner;

public class UslüSayiHesaplama {
    public static void main(String[] args) {
        //Scanner sınıfını ve değişkenleri tanımla.
        Scanner scan=new Scanner(System.in);
        int n,k;
        int total=1;
        System.out.print("Üssü alınacak sayı: ");
        n=scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        k= scan.nextInt();

        //Üst alma döngümüzü yazalım.
        for (int i=1;i<=k;i++) {
            total*=n;
        }
        System.out.print("Sonuç: " + total);
    }
}
