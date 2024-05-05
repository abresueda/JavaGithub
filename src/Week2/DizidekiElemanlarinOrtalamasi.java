package Week2;

import java.util.Arrays;

public class DizidekiElemanlarinOrtalamasi {
    public static void main(String[] args) {

        int [] numbers= {3,11,12,26,56,34,-43,6,72,-56};

        int arrayLength= numbers.length;                      //Dizinin eleman sayısını bulmak için dizinin lengthine eşitledik.
        System.out.println("Eleman sayısı: " + arrayLength);

        double sum=0.0;
        for (int i=0; i < numbers.length; i++ ) {             //Dizideki elemanları (1/a+1/b) şeklinde yazarak toplamını bulduk.

            sum+=1.0/numbers[i];

        } System.out.println("Harmonik seri formülüne göre toplamı: " + sum);

        double harmonicAvarage= arrayLength/ sum;              //Eleman sayısına toplamı bölerek harmonik ortalamayı bulduk.
        System.out.println("Harmonik Ortalama: " + harmonicAvarage);


    }
}
