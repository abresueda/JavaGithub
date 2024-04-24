import java.util.Scanner;

public class NotOrtalamasi {
    public static <string> void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuz: ");
        kimya= inp.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe Notunuz: ");
        turkce= inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz: ");
        tarih= inp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik Notunuz: ");
        muzik= inp.nextInt();
        System.out.println(muzik);

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc= (toplam/ 6.0);

        //Koşul operatörünü kullan

        string str=(string) ((sonuc>=60)? "Geçti":"Kaldı");
        System.out.println("Ortalamanız: " + sonuc) ;
        System.out.println(str);


    }
}



