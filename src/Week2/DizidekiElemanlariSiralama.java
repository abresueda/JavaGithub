package Week2;

import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int length = inp.nextInt();

        int[] numbers= new int [length];                        //Dizi oluşturuluyor.

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < length; i++) {
            System.out.print( (i+1) + ".Elemanı: ");
            numbers[i]= inp.nextInt();                        //Kullanıcının girdiği değer diziye ekleniyor.
        }

        Arrays.sort(numbers);                                  //Dizi sıralanıyor.

        System.out.println("Sıralama: " + Arrays.toString(numbers));
    }
}
