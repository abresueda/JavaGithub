package Week5;

import java.util.Scanner;
import java.util.TreeSet;

public class PatikaStore {
    public static void main(String[] args, Object MobilePhone) {
        Scanner input = new Scanner(System.in);
        String customer = "";

        System.out.println("Patika Store'a Hoşgeldiniz! ");
        System.out.println();
        System.out.println("***Patika Store Ürün Yönetim Paneli***");
        System.out.println(" 1- Notebook İşlemleri\n " +
                           "2- Cep Telefonu İşlemleri\n " +
                           "3- Marka Listele\n " +
                           "4- Çıkış Yap ");

        System.out.print("Bir işlem seçiniz: ");
        int select= input.nextInt();

        TreeSet <String> brands = new TreeSet<>();
        brands.add("-Samsung");
        brands.add("-Lenovo");
        brands.add("-Apple");
        brands.add("-Huawei");
        brands.add("-Casper");
        brands.add("-Asus");
        brands.add("-HP");
        brands.add("-Xiami");
        brands.add("-Monster");


        switch (select) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Markalarımız");
                for (String b: brands) {
                    System.out.println(b);
                }
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                break;
        }

    }
}
