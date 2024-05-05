package Week2;

import java.util.Arrays;

public class DizidekiTekrarEdenSayi {
    static boolean isFind(int[] arr, int value) {      /*Bu fonksiyon tekrar eden sayının daha önce diziye
                                                       eklenip eklenmediğini kontrol eder. */
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {89, 4, 5, 70, 4, 23, 6, 71, 89, 8, 13, 8, 10};
        int[] duplicate = new int[list.length];                          //Tekrar eden sayılar için yeni bir dizi oluşturuyoruz.
        int startIndex = 0;


        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {                                     //Sadece dizideki çift sayılar arasında arama yapar.

                for (int j = 0; j < list.length; j++) {
                    if ( (i != j) && (list[i] == list[j]) ) {           //i'nin kendisine eşit olmadığı ve dizide tekrar edenleri kontrol eder.

                        if (!isFind(duplicate, list[i])) {

                            duplicate[startIndex++] = list[i];          //startIndeks, duplicate dizisinin indeksini takip eder.
                        }
                        break;
                    }
                }
            }
        }
            for (int out : duplicate) {
                if (out != 0) {
                    System.out.println("Çift olup tekrar eden sayılar: " + out);

            }
        }
    }
}
