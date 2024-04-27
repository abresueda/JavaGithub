package Week1;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        //Scanner sınıfını ve değişkenleri tanımla.
        int number;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        number=scan.nextInt();

        for (int i=1; i<=number; i*=4){
            System.out.println(i+ " 4'ün kuvvetidir.");
        }
        for (int i=1; i<=number; i*=5){
            System.out.println(i+ " 5'in kuvvetidir.");
        }
    }
}
