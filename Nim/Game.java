/*****************************************
 * A template for a Nim game
 ****************************************/ 
import java.util.*;


public class Game{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private boolean humanTurn;
    
    public Game(int difficulty){
        Random rand = new Random();
        marbles = 10 + rand.nextInt(91);

        int mode;
        if (difficulty == 1){
            mode = 0;
        }else{
            mode = 1;
        }
    }

     
    public void play(){
        
        System.out.println("The game has started! The initial size of the pile is " + marbles + " marbles.");
        Random rand1 = new Random();
        int rand2 = rand1.nextInt(2);
        if (rand2 == 1){
            humanTurn = true;
        }

        while (marbles > 1){
            if(humanTurn) {
                humanPlayer.move(marbles);
                marbles -= humanPlayer.getChoice();
            }

            System.out.println("Marbles left: " + marbles);
            humanTurn = !humanTurn;

            if (!humanTurn){
                computerPlayer.move(marbles);
                marbles -= computerPlayer.getChoice();
            }

        }

        if (humanTurn){
            System.out.println("Computer wins!");
        }else{
            System.out.println("You win!");
        }
    }
}
