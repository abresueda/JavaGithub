package Week1;
import java.util.Scanner;

public class MaxMinDegerBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = inp.nextInt();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i=1; i<=n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = inp.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
             System.out.println("En küçük sayı: " + min);
             System.out.println("En büyük sayı: " + max);
    }
}
