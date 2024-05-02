package Week2;

import java.util.Scanner;

public class UsHesabiYapanProgram {

    static int power(int n1,int n2) {                   //Üst işlemini yapmak için for döngüsüyle metodu oluşturuyoruz.
        int total = 1;
        for (int i =1 ; i <= n2; i++) {
            total *= n1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);              //Kullanıcıdan değerleri almak için Scanner sınıfını tanımlıyoruz.
        System.out.print("Taban değeri giriniz: ");
        int n1= inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int n2=inp.nextInt();

        System.out.println("Sonuç: " + power(n1,n2));   //Üstte tanımladığımız üst metodunu burada çağırıyoruz.

    }
}
