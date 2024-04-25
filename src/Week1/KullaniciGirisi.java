import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;
//Kullanıcı girişi için bir program yazacağız.

public class KullaniciGirisi {
    public static void main(String[] args) {
        //Scanner sınıfını tanımladık.
        Scanner inp = new Scanner(System.in);

        //Değişkenleri tanımlayalım.
        String userName, password;

        //Kullanıcıdan bilgileri alalım.
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        //Giriş işlemlerini yapalım.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Girişiniz Başarılı");
        }   else {
            System.out.print("Şifre veya Kullanıcı adı hatalı\nŞifrenizi sıfırlamak ister misiniz? ");
            String resetChoice= inp.nextLine();

            //Şifresini sıfırlamak isterse aşağıdaki işlemleri yapacağız.
              if (resetChoice.equalsIgnoreCase("Evet")) {
                  System.out.println("Yeni girdiğiniz şifre önceki şifrelerinizden farklı olmalıdır.");
                  System.out.print("Yeni şifrenizi giriniz: ");
                  String newPassword= inp.nextLine();
                  String oldPassword="java123";

                  //Aynı şifreyi girerse aşağıdaki çıktıyı verecektir.
                  if (newPassword.equals(oldPassword)) {
                      System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz");
                  } else {
                      System.out.println("Şifreniz oluşturuldu.");
                  }
              }
        }

    }
}
