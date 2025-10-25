import java.util.Random;

//public Drunkard class defined
public class Drunkard{
    //Instance variables defined below
    
    //instance variable for drunkard's current avenue (x location)
    private int currentAvenue;
    //instance variable for drunkard's current street (y location)
    private int currentStreet;
    //instance variable for drunkard's new x location, after the program adds random steps
    private int newAvenue;
    //instance variable for drunkard's new y location, after the program adds random steps
    private int newStreet;


    // Constructor 

    public Drunkard (int newAvenue, int newStreet){
        //instance variable is set to variable in the parameter of the method
        this.newAvenue=newAvenue;
        this.newStreet=newStreet;
    }


    //method that moves drunkard to the next randomly chosen adjacent intersection
    public void step(){
        Random r = new Random();
        int direction = r.nextInt(4);
        
        //program sets different directions for the drunkard to move in
        //a random number of 1 will make the drunkard move in positive x (East) direction
        if (direction == 0){
            newAvenue = currentAvenue + 1;
        }
        //a random number of 1 will make the drunkard move in negative x (West) direction
        if (direction == 1){
            newAvenue = currentAvenue - 1;
        }
        //a random number of 1 will make the drunkard move in positive y (North) direction
        if (direction == 2){
            newStreet = currentStreet + 1;
        }
        //a random number of 1 will make the drunkard move in negative y (South) direction
        if (direction == 3){
            newStreet = currentStreet - 1;
        }
    }

    //method that takes an integer as a parameter called steps and moves the
    //the drunkard 'steps' intersections from his current location 
    public void fastForward(int steps){        
        //program randomizes the number of 'steps' intersections, in both directions, horizontally and vertically
        for (int i=0;i<=steps;i++){
            step();
        }
    }

    
    
    //method that returns a String indicating the drunkard's current location
    public String getLocation(){
        String location = newAvenue + ", " + newStreet;
        return location;
    }

    //method that reports the drunkards distance in blocks from where he started, 
    //calculated using the Manhattan distance metric 
    public int howFar(){
        int far = (newAvenue - currentAvenue) + (newStreet - currentStreet);
        return far;
    }
}