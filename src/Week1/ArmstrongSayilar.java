package Week1;

import java.util.Scanner;

public class ArmstrongSayilar {
    public static void main(String[] args) {
        //Scanner sınıfınnı ve değişkenleri tanımla.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scan.nextInt();

        int basValue=0;

        //Verilen sayının basamaklarının değerini ayrı ayrı bulma işlemini yap.
        while (number != 0) {
            int bas=number%10;
            basValue +=bas;
            number/= 10;
        } System.out.print("Girilen sayının basamaklarının toplamı: " + basValue );
    }
}
