package Week2;

import java.util.Scanner;

public class AsalSayiBulanProgram {
    static boolean primeNumber(int n) {                //Asal sayıları bulmak için boolean yöntemini kullanıyoruz.
        if (n <= 1) {                                  //1'den küçük sayıların asal sayı olmamasını oluşturuyoruz.
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {     //Asal sayıları bulmak için formülü yazıyoruz.
            if (n % i == 0) {
                return false;
            }
        }   return true;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= inp.nextInt();

        if (primeNumber(n)) {                         //Üstteki metodu çağırarak sayının asal olup olmadığının çıktısını alıyoruz.
            System.out.println( n + " asal sayıdır.");
        } else {
            System.out.println( n + " asal sayı değildir.");
        }
    }
}
