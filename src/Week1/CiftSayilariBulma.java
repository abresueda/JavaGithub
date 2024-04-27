package Week1;

import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {

        //Scanner sınıfını tanımla ve kullanıcıdan değişkenleri al.
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int k= inp.nextInt();

        //Değişkenleri tanımla.
        int toplam=0;
        int adet=0;

        //For döngüsüyle verilen sayıların toplamını bul.
        for (int i=0; i<=k ; i++){
            if(i%3==0 && i%4==0) {
                toplam +=i;
                adet++;
            }

        //Ortalama hesaplamak ve çıktıyı almak için işlemleri yap.
            }if(adet==0) {
            System.out.println("Girilen aralıkta 3'e ve 4'e tam bölünen bir sayı bulunmamaktadır.");
        }else {
            double ortalama = toplam / adet;
            System.out.println("Girilen aralıkta 3'e ve 4'e tam bölünen sayıların toplamı: " + toplam);
        }
    }
}
