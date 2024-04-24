import java.util.Scanner;

public class DaireninAlaniveCevresi {
    public static void main(String[] args) {
        int r, a;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r=inp.nextInt();

        System.out.print("Merkez açının ölçüsünü giriniz: ");
        a=inp.nextInt();

        double alan= pi*r*r;
        System.out.println("Dairenin alanı: " + alan);

        double cevre= 2*pi*r;
        System.out.println("Dairenin çevresi: " + cevre);

        double dilimalan= (pi*(r*r)*a)/360;
        System.out.println("Dairenin dilim alanı: " + dilimalan);


    }
}
