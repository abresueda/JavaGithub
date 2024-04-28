package Week1;

import java.util.Scanner;

public class TersUcgenYapımı {
    public static void main(String[] args) {
        //Scanner sınıfını tanımla ve kullanıcıdan değerleri al.
        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int basNumber= inp.nextInt();

        //For döngüsü içinde basamak sayısı kadar * bastır.
        for(int i=0; i<basNumber; i++) {
            for (int j=0; j<(2*(basNumber-i)-1); j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
