package numberguess;
import java.util.*;
import java.util.Random;
public class NumberGuess 
{
    public static void main(String[] args) 
    {
         System.out.println("Welcome to Number Guessing Game!!");
         Random rand = new Random();
         int right_num = rand.nextInt(100);
         int tries = 10;
         int guess,i;
         Scanner o = new Scanner(System.in);
         System.out.println("You have only 10 attempts to guess the number!!");
         for(i=0;i<tries;i++)
         {
             System.out.println("Enter a guess between 1 and 100:");
             guess = o.nextInt();
             
             if(guess==right_num)
             {
                 System.out.println("Congratulations you have guessed the correct number!!");
                 System.out.println("You took "+i+" tries");
                 System.out.println("You Win!!");
                 break;
             }
             else if(guess<right_num && i!=tries-1)
             {
                 System.out.println("Your guess is too low!!");
                 System.out.println("Try Again!!");
             }
             else if(guess>right_num && i!=tries-1)
             {
                 System.out.println("Your guess is too high!!");
                 System.out.println("Try Again!!");
             }
         }
         if(i==tries)
         {
             System.out.println("You have completed 10 attempts");
         }
         System.out.println("The number was: "+right_num);
         if(i<5)
         {
             System.out.println("Your score is 10");
         }
         else if(i<9)
         {
             System.out.println("Your score is 9");
         }
         else
         {
             System.out.println("No Score...Try again...Thank You");
         }
    }
}
