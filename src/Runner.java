import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Guesser guesser = new Guesser();
        Umpire umpire = new Umpire();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Scanner sc = new Scanner(System.in);

        System.out.println("Guesser, please input a num (0-50):");
        guesser.guesserNum = sc.nextInt();

        umpire.guesserNum = guesser.guesserNum;

        if (umpire.guesserNum > 50 || umpire.guesserNum < 0) {
            System.out.println("Number entered is not within 0-50.");
        } else {
            System.out.println("Player 1, please enter your number:");
            player1.playerNum = sc.nextInt();
            umpire.playerNum[0] = player1.playerNum;

            System.out.println("Player 2, please enter your number:");
            player2.playerNum = sc.nextInt();
            umpire.playerNum[1] = player2.playerNum;

            System.out.println("Player 3, please enter your number:");
            player3.playerNum = sc.nextInt();
            umpire.playerNum[2] = player3.playerNum;

            umpire.checkWinner();
        }
    }
}
