
package finalact2_numbersearch;
import java.util.*;


public class FinalAct2_NumberSearch {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 0; i < 10; i++)
        {
            double temp = Math.random()*100;
            int value = (int)temp;
            
            numbers.add(value);
        }
        
        for(int i : numbers){
            System.out.println("Here are the random Numbers out of order = " + i);
        }
        
        Collections.sort(numbers);
        
        
        for(int i : numbers){
            System.out.println("Here are the numbers sorted = " + i);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in the number you would like to find.");
        
        int userInput = scanner.nextInt();
       int guess = numbers.indexOf(userInput);
        
       for(int i : numbers)
       {
           
           if(guess == -1){
               System.out.println("Guess is not found.");
               break;
           }
           else{
               System.out.println("Guess found at Array Index " + guess);
               break;
           }
       }
        
    }
}
