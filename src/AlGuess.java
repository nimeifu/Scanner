import java.util.*;
public class AlGuess {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 and 100(inclusive)");

        int AlNum=50;
        int min=1;
        int max=101;

        System.out.println("Is " + AlNum + " this higher or lower compare to your number? Or it is correct? Please tell me.");
        Scanner input=new Scanner(System.in);
        String message;
        message = input.nextLine();

        while(message.equalsIgnoreCase("correct") == false)
        {
            if(message.equalsIgnoreCase("higher")==true)
            {
                min=AlNum;
               AlNum=(min+max)/2;
               System.out.println("Is "+AlNum+" this higher or lower compare to your number? Or it is correct? Please tell me.");
               message = input.nextLine();

            }
            else if(message.equalsIgnoreCase("lower")==true)
            {
                max=AlNum;
                AlNum=(min+max)/2;
                System.out.println("Is "+AlNum+" this higher or lower compare to your number? Or it is correct? Please tell me.");
                message = input.nextLine();
            }

        }
        System.out.println("Al:I got your number");

    }
}
