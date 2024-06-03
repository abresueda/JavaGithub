package Week6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderPlusFromFile {
    public static void main(String[] args) throws IOException {
        //Dosyayı oluştur.
        File file = new File("metin.txt");
        boolean value = file.createNewFile();

        //BufferedReader ve FileReader sınıflarıyla dosyayı oku.
        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            String line;
            int result = 0;
            //Dosya satırlarını gezerek toplama işlemini gerçekleştir.
            while ((line = input.readLine()) != null ) {
                result += Integer.parseInt(line);
            }

            System.out.println("Toplam: " + result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
