package Week2;

public class PalindromeWords {

    static boolean isPalindrome(String str) {

        int i = 0;                                      //Kelimenin ilk harfinin indeksini girdik.
        int j = str.length()-1 ;                        //Kelimenin son harfinin indeksini girdik.

        while (i < j) {                                 //Döngünün i'nin j'den küçük olduğu ana kadar dönmesini istiyoruz.
            if (str.charAt(i) != str.charAt(j)) {       //i ve j indeksleri charAt ile harfleri gezerek eşit olmadığı sürece false dönecek.

                return false;
            }
            i++;
            j--;
        }
        return true;                                    //if dışındaki durumlarda true dönecek.
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("kayak"));
    }

}
