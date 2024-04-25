package Week1;
import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
       //Değişkenlerimizi girelim.
        double armut,a, elma,e, domates,d, muz,m, patlican,p;
        Scanner inp= new Scanner(System.in);

        //Kullanıcıdan değerlerimizi alalım ve Kg fiyatıyla işleme alalım.
        System.out.print("Armut Kaç Kilo? : ");
        a=inp.nextDouble();
        armut=(2.14*a);
        System.out.println("Armut :" + armut + " TL");
        
        System.out.print("Elma Kaç Kilo? : ");
        e=inp.nextDouble();
        elma=(3.67*e);
        System.out.println("Elma :" + elma + " TL");

        System.out.print("Domates Kaç Kilo? : ");
        d=inp.nextDouble();
        domates=(1.11*d);
        System.out.println("Domates :" + domates + " TL");

        System.out.print("Muz Kaç Kilo? :");
        m=inp.nextDouble();
        muz=(0.95*m);
        System.out.println("Muz : " + muz + " TL");

        System.out.print("Patlıcan Kaç Kilo? :");
        p=inp.nextDouble();
        patlican=(5.00*p);
        System.out.println("Patlıcan: "+ patlican + " TL");

        //Toplam tutara ulaşmak için ücreti tanımlayalım.
        double ücret= armut+elma+domates+muz+patlican;
        System.out.print("Toplam Tutar: " + ücret + " TL");

    }
}
