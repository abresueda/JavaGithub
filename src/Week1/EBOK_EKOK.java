package Week1;

import java.util.Scanner;

public class EBOK_EKOK {
    public static void main(String[] args) {
        //Scanner sınıfını tanımla ve kullanıcıdan değerleri al.
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = inp.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = inp.nextInt();

        //EBOB hesaplamak için işlemleri yap.
        int ebob = 1;
        int k = n1;
        while (k >= 1) {
            if ((n1%k==0 && n2%k==0)) {
                ebob=k;
                break;
            }
            k--;
        }
        System.out.println("EBOB: " + ebob);

        //EKOK hesaplamak için işlemleri yap.
        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK: " + ekok);
    }
}

