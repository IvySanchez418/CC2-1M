import java.util.Scanner;

public class GuessTheNumber
{
    
public static void main(String args[]) 
{
    Scanner keyboard = new Scanner(System.in);
    int count = 0;
    int a = 1 + (int) (Math.random() * 99);
    int guess = 0;

    System.out.println("I am thinking of a number from 1 to 100"
        + " ... guess what it is ?");

    while (guess != a && count<5 ) {
        guess = keyboard.nextInt();
        count++;
        if (guess > a) {
            System.out.println("lower!");
        } else if (guess < a) {
            System.out.println("higher!");
}
    }}
}
