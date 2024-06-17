package Week2;

import java.util.Scanner;

public class FrequencyOfElements {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();

            for (int i=0; i< q; i++) {
                int n = scanner.nextInt();
                int leap = scanner. nextInt();
                int [] game  = new int[n];

                for(int j =0; j < n; j++) {
                    game[j] = scanner.nextInt();
                }

                System.out.println((canWin(leap,game)) ? "YES" : "NO");
            }

            scanner.close();
        }

        public static boolean canWin(int leap, int[] game) {
            return canWin(leap,game,0);
        }

        private static boolean canWin(int leap, int[] game, int i) {
            if(i>= game.length) {
                return true;
            }
            if(i<0 || game[i] == 1) {
                return false;
            }

            game[i] = 1;

            return canWin(leap, game, i+leap) ||
                    canWin(leap, game, i+1) ||
                    canWin(leap, game, i-1);
        }
    }
