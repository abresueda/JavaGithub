package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Max_MinDegerleriBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = inp.nextInt();

        int[] list = {3, 11, 878, 0, 56, 342, -43, 6, 72, -567};

        Arrays.sort(list);             //Diziyi küçükten büyüğe doğru diziyoruz.

        int min = list[0];             //Max-Min değerlere dizinin ilk elemanını atadık.
        int max = list[0];

        for (int i : list) {          //Girilen sayıdan küçük en yakın sayıyı bulması için.
            if (i < a) {
                min = i;
            }else {                   //Girilen sayıdan küçük değer bulunamayaksa döngüyü sonlandırmak için.
                break;
            }
        }

        for (int i: list) {           //Dizi taranırken girilen sayıdan büyük değeri bulmak için.
            if (i > a ) {
                max = i;
                break;
            }
        }

        System.out.println("Sayıya en yakın en küçük değer: " + min);
        System.out.println("Sayıya en yakın en büyük değer: " + max);
    }
}

