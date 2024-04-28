package Week1;

import java.util.Scanner;

public class YildizlarİleElmas {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n=inp.nextInt();

        //Elmasın üst kısmını tamamlamak için işlemleri oluşturuyoruz.
        for (int i=0; i<=(n/2)+1; i++) {     //Kaç basamaklı olacağını bulmak için.
            for (int k=0; k<=(n/2)-i;k++) {  //Kaç tane boşluk olacağını bulmak için.
                System.out.print(" ");
            }
            for (int j=0; j<(2*i)+1; j++) {  //Kaç tane yıldız olacağını bulmak için.
                System.out.print("*");
            }
            System.out.println();
        }
        //Elmasın alt kısmını tamamlamak için işlemleri oluşturuyoruz.
        for (int i=(n/2)-1;i>=0; i--) {      //Kaç basamaklı olacağını bulmak için.
            for (int k=0; k<(n/2)-i; k++) {  //Kaç tane boşluk olacağını bulmak için.
                System.out.print(" ");
            }
            for (int j=0; j<(2*i)+1; j++) {  //Kaç tane yıldız olacağını bulmak için.
                System.out.print("*");
            }
            System.out.println();
            }
        }
}
