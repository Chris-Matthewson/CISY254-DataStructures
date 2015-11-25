package Project_3_Trees;

import Lab08_09_Trees.Tree;
import Project_2_BuildYourOwnClass.Computer;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by Chris on 11/24/15.
 */
public class ComputerTreeDriver
{
    /**
     * Main entry point for the program.
     *
     * @param args arguments
     */
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in); //scanner for user input
        Tree<Computer> computerTree = new Tree<>(); //the tree

        String userInput = "";
        boolean exitRequested = false;



        while(!exitRequested)
        {
            System.out.println("Please enter a command:");
            System.out.println("A - ADD a computer to the tree.");
            System.out.println("R - REMOVE a computer from the tree if it exits.");
            System.out.println("S - SIZE of the tree.");
            System.out.println("D - DISPLAY the contents of the tree.");
            System.out.println("X - EXIT the program.");

            //get user input
            userInput = inputScanner.nextLine().toLowerCase();

            switch (userInput) //use .toLowerCase() because we are not concerned about case sensitivity
            {
                case "a":
                case "add":
                    //prompt the user to define a computer and then attempt to remove it
                    System.out.println("Please enter the name of the computer you are trying to remove");
                    String computerNameAdd = inputScanner.nextLine();

                    System.out.println("Please enter the speed of the computer");
                    double computerSpeedAdd = Double.parseDouble(inputScanner.nextLine());

                    computerTree.add(new Computer(computerNameAdd, computerSpeedAdd));
                    System.out.println("Added.");
                    break;
                case"r":
                case "remove":
                    //prompt the user to define a computer and then attempt to remove it
                    System.out.println("Please enter the speed of the computer you would like to remove.");

                    boolean removeSuccessful = computerTree.remove(new Computer("", Double.parseDouble(inputScanner.nextLine())));

                    if (removeSuccessful)
                    {
                        System.out.println("Removed.");
                    }
                    else
                    {
                        System.out.println("Not removed.");
                    }
                    break;
                case "d":
                case "display":
                case "contents":
                    //show contents of the tree
                    System.out.println("Displaying contents of tree:");
                    computerTree.printTree();
                    break;
                case "s":
                case "size":
                    System.out.println("Your tree has " + computerTree.size() + " elements.");
                    break;
                case "x":
                case "exit":
                case "q":
                case "quit":
                    exitRequested = true;
                    break;
                default:
                    System.out.println("Invalid command: '" + userInput + "'");
                    break;
            }
        }
    }
}
