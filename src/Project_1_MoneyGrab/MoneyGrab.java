package Project_1_MoneyGrab;

import java.util.Random;

/**
 * Created by chrismatthewson on 9/28/15.
 */
public class MoneyGrab
{
    //region FIELDS
    private int[] spots; //the spots containing money

    private PlayerStatusModel player; //stores information abut the player.
    private int playerCurrentSpot = 0; //the current spot of the player.

    private final double gatherPercentage = 0.90; //the percentage of money gather if using grab
    private final double mainVacuumPercentage = 0.70; //the percentage of money vacuumed on this spot
    private final double splashVacuumPercentage = 0.25; //the percentage of money vacuumed on neighboring spot
    private Random randomNumberGenerator = new Random();
    //endregion



    //region CONSTRUCTORS
    /*
        No arg constructor. Initializes an array with 100 spots, and between $1-500 each spot
     */
    public MoneyGrab()
    {
        //create 100 spots
        spots = new int[100];

        player = new PlayerStatusModel();
        playerCurrentSpot = randomNumberGenerator.nextInt(spots.length);

        for(int x = 0; x < 100 ; x++)
        {
            spots[x] = randomNumberGenerator.nextInt(500) + 1;
        }
    }
    //endregion



    //region ACTIONS

    /*
        Jump to a new spot. Collect no money.
     */
    public void jump()
    {
        //pick a new random spot, make sure they dont jump to the same spot
        int newSpot = randomNumberGenerator.nextInt(spots.length);

        while(newSpot == playerCurrentSpot)
        {
            newSpot = randomNumberGenerator.nextInt(spots.length);
        }
        playerCurrentSpot = newSpot;
        player.takeJump();
    }

    /*
        Grab the money from the spot. Removes the money from the spot and stores it in the player.
     */
    public void gather()
    {
        int dollarsGathered = (int) (spots[playerCurrentSpot] * gatherPercentage);
        player.gatherDollars(dollarsGathered, true);
        spots[playerCurrentSpot] -= dollarsGathered;
    }

    /*
        Vacuum the current spot and gather some of its money, then attempt to gather money from the adjacent spot.
     */
    public void vacuum()
    {
        int dollarsVacuumedCenter = 0;
        int dollarsVacuumedRight = 0;
        int dollarsVacuumedLeft = 0;

        //first vacuum the current spot
        dollarsVacuumedCenter = (int)(spots[playerCurrentSpot] * mainVacuumPercentage);
        player.gatherDollars(dollarsVacuumedCenter, false);
        spots[playerCurrentSpot] -= dollarsVacuumedCenter;

        //next gather the spot to the left (down) if it exists
        if (playerCurrentSpot > 1)
        {
            dollarsVacuumedLeft = (int)(spots[playerCurrentSpot - 1] * splashVacuumPercentage);
            player.gatherDollars(dollarsVacuumedLeft, false);
            spots[playerCurrentSpot - 1] -= dollarsVacuumedLeft;
        }

        //finally, gather from the spot to the right (up) if it exists
        if (playerCurrentSpot < spots.length - 1)
        {
            dollarsVacuumedRight = (int)(spots[playerCurrentSpot + 1] * splashVacuumPercentage);
            player.gatherDollars(dollarsVacuumedRight, false);
            spots[playerCurrentSpot + 1] -= dollarsVacuumedRight;
        }
    }
    //endregion


    //region accessor

    /*
        Returns the current status of the player represented as a PlayerStatusModel
        @returns The status of the player as a PlayerStatusModel
     */
    public PlayerStatusModel getStatusUpdate()
    {
        return new PlayerStatusModel(player);
    }

    /*
        Returns the information of the current spot formatted as a SpotInfoModel.
        @returns The information of the current spot formatted as a SpotInfoModel.
     */
    public SpotInfoModel getSpotInfo() {return new SpotInfoModel(playerCurrentSpot, spots[playerCurrentSpot]);}
}
