/*****************************************
 * A template for a Human Nim player
 ****************************************/ 
import java.util.*;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human(){
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(int marblesLeft){
    
        System.out.println("It is your turn. There are " + marblesLeft + "marbles left.");
        System.out.println("How many marbles do you want to take? (1 - " + marblesLeft / 2 + "): ");
        choice = input.nextInt();

        while (choice < 1 || choice > marblesLeft / 2){
            System.out.println("Invalid choice. Please try again.");
            System.out.print("How many marbles do you want to take? (1 - " + marblesLeft / 2 + "): ");
            choice = input.nextInt();
        }
        
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
