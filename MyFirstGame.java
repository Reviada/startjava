import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int i = (int) (Math.random () * 100 + 1);
        int a;
        do {

            System.out.println("Guess the number from 0 to 100");
            Scanner scanner = new Scanner (System.in);
            a = scanner.nextInt();
        
        if (a > i) {
            System.out.println("This number is greater than what the computer guessed");

        } else if (a < i) {
            System.out.println("This number is less than what the computer less");
        }

        }while (a != i);
    System.out.println("Congratulations, the number " + a + " is right!");
  }
}