
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// in this program, the opponent's moves are randomized, but my move is to simply play rock everytime

public class SixthChitnisAryana {
    private List<String> myMoves; 
    private List<String> theirMoves; 
    private int myScore; 
    private int theirScore; 

    public SixthChitnisAryana() {
        myMoves = new ArrayList<>();
        theirMoves = new ArrayList<>();
        myScore = 0;
        theirScore = 0;
    }

    public String playingMoves() {
    
        String[] possibleMoves = {"Rock", "Paper", "Scissors"};
        String myMove = possibleMoves[0];


        myMoves.add(myMove);
        return myMove;
    }

    public void playRound(String theirMove) {
        String myMove = playingMoves();
        theirMoves.add(theirMove);


       
        if (myMove.equals(theirMove)) {
            System.out.println("It's a draw. Both of you did " + myMove);
        } else if (
            (myMove.equals("Rock") && theirMove.equals("Scissors")) ||
            (myMove.equals("Paper") && theirMove.equals("Rock")) ||
            (myMove.equals("Scissors") && theirMove.equals("Paper"))
        ) {
            System.out.println("Yayyyyy you won this round!!! Your Move: " + myMove + ", Opponent's Move " + theirMove + "\n" + "Your Score: " + myScore + ", Opponent's Score: " + theirScore);
            myScore += 1;
            theirScore -= 1;
        } else {
            System.out.println("Awwwwww you lost this round :( Your Move: " + myMove + ", Opponent's Move: " + theirMove + "\n" + "Your Score: " + myScore + ", Opponent's Score " + theirScore);
            myScore -= 1;
            theirScore += 1;
        }
    }

    public void newGame() {
       
        Random randomNum = new Random();
        int rounds = randomNum.nextInt(401) + 100;


        System.out.println("This game has " + rounds + " rounds!");


        for (int i = 0; i < rounds; i++) {
            
            String[] moves = {"Rock", "Paper", "Scissors"};
            String theirMove = moves[randomNum.nextInt(moves.length)];
            playRound(theirMove);
}
System.out.println("Game over!");
System.out.println("Your final score: " + myScore);
System.out.println("Opponent's final score: " + theirScore);


if (myScore > theirScore) {
    System.out.println("Yayyyyy you won!!!!");
} else if (myScore < theirScore) {
    System.out.println("Awwwww sorry but you lost.");
} else {
    System.out.println("It's a draw.");
}

    }
    public static void main(String[] args) {
        SixthChitnisAryana game = new SixthChitnisAryana();
        game.newGame();
    }



}