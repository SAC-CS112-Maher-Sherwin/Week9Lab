
package guessanumber;
import javax.swing.JOptionPane;

public class GuessANumber {

    public static void main(String[] args) {
        int round = 1;
        
        do {
            
            RandomNumber i = new RandomNumber();
            int ComputerNumber = i.GetANumber_Between_1_and_10();
                
            
            String UserGuess = JOptionPane.showInputDialog("\nI'm thinking of a number between 0 and 10."
                    + "\nWhat is it?");
            
            int UserGuessInt = Integer.parseInt(UserGuess);
       
                    
                if (UserGuessInt  == ComputerNumber){
                    String Equal = String.format("Your guess is correct! My number is %d.", ComputerNumber);
                    JOptionPane.showMessageDialog(null , Equal);
                }
                else {
                    String Big = String.format("Your guess is too big. My number is %d.", ComputerNumber);
                    String Small = String.format("Your guess is too small. My number is %d.", ComputerNumber);
                    JOptionPane.showMessageDialog(null , (UserGuessInt > ComputerNumber)? Big : Small);
                }
            
                round++;
                
        }  
        
        while (round < 4);
        
    }
    
}