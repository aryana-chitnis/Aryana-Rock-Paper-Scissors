// Java implementation of a Rock-Paper-Scissors game
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SixthChitnisAryana {
    private List<String> myMoves; // List to store your moves
    private List<String> theirMoves; // List to store opponent's moves
    private int myScore; // Your score
    private int theirScore; 

    public SixthChitnisAryana() {
        myMoves = new ArrayList<>();
        theirMoves = new ArrayList<>();
        myScore = 0;
        theirScore = 0;
    }

    public String playingMoves() {
    
        String[] possibleMoves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        String myMove = possibleMoves[random.nextInt(possibleMoves.length)];


        // Add your move to the history
        myMoves.add(myMove);
        return myMove;
    }

    public void playRound(String theirMove) {
        String myMove = playingMoves();
        theirMoves.add(theirMove);


        // Determine the result of the round
        if (myMove.equals(theirMove)) {
            System.out.println("It's a draw. Both of you did " + myMove);
        } else if (
            (myMove.equals("Rock") && theirMove.equals("Scissors")) ||
            (myMove.equals("Paper") && theirMove.equals("Rock")) ||
            (myMove.equals("Scissors") && theirMove.equals("Paper"))
        ) {
            System.out.println("Yayyyyy you won this round!!! Your Score: " + myMove + ", Opponent's Score: " + theirMove);
            myScore += 1;
            theirScore -= 1;
        } else {
            System.out.println("Awwwwww you lost this round :( Your Score: " + myMove + ", Opponent's Score: " + theirMove);
            myScore -= 1;
            theirScore += 1;
        }
    }

    public void newGame() {
        // Number of rounds (random between 100 and 500)
        Random randomNum = new Random();
        int rounds = randomNum.nextInt(401) + 100;


        System.out.println("This game has " + rounds + " rounds!");


        for (int i = 0; i < rounds; i++) {
            
            String[] moves = {"Rock", "Paper", "Scissors"};
            String theirMove = moves[randomNum.nextInt(moves.length)];
}

    }
}