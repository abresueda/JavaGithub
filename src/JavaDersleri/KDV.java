package JavaDersleri;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        double kdvsizTutar, kdvliTutar ;

        //Scanner sınıfımızı tanımla
        Scanner inp= new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Tutarınızı Giriniz: ");
        kdvsizTutar= inp.nextDouble();

        //Değişen KDV oranını hesapla
        double kdvOranı;
        if (kdvsizTutar>0 && kdvsizTutar<=1000) {
            kdvOranı = 0.18;
        } else {
            kdvOranı = 0.08;
        }
        System.out.println(kdvOranı);

        System.out.print("KDV'li Tutarınız: ");
        kdvliTutar=(kdvsizTutar+(kdvsizTutar*kdvOranı));
        System.out.print(kdvliTutar);

    }
}
