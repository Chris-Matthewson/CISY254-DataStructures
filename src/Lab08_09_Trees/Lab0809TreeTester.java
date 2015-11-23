package Lab08_09_Trees;
import java.util.Scanner;

/**
 * runner
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class Lab0809TreeTester 
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
            System.out.println("Lab 8 and 9 Trees - Runner...Test with:\n");
            System.out.println("I - Tree of Integer");
            System.out.println("S - Tree of String");
            System.out.println("C - Tree of Car");

            System.out.print("\nEnter Choice: (Q to quit): ");
            userSelection = input.nextLine();
            
            switch (userSelection.toLowerCase())
            {
                case"i":
                        System.out.println("\n===================INTEGER====================");
                        Lab0809RunTestTreeWithInteger.runMe();
                        break;
                case "s":
                        System.out.println("\n===================STRING====================");
                        Lab0809RunTestTreeWithString.runMe();
                        break;
                case "c":
                        System.out.println("\n===================CAR====================");
                        Lab0809RunTestTreeWithCar.runMe();
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
