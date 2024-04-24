package Week1;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        //Değişkenleri yazalım
        double a, b, c ;

        //Scanner sınıfını tanımla
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Üçgenin 1. kenarını giriniz: ");
        a= inp.nextDouble();

        System.out.print("Üçgenin 2. kenarını giriniz: ");
        b=inp.nextDouble();

        System.out.print("Üçgenin 3.kenarını giriniz: ");
        c=inp.nextDouble();

        double cevre=(a+b+c);
        double u=cevre/2;
        double alan=Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.print("Üçgenin alanı: " + alan);



    }
}
