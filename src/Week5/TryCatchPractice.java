package Week5;

import java.util.Scanner;

public class TryCatchPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = {1, 5, 12, 45, 62, 17, 39, 83, 74, 2};

        System.out.print("Bir indeks numarası giriniz: ");
        int n = input.nextInt();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(array[n]);
                break;
            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Dizide bu indeks numarası bulunmamaktadır.");
        }
    }
}
