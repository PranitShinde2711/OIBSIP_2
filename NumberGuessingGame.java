import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;//To generate random integer within a specific range
        int attempts = 0;
        int rounds=0;
        int score=0;
        int limit=7;
        while(true)
        {
            System.out.println("\n\nWelcome to the Number Guessing Game!");
            System.out.println("You have maximum of 10 rounds!");
            rounds++;
            attempts=0;
            System.out.println("This is your round"+" "+rounds);
            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it.");
            
                while (true) {
                        System.out.print("Enter your guess: ");
                        int guess = scanner.nextInt();
                        attempts++;
                        
                
                        if (guess < minRange || guess > maxRange) {
                            System.out.println("Please guess a number between " + minRange + " and " + maxRange + ".");
                        } else if (guess < targetNumber) {
                            System.out.println("Too low! Try again.");
                        } else if (guess > targetNumber) {
                            System.out.println("Too high! Try again.");
                        } else {
                            System.out.println("Congratulations! You've guessed the correct number " + targetNumber + " in " + attempts + " attempts.");
                            score++;
                            if(attempts<=5)
                            {
                                System.out.println("Hurrey!You have got a bonus point as you have guessed the number in the range of 1 to 5 attempts");
                                score++;
                            }
                            System.out.println("Your score is:"+score);
                            break;
                        }
                        if(attempts>=limit)
                        {
                            System.out.println("You have reached the limit! Better luck next time");
                            break;
                        }
                    
                }
            
            if(rounds>=10)
            {
                System.out.println("You have reached limit of rounds!");
                break;
            }
            
    
    } 
     scanner.close();

    }
    
}
