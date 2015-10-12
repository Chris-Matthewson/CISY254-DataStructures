package Lab6_Stacks;
import java.util.Scanner;

/**
 * runner
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class Lab06StackTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String userSelection;
        
        do
        {
            System.out.println("\n=======================================");
            System.out.println("Lab 6 Stacks - Runner...Test with:\n");
            System.out.println("I - Stack of Integer");
            System.out.println("S - STack of String");
            System.out.println("C - Stack of Car");

            System.out.print("\nEnter Choice: (Q to quit): ");
            userSelection = input.nextLine();
            
            switch (userSelection.toLowerCase())
            {
                case"i":
                        System.out.println("\n===================INTEGER====================");
                        RunTestStackWithInteger.runMe();
                        break;
                case "s":
                        System.out.println("\n===================STRING====================");
                        RunTestStackWithString.runMe();
                        break;
                case "c":
                        System.out.println("\n===================CAR====================");
                        RunTestStackWithCar.runMe();
                        break;
                case "q":
                        System.out.println("\n===================QUIT====================");
                        System.out.println("\nbye bye!");
                        break;
                default:
                    System.out.println("\nhuh?");
            }
            
        } while ( !(userSelection.equalsIgnoreCase("Q")) );

    }
    
}
