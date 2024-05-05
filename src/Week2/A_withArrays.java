package Week2;

public class A_withArrays {
    public static void main(String[] args) {
        String[][] matrix = new String[7][4];             /*Yıldızlarla B harfi oluşturmak için 7 satırlı 4 sütunlu
                                                            bir dizi olması gerekir.*/

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {        //Dizinin satırlarında yıldız koyması gereken yerler için.
                    matrix[i][j] = " * ";
                } else if (j == 0 || j == 3) {           //Dizinin sütunlarında yıldız koyması gereken yerler için.
                    matrix[i][j] = " * ";
                } else {
                    matrix[i][j] = "   ";                //Belirtilen indisler dışındakilere boşluk koyması için.
                }
            }
        }
        for (String[] row : matrix) {                    /*Dizilerin çıktısını almak için for each döngüsüyle
                                                           satır ve sütunları dolaşıyoruz.*/
            for (String col : row) {
                System.out.print(col);
            }
                System.out.println();
        }
    }
}
