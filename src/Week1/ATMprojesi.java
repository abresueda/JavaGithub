package Week1;

import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 3000;
        do {
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();
            right--;
            System.out.println("Kullanıcı adı veya şifre hatalı.Kalan hakkınız: " + right);
        } while ((!userName.equals("abresueda") || !password.equals("patika")) && right>0);


        if (right == 0) {
            System.out.println("Hesabınız bloke edilmiştir. Lütfen banka ile iletişime geçiniz. ");
            return;
        }

        while (right > 0) {
                System.out.println("Merhaba, x Bankası'na Hoşgeldiniz.");
                System.out.print("1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap\nLütfen yapmak istediğiniz işlemi seçiniz: ");
                int select= inp.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz para miktarı: ");
                        int depositPrice = inp.nextInt();
                        balance += depositPrice;
                        System.out.print("Para miktarınız: " + balance);
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz para miktarı: ");
                        int withdrawPrice = inp.nextInt();
                        if (withdrawPrice>balance) {
                            System.out.println("Yetersiz Bakiye");
                        break;
                        } else {
                            balance -= withdrawPrice;
                            System.out.print("Para miktarınız: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: ");
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor.\nGörüşmek üzere!");
                        return;
                    default:
                        System.out.println("Geçersiz işlem yaptınız.");
                }
        }
    }
}

