package Week1;

import java.util.Scanner;
// Vücut Kitle İndeksini hesaplamak için bir program yaz.

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        //Değişkenleri giriniz.
        double kg,m;

        //Kullanıcıdan girdileri alınız.
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        m=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg=inp.nextDouble();

        //İndeksi tanımlayınız.
        double indeks;
        indeks=(kg/(m*m));
        System.out.print("Vücut Kitle İndeksiniz: " + indeks);

    }
}
