import java.util.Scanner;
public class guessTheNumber {
 public static void main(String[] args)
    {
        int random=(int)(Math.random()*10+1);
        System.out.println("Enter a number between 1 to 10");
        Scanner input=new Scanner(System.in);
        int guess;
        guess = input.nextInt();

        if(guess != random)
        {
            System.out.println("Keep guessing");
            guess = input.nextInt();
           
        }
        else
        {
            System.out.println("You got the right number.");


        }
    }
}
