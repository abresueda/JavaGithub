package Week1;

import java.util.Scanner;

public class TekSayilarinToplamı {
    public static void main(String[] args) {

        //Scanner sınıfını ve değişkenleri tanımla.
        Scanner scan=new Scanner(System.in);
        int t;
        int total=0;

        //Tek sayı girilene kadar çalışma döngüsü ve 2 ve 4'ün katlarının toplamını hesaplama döngüsünü yap.
        do {
            System.out.print("Sayı Giriniz: ");
            t= scan.nextInt();
            if (t%2==0 && t%4==0){
                total+=t;
        }
        }while (t%2==0);

        System.out.println("Toplam: " + total);
    }
}
