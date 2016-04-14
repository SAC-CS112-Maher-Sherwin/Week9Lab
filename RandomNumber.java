public class RandomNumber {
    
    public int GetANumber_Between_1_and_10() {
        
        int i = 1 + (int) (Math.random() * 10);
        System.out.println(i);
        return i;
        
    }
}
