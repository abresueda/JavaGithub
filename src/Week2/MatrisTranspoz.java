package Week2;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int [][] matrix = { {1, 2},                       //İki boyutlu dizimizi yazıyoruz.
                            {3, 4},
                            {5, 6},
        };

        System.out.println("Matrisin Transpozu: ");

        for (int i=0; i< matrix[0].length; i++) {        //İlk önce matrisin sütunlarını geziyoruz.
            for (int j=0; j< matrix.length; j++) {       //Sonrasında satırlarını gezerek yazdırıyoruz.
                System.out.print( matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
