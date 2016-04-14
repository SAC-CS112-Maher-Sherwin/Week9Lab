package guessanumber;

public class RandomNumber {
    
    int i = 1 + (int) (Math.random() * 10);
            
    public int GetANumber_Between_1_and_10() {
        
        return i;
        
    }
}

