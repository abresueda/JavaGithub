import java.sql.SQLOutput;
import java.util.Scanner;

//Basit hesap makinesi yapalım.

public class HesapMakinesi {
    public static void main(String[] args) {

        //Scanner sınıfını tanımladık.
        Scanner inp=new Scanner(System.in);

        //Değişkenleri tanımlayalım.
        int n1,n2,select;

        //Kullanıcıdan değerlerimizi alalım.
        System.out.print("Birinci sayıyı giriniz: ");
        n1=inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=inp.nextInt();

        //İşlemlerimizi oluşturalım.
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select=inp.nextInt();

        //Switch yapımızı oluşturalım.
        switch (select) {
            case 1:
                System.out.print("Toplama: " + (n1+n2));
            break;
            case 2:
                System.out.print("Çıkarma: " + (n1-n2));
            break;
            case 3:
                System.out.print("Çarpma: " + (n1*n2));
            break;
            case 4:
                if (n2!=0) {
                    System.out.print("Bölme: " + (n1/n2));
                } else {
                    System.out.print("Bir sayıyı 0'a bölemezsiniz!");
                }
            break;
            default: System.out.print("Geçerli Seçim Yapınız.");

        }
    }
}
