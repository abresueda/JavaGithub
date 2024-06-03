package Week6;

import java.io.*;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String text = scanner.nextLine();

        //Dosyada en son kaydedilen metni okumak için metodu çağırıyoruz.
        readFromFile();

        try (
            //Dosyaya metni yazmak için FileWriter sınıfını kullanıyoruz.
            FileWriter fileWriter = new FileWriter("metin.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter))
        {
            printWriter.print(text);
        } catch (IOException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
        scanner.close();
    }

    private static void readFromFile() {
        File file = new File("metin.txt");
        if (file.exists()) {

            //En son kaydedilen metni tampondan okumak için BufferedReader sınıfını kullanıyoruz.
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

                String textReader;
                System.out.print("En son kaydedilen metin: ");
                while ((textReader = bufferedReader.readLine()) != null) {
                    System.out.println(textReader);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Henüz kaydedilmiş bir metin yok.");
        }
    }
}
