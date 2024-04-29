package Week1;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n= inp.nextInt();

        int total;
        int a=0,b=1;

        System.out.print("Fibonacci Serisi: ");

        for (int i=0;i<n;i++) {
            System.out.print(a + " ");
            total=a+b;
            a=b;
            b=total;
        }
    }
}
