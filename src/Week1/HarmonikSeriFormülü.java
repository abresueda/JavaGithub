package Week1;

import java.util.Scanner;

public class HarmonikSeriFormülü {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n=scan.nextInt();
        double result=0.0;

        for (double i=1;i<=n; i++){
            result += (1/i);
        }
        System.out.println("Sayının harmonik değeri: " + result);
    }
}
