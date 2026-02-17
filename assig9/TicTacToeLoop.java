import java.util.Scanner;

public class TicTacToeLoop {

    public static void main(String[] args) {

        char[][] board = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'}
        };

        Scanner sc = new Scanner(System.in);
        char player = 'X';

        while (true) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Player " + player + " enter position: ");
            int pos = sc.nextInt();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == (char)(pos + '0')) {
                        board[i][j] = player;
                    }
                }
            }

            player = (player == 'X') ? 'O' : 'X';
        }
    }
}
