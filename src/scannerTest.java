import java.util.Scanner;

public class scannerTest
 {
     public static void main(String[] args)
     {
         System.out.println("what is your name?");
         Scanner input =new Scanner(System.in);
         String Name=input.nextLine();
         System.out.println("What is your age?");
         int age=input.nextInt();
         input.close();

         System.out.println("Nice to meet you " + Name);
         System.out.println("Ok you are "+age+" years old now");
     }
}
