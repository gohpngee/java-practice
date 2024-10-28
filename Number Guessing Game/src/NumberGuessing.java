import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public void ft_guess(){
        Random random = new Random();
        int randomint = random.nextInt(1000) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        System.out.print(randomint + "\n");
        System.out.print("Try guessing a number from 1 to 1,000 ;)" + "\n");

        while (randomint != guess) {
            guess = scanner.nextInt();
            System.out.println("Your number is " + guess);
            if (randomint > guess)
                System.out.println("Higher, try again! ;)");
            else
                System.out.println("Lower, try again! ;)");
        }
        scanner.close();
        System.out.println("You got it!! Good job man, the number is indeed " + randomint);
    }

    public static void main(String[] args){
        NumberGuessing game = new NumberGuessing();
        game.ft_guess();
    }
}
