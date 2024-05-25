package Week5;

import java.util.HashMap;
import java.util.Map;

public class FindTheWord {
    public static void main(String[] args) {

        String sentence= "Bir ulusun asker ordusu ne kadar güçlü olursa olsun," +
                " kazandığı zafer ne kadar yüce olursa olsun," +
                " bir ulus ilim ordusuna sahip değilse, savaş meydanlarında kazanılmış zaferlerin sonu olacaktır."+
                " Bu nedenle bir an önce büyük, mükemmel bir ilim ordusuna sahip olma zorunluluğu vardır.";


        //Noktalama işaretlerini kaldır ve hepsini küçük harf yap.
        sentence = sentence.replaceAll("[^a-zA-ZğüşöçıİĞÜÖÇ ]", "").toLowerCase();

        //Boşluklara göre cümleyi ayır.
        String [] splitSentence = sentence.split("\\s+");

        //HashMap'e kelimeleri at. Kelime daha önce eklendiyse +1 ekleniyor.
        HashMap <String, Integer> wordNumber = new HashMap<>();
        for (String words: splitSentence) {
            wordNumber.put( words, wordNumber.getOrDefault(words, 0) + 1);
        }

        String findTheWord = null;
        int maxNumber = 0;

        //Map üzerinde döngü kuruluyor. Map.Entry kullanılarak anahtar ve değer belirleniyor.
        for (Map.Entry<String,Integer> entry : wordNumber.entrySet()) {
            if (entry.getValue() > maxNumber) {
                findTheWord = entry.getKey();
                maxNumber = entry.getValue();
            }
        }

        System.out.println("En çok geçen kelime: " + findTheWord);
        System.out.println("Kaç kez geçtiği: " + maxNumber);

    }
}
