package Week1;

import java.util.Scanner;

public class MükemmelSayilar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= scan.nextInt();

        int toplam=0;
        for(int i=1;i<n; i++) {
            if (n%i==0) {
                toplam+=i;
            }
        }
        if (toplam==n) {
            System.out.print(n + " Mükemmel bir sayıdır.");
        }else{
            System.out.print(n + " Mükemmel bir sayı değildir.");
        }
    }
}
