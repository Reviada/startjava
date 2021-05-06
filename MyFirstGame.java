import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int guess = (int) (Math.random() * 100 + 1);
        int number;
           System.out.println("Guess the number from 0 to 100");
           Scanner scanner = new Scanner(System.in);
            
        do {
            number = scanner.nextInt();

        if (number > guess) {
            System.out.println("This number is greater than what the computer guessed");
        }

        else if (number < guess) {
            System.out.println("This number is less than what the computer less");
        }

        } while (number != guess); 
    System.out.println("Congratulations, the number " + number + " is right!");
  }
 }