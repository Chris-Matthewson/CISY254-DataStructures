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

        SpotInfoModel startingSpot = moneyGrab.getSpotInfo();

        System.out.println("");
        System.out.println("Starting spot: " + startingSpot.getIndex());
        System.out.println("Starting spot money: $" + startingSpot.getMoneyInSpot());
        System.out.println("");

        while (!quit)
        {
            System.out.println("");
            System.out.println("Please enter a command:");
            System.out.println("Jump (j): Jump to a new spot and see how much money is there.");
            System.out.println("Gather/Grab (g): Get the money from the tile. Doesn't grab all of the money though!");
            System.out.println("Vacuum (v): Vacuum the money from this tile and any adjacent tiles. Gets less money from the further tiles.");
            System.out.println("Quit (q): Yes, quit. Some people just don't like free money I guess.");
            System.out.println("");
            String userInput = input.next();

            PlayerStatusModel currentPlayerStatus;
            SpotInfoModel currentSpotInfo;

            switch (userInput.toLowerCase())
            {
                case "j":
                case "jump":

                    moneyGrab.jump(); //jump to a new spot
                    currentSpotInfo = moneyGrab.getSpotInfo(); //check the spots money and get its index

                    //print out relevant information
                    System.out.println("You are in spot " + currentSpotInfo.getIndex() + ".");
                    System.out.println("This spot has $" + currentSpotInfo.getMoneyInSpot() + ".");
                    break;

                case "g":
                case "gather":
                case "grab":

                    //store the amount of money before gathering
                    currentPlayerStatus = moneyGrab.getStatusUpdate();
                    int moneyBeforeGather = currentPlayerStatus.getNumberOfDollarsGathered();

                    //gather money from the tile and get a status update
                    moneyGrab.gather();
                    currentPlayerStatus = moneyGrab.getStatusUpdate();
                    currentSpotInfo = moneyGrab.getSpotInfo();

                    //determine how much money was gathered this round.
                    int moneyGatheredThisRound = currentPlayerStatus.getNumberOfDollarsGathered() - moneyBeforeGather;

                    //print out the relevant information
                    System.out.println("You gathered: $" + moneyGatheredThisRound + ".");
                    System.out.println("Total money: $" + currentPlayerStatus.getNumberOfDollarsGathered() + ".");
                    System.out.println("Money left on spot: $" + currentSpotInfo.getMoneyInSpot());
                    break;

                case "v":
                case "vacuum":

                    //store the amount of money before vacuuming
                    currentPlayerStatus= moneyGrab.getStatusUpdate();
                    int moneyBeforeVacuum = currentPlayerStatus.getNumberOfDollarsGathered();

                    //vacuum the tile
                    moneyGrab.vacuum();
                    currentPlayerStatus = moneyGrab.getStatusUpdate();
                    currentSpotInfo = moneyGrab.getSpotInfo();

                    //determine how much money was vacuumed
                    int moneyVacuumedThisRound = currentPlayerStatus.getNumberOfDollarsGathered() - moneyBeforeVacuum;

                    //print out the relevant information
                    System.out.println("You gathered: $" + moneyVacuumedThisRound + ".");
                    System.out.println("Total money: $" + currentPlayerStatus.getNumberOfDollarsGathered() + ".");
                    System.out.println("Money left on spot: $" + currentSpotInfo.getMoneyInSpot());
                    break;

                case "quit":
                case "q":

                    quit = true;
                    currentPlayerStatus = moneyGrab.getStatusUpdate();

                    System.out.println("Thank you for playing!");
                    System.out.println("Stats this game:");
                    System.out.println("Total money gathered: $" +currentPlayerStatus.getNumberOfDollarsGathered());
                    System.out.println("Total number of spots gathered: " + currentPlayerStatus.getNumberOfTimesGathered());
                    System.out.println("Total number of spots vacuumed: " + currentPlayerStatus.getNumberOfTimesVacuumed());
                    System.out.println("Total number of jumps: " + currentPlayerStatus.getNumberOfJumpsTaken());
                    break;

                default:
                    System.out.println("Invalid command. Please enter Jump(j), Gather(g), or Vacuum(v)");
                    break;
            }
        }

    }
}
