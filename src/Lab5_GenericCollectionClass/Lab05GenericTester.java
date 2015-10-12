package Lab5_GenericCollectionClass;
import java.util.Scanner;
/**
 * runner
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class Lab05GenericTester 
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
            System.out.println("Lab 5 Runner...Test with:\n");
            System.out.println("I - Integer Class");
            System.out.println("S - String Class");
            System.out.println("C - Car Class");

            System.out.print("\nEnter Choice: (Q to quit): ");
            userSelection = input.nextLine();
            
            switch (userSelection.toLowerCase())
            {
                case"i":
                        System.out.println("\n===================INTEGER====================");
                        RunTestLinkedBagWithInteger.runMe();
                        break;
                case "s":
                        System.out.println("\n===================STRING====================");
                        RunTestLinkedBagWithString.runMe();
                        break;
                case "c":
                        System.out.println("\n===================CAR====================");
                        RunTestLinkedBagWithCar.runMe();
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
