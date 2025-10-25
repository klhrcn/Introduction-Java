/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
import java.util.*;
public class Computer{
    
    private int mode;
    private int choice;
    private Random rand;
    
    public Computer(int m){
        mode = m;
        choice = -1;
        rand = new Random();
    }
    
    public void move(int marblesLeft){
    
        if (mode == 0){
            choice = 1 + rand.nextInt(marblesLeft / 2);
        } else {
            choice = smartMove(marblesLeft);
        }
        System.out.println("Computer takes " + choice + "marbles.");
        
    }
    
    private int smartMove(int marblesLeft){
        int [] powersOfTwoMinusOne = {63, 31, 15, 7, 3};

        for (int target: powersOfTwoMinusOne){
            if (marblesLeft > target){
                return marblesLeft - target;
            }
        }

        return 1 + rand.nextInt(marblesLeft / 2);
    }


    
    public int getChoice(){
        return choice;
    }
    
    
}
