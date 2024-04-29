package Week1;

import java.util.Scanner;

public class MükemmelSayilar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Kullanıcıdan bir değer al.
        System.out.print("Bir sayı giriniz: ");
        int n= scan.nextInt();

        // Sayının kendisine kadar olan tüm bölenlerini kontrol et.
        int toplam=0;
        for(int i=1;i<n; i++) {
            // Eğer i, sayıya tam bölünüyorsa, i'yi toplam değişkenine ekle.
            if (n%i==0) {
                toplam+=i;
            }
        }
        //Toplam girilen sayıya eşitse mükemmel bir sayıdır.
        if (toplam==n) {
            System.out.print(n + " Mükemmel bir sayıdır.");
        }else{
            System.out.print(n + " Mükemmel bir sayı değildir.");
        }
    }
}
