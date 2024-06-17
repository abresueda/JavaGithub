package Week2;

public class DizidekiElemanlarınFrekansı {

    //Eğer değer dizide bulunursa true, bulunmazsa false döner.
    static boolean isFind(int arr[], int value) {

        for (int i: arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,10,10,20,50,20,30};
        int [] repeater = new int[numbers.length]; //Frekansı hesaplanan sayıları saklar.

        int index = 0;

        System.out.println("Tekrar Eden Sayılar:");

        for (int i=0; i < numbers.length; i++) {
            int count = 1; //Her eleman için başlangıçta frekans 1 olarak belirlenir.

            /*isFind metodu, repeater dizisindeki değerleri kontrol ederek
            frekansı hesaplanan elemanları tekrar kontrol etmeyi engeller.*/
            if (!isFind(repeater, numbers[i])) {
                for (int j=i+1; j< numbers.length; j++) {
                    if (numbers [i] == numbers [j]) {
                        count++;
                    }
                }
                repeater[index++] = numbers[i];
                System.out.println(numbers[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
