package Project_1_MoneyGrab;

import java.util.Scanner;

/**
 * Created by chrismatthewson on 9/28/15.
 */
public class MoneyGrabDriver
{
    public static void main(String[] args)
    {
        MoneyGrab moneyGrab = new MoneyGrab();

        boolean quit = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MoneyGrab! Now with VACUUMS!");
        System.out.println("Please enter a command:");
        System.out.println("Jump (j): Jump to a new spot and see how much money is there.");
        System.out.println("Gather/Grab (g): Get the money from the tile. Doesn't grab all of the money though!");
        System.out.println("Vacuum (v): Vacuum the money from this tile and any adjacent tiles. Gets less money from the further tiles.");
        System.out.println("Quit (q): Yes, quit. Some people just don't like free money I guess.");

        while (!quit)
        {
            String userInput = input.next();

            PlayerStatusModel currentStatus;
            switch (userInput.toLowerCase())
            {
                case "j":
                case "jump":
                    int spotMoney = moneyGrab.jump();

                    currentStatus = moneyGrab.statusUpdate();
                    System.out.println("You are in spot " + currentStatus.getCurrentSpot() + ".");
                    System.out.println("This spot has $" + spotMoney);
                    break;
                case "g":
                case "gather":
                case "grab":
                    int moneyGathered = moneyGrab.gather();

                    System.out.println("You gathered: $" + moneyGathered + ".");
                    currentStatus = moneyGrab.statusUpdate();
                    System.out.println("Total money: $" + currentStatus.getNumberOfDollarsGathered() + ".");
                    break;
                case "v":
                case "vacuum":
                    int moneyVacuumed = moneyGrab.vacuum();

                    System.out.println("You gathered: $" + moneyVacuumed + ".");
                    currentStatus = moneyGrab.statusUpdate();
                    System.out.println("Total money: $" + currentStatus.getNumberOfDollarsGathered() + ".");
                    break;
                case "quit":
                    quit = true;
                    System.out.println("Thank you for playing!");
                    break;
                default:
                    System.out.println("Invalid command. Please enter Jump(j), Gather(g), or Vacuum(v)");
                    break;
            }
        }

    }
}
