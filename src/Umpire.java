public class Umpire {

    int guesserNum;
    int[] playerNum = new int[3];

    void checkWinner(){
        for(int i=1; i<=playerNum.length; i++){
            if(guesserNum == playerNum[i-1]){
                System.out.println("Player " + i + " wins!");
                return;
            }
        }
        System.out.println("Nobody got it :(");
    }
}