package Week2;

public class PalindromSayilar {
    //Boolean değere sayının palindrom olup olmadığını atadık.
    static boolean isPalindrom(int number) {

        //Değişkenleri tanımlıyoruz.
        int temp = number, reverseNumber = 0, lastNumber;

        //While döngüsünde sayıyı basamaklarına ayırıp yeni sayıyı oluşturuyoruz.
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        System.out.println("Sayı : " + number);
        System.out.println("Sayının ters hali: " + reverseNumber);

        //Eğer sayı yeni sayıyla aynıysa palindrom sayıdır.
        if (number== reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
            System.out.println(isPalindrom(9009));

    }
}
