import java.util.*;
import java.io.*;

public class Fail2Ban{
    
    public static void main(String[] args) throws FileNotFoundException{

        //create variables and initalize when possible
        ArrayList<String> ipAddress = new ArrayList<String>();
        ArrayList<String> ipAddressChecked = new ArrayList<String>();

        //Recognize file names that system reads input of and prints output in
        String inputFileName = args[0];
        String outputFileName = args[1];

        //construct scanner and printwriter objects
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        //read input
        while (in.hasNextLine()){

            String line = in.nextLine();
            String[] split = line.split(" ");

            if (split.length > 6){
                String status = split[5];

                //check which IP addresses are invalid
                if(status.equals("Invalid")){
                    for (int i= 0; i < split.length; i++){
                        if (split[i].equals("from") && i + 1 < split.length){
                            String ip = split[i + 1];
                            ipAddress.add(ip);
                            break;
                        }
                    }
                }
            }
        }
       
        //check which IP Addresses were invalid more than three times
        for(String ip : ipAddress){
            if(!ipAddressChecked.contains(ip)){
                int count = 0;
                for (String checkIP : ipAddress){
                    if(ip.equals(checkIP)){
                        count++;
                    }
                }
                if (count >= 3){
                    ipAddressChecked.add(ip);
                }
            }
        }

        //write output
        for (String ip : ipAddressChecked){
                out.println(ip);
        }
         in.close();
         out.close();
        
    }

}