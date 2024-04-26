package Week1;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        //Değişkenlerimizi girelim.
        int month,day;
        String horoscope=" ";
        boolean isError=false;

        //Scanner sınıfımızı tanımlayalım.
        Scanner inp=new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        month=inp.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day=inp.nextInt();

        //Switch ve if-else yapılarıyla kodumuzu yazalım.
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Oğlak Burcusunuz";
                    } else {
                        horoscope = "Kova Burcusunuz";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        horoscope = "Kova Burcusunuz.";
                    } else {
                        horoscope = "Balık Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Balık Burcusunuz.";
                    } else {
                        horoscope = "Koç Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Koç Burcusunuz.";
                    } else {
                        horoscope = "Boğa Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Boğa Burcusunuz.";
                    } else {
                        horoscope = "İkizler Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "İkizler Burcusunuz.";
                    } else {
                        horoscope = "Yengeç Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Yengeç Burcusunuz.";
                    } else {
                        horoscope = "Aslan Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Aslan Burcunusuz.";
                    } else {
                        horoscope = "Başak Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Başak Burcusunuz.";
                    } else {
                        horoscope = "Terazi Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Terazi Burcusunuz.";
                    } else {
                        horoscope = "Akrep Burcusunuz.";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Akrep Burcusunuz.";
                    } else {
                        horoscope = "Yay Burcusunuz.";
                    }
                } else {
                    isError = true;
                }break;
            case 12:
                if(day>=1 && day<=31) {
                    if (day < 23) {
                        horoscope = "Yay Burcusunuz.";
                    } else {
                        horoscope = "Oğlak Burcusunuz.";
                    }
                }else {
                    isError = true;
                }break;
            default:
                isError=true;
        }
        //Case'de yazmayan bir sayı girildiğinde verilecek hata oluşturuldu.
        if(isError) {
            System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
        }else {
            System.out.println("Burcunuz: " + horoscope);
    }
   }
}