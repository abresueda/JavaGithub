import java.util.Scanner;

public class AritmetikIslemler {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a=inp.nextInt();
        System.out.print("b sayısını giriniz: ");
        b=inp.nextInt();
        System.out.print("c sayısını giriniz: ");
        c=inp.nextInt();

        int sonuc=a+b*c-b;
        System.out.print("Sonuç: " + sonuc);
    }
}
