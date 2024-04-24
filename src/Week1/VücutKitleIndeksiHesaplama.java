package Week1;

import java.util.Scanner;

public class VücutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        double kg,m;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        m=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg=inp.nextDouble();

        double indeks;
        indeks=(kg/(m*m));
        System.out.print("Vücut Kitle İndeksiniz: " + indeks);

    }
}
