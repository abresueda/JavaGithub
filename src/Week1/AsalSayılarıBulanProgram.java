package Week1;

public class AsalSayılarıBulanProgram {
    public static void main(String[] args) {

        //For döngüsü içinde 1-100 aralığındaki asal sayıları bul.
        for (int n = 2; n < 100; n++) {
            boolean isAsal = true;
            for (int k = 2; k <= Math.sqrt(n); k++) { //Aralıktaki sayıların asal olup olmadığını kontrol etmek için.//
                if (n % k == 0) {
                    isAsal = false;
                    break;
                }
            }   if (isAsal) {
                System.out.println(n + " asal sayıdır.");

            }
        }
    }
}
