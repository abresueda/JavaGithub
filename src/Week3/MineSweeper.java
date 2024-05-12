package Week3;

import java.util.*;

/*Mayın tarlası projesinde kullanıcının girdiği koordinatlarla mayına basmasıyla oyunu kaybettiği,
hiçbir mayına basmadan mayınsız bütün kutuları açmasıyla da oyunu kazandığı bir algoritma yapıyoruz.*/

public class MineSweeper {
    static int row;
    static int col;
    static String[][] matrix;
    static String[][] mines;
    boolean[][] revealed;

    public MineSweeper(String row, String col) {
        this.row = Integer.parseInt(row);
        this.col = Integer.parseInt(col);

        //Kullanıcının 2'nin altında değer girerse, matriksi oluşturmak için uygun sayıları girmesini sağlıyoruz.
        if (this.row < 2 || this.col < 2) {
            System.out.println("You should enter the dimensions appropriate for the matrix.");
        } else {
            System.out.println("Welcome to MineSweeper!\nGood luck!");

            matrix = new String[this.row][this.col];
            revealed = new boolean[Integer.parseInt(row)][Integer.parseInt(col)];
            placeMines();
            displayBoard();
            startGame();
        }
    }

    public void placeMines() {
        Random rand = new Random();
        mines = new String[row][col];
        int counter = 0;
        int minesProbability = (row * col) / 4;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mines[i][j] = " - ";
            }
        }

        //Eleman sayısının 4'te 1'i kadar hücrelere mayın yerleştiriyoruz.
        while (counter < minesProbability) {
            int k = rand.nextInt(row);
            int n = rand.nextInt(col);

            //Mayın koyduğu hücreye tekrar mayın koymasını engellemek için if bloğunu kullanıyoruz.
            if (!mines[k][n].equals(" * ")) {
                mines[k][n] = " * ";
                counter++;
            }
        }

        System.out.println("Mayınların Konumu:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mines[i][j]);
            }
            System.out.println();
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public void displayBoard() {
        //Matriksin boş olmadığı durumlarda hangi kutuların açık olup olmayacağını kontrol ediyoruz.
        if (revealed != null) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (revealed[i][j]) {
                        System.out.print(" " + matrix[i][j] + " ");         //Açılan kutuları gösterecek.
                    } else {
                        System.out.print(" - ");                            //Kapalı kutuları gösterecek.
                    }
                }
                System.out.println();
            }
        }
    }

    public void startGame() {
        Scanner inp = new Scanner(System.in);
        int rowGame, colGame;

        do {
            System.out.print("Enter the row: ");
            rowGame = Integer.parseInt(inp.nextLine());
            System.out.print("Enter the column: ");
            colGame = Integer.parseInt(inp.nextLine());

            //Kullanıcının matriksin koordinatlarında değerler girmesini sağlıyoruz.
            if (rowGame > row - 1 || rowGame < 0 || colGame > col - 1 || colGame < 0) {
                System.out.println("Please enter a number within valid coordinates.");
                continue;
            }
            //Önceden açılan bir kutu varsa tekrar o kutunun koordinatlarını girmemesini sağlıyoruz.
            if (revealed[rowGame][colGame]) {
                System.out.println("Please enter coordinates different from the previous one.");
                continue;
            }
            //Kullanıcının mayına basıp oyunu kaybetme ihtimalini yazıyoruz.
            if (mines[rowGame][colGame].equals(" * ")) {
                System.out.print("You hit a mine!\nGame Over!");
                boolean isGameWon = false;
                break;
            } else {
                //Kullanıcı oyunu kaybetmezse oyunun tekrar boardu göstermesini sağlıyoruz.
                findMines(rowGame, colGame);
                displayBoard();
            }
            //Oyun kazanılana kadar döngünün devam etmesini sağlıyoruz.
        } while (!isGameWon());

        if (isGameWon()) {
            System.out.println("Congratulations! You won the game! ");
        }
    }

    public void findMines(int rowGame, int colGame) {
        if (revealed[rowGame][colGame]) {
            return;
        }
        int mineCount = 0;

        /*Kutunun etrafındaki komşu kutuları gezerken, matriksin sınırlarını aşmaması için math.max ve math.min
        fonsksiyonlarını kullanıyoruz. Sayacı her seferinde arttırarak mayın sayısını tespit ediyoruz.*/
        for (int i = Math.max(0, rowGame - 1); i <= Math.min(row - 1, rowGame + 1); i++) {
            for (int j = Math.max(0, colGame - 1); j <= Math.min(col - 1, colGame + 1); j++) {
                if (mines[i][j].equals(" * ")) {
                    mineCount++;
                }
            }
        }

        revealed[rowGame][colGame] = true;
        matrix[rowGame][colGame] = String.valueOf(mineCount);
    }

    //Oyunda tüm kutular açıldıysa ve açılan kutular mayın değilse, oyun kazanılmıştır.
    public boolean isGameWon() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!revealed[i][j] && !mines[i][j].equals(" * ")) {
                    return false;
                    /*Oyunun kazanılmadığı yani açılmayan kutuların olduğu ve açılan kutulardan
                      birinin mayın olduğu durumlarda oyunun devam etmesi için false döner.*/
                }
            }
        }
        return true;
    }
}
