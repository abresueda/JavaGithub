package Week1;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armut,a, elma,e, domates,d, muz,m, patlican,p;
        Scanner inp= new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        a=inp.nextDouble();
        armut=(2.14*a);
        System.out.println("Armut :" + armut);
        
        System.out.print("Elma Kaç Kilo? : ");
        e=inp.nextDouble();
        elma=(3.67*e);
        System.out.println("Elma :" + elma);

        System.out.print("Domates Kaç Kilo? : ");
        d=inp.nextDouble();
        domates=(1.11*d);
        System.out.println("Domates :" + domates );

        System.out.print("Muz Kaç Kilo? :");
        m=inp.nextDouble();
        muz=(0.95*m);
        System.out.println("Muz : " + muz);

        System.out.print("Patlıcan Kaç Kilo? :");
        p=inp.nextDouble();
        patlican=(5.00*p);
        System.out.println("Patlıcan: "+ patlican);

        double ücret= armut+elma+domates+muz+patlican;
        System.out.print("Toplam Tutar: " + ücret);

    }
}
