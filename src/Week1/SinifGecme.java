import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        //Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Değişkenlerimizi girelim.
        int mat, fizik, turkce, kimya, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        //Else if yapısıyla ortalamayı hesapla.

        if (!((0 <= mat) && (mat <= 100) && (0 <= fizik) && (fizik <= 100.) && (0 <= turkce) && (turkce <= 100) && (0 <= kimya) && (kimya <= 100) && (0 <= muzik) && (muzik <= 100))) {
            System.out.print("Notlarınız değerlendirmeye alınmamıştır.");
        } else {
            double avarage = ((mat + fizik + turkce + kimya + muzik) / 5);
            if (avarage <= 55) {
                System.out.println("Sınıfta Kaldınız.");
            } else {
                System.out.println("Tebrikler! Sınıfı Geçtiniz.");
            }

        System.out.print("Ortalamanız: " + avarage);

        }
    }
}