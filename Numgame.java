import java.util.Scanner;
import java.util.Random;
public class Numgame
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int lowerBound = 1;    
int upperBound = 100;   
int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
int maxTries = 10;      
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
int tries = 0;
while (tries < maxTries) {
System.out.print("Enter your guess: ");
int guess = scanner.nextInt();
tries++;
if (guess < lowerBound || guess > upperBound)
 {
System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
} 
else if (guess < secretNumber)
{
System.out.println("Try a higher number.");
}
else if (guess > secretNumber) 
{
System.out.println("Try a lower number.");
} else
{
System.out.println("Congratulations! You guessed the number in " + tries + " tries.");
break;
}
}
if (tries >= maxTries)
{
System.out.println("Sorry, you've reached the maximum number of tries. The secret number was " + secretNumber + ".");
}
scanner.close();
}
}