package Week1;

import java.util.Scanner;

public class FaktoriyelAlma {
    public static void main(String[] args) {

        //Scanner sınıfını ve değişkenleri tanımla.
        Scanner inp=new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n=inp.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r=inp.nextInt();

        int total1=1; int total2=1; int total3=1;

        //Kombinasyon alabilmek için değişkenlerimizin faktöriyellerini hesapla.

        for (int i=1; i<=n; i++) {
            total1*=i;
        }
        for (int i=1; i<=r; i++) {
            total2*=i;
        }
        for (int i=1; i<=(n-r); i++) {
            total3*=i;
        }
        int combination=total1 / (total2*total3);
        System.out.print("Sonuç: " + combination);
        }
    }
