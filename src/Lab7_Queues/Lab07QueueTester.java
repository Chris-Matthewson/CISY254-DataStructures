package Lab7_Queues;

import java.util.Scanner;

/**
 * runner
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class Lab07QueueTester
{

    /**
     * @params args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userSelection;

        do
        {
            System.out.println("\n=======================================");
            System.out.println("Lab 7 Part 1 Queue - Runner...Test with:\n");
            System.out.println("I - Queue of Integer");
            System.out.println("S - Queue of String");
            System.out.println("C - Queue of Car");

            System.out.print("\nEnter Choice: (Q to quit): ");
            userSelection = input.nextLine();

            switch (userSelection.toLowerCase())
            {
                case"i":
                        System.out.println("\n===================INTEGER====================");
                        RunTestQueueWithInteger.runMe();
                        break;
                case "s":
                        System.out.println("\n===================STRING====================");
                        RunTestQueueWithString.runMe();
                        break;
                case "c":
                        System.out.println("\n===================CAR====================");
                        RunTestQueueWithCar.runMe();
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
