import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        double heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz: ");
        heat = inp.nextDouble();


        if (heat < 5) {
            System.out.print("Kayak yapmaya gidebilirsin.");
        } else if ((heat > 5) && (heat < 25)) {
            if (heat < 15) {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (heat > 10) {
                System.out.print("Pikniğe gidebilirsin.");
            }
        }if (heat > 25) {
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}