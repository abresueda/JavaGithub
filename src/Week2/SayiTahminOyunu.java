package Week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand=new Random();
        int number= rand.nextInt(100);

        Scanner inp=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;

        while (right<5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected= inp.nextInt();

            if (selected<0 || selected>100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");

                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5-(right)));

                } else {
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected==number) {
                System.out.println("Tebrikler! Tahmininiz doğru! Gizli sayı:  " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Tahmininiz yanlış! ");

                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong [right]=selected;
                right++;
                System.out.println("Kalan Hakkınız: " + (5-right));

            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            System.out.println("Gizli sayı: " + number);
        }
    }
}
