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


















}

