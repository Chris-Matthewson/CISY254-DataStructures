package Project_1_MoneyGrab;

import java.util.Random;

/**
 * Created by chrismatthewson on 9/28/15.
 */
public class MoneyGrab
{
    //region FIELDS
    private int[] spots; //the spots containing money

    private PlayerStatusModel player;

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
        player.setCurrentSpot(randomNumberGenerator.nextInt(spots.length));

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
    public int jump()
    {
        //pick a new random spot, make sure they dont jump to the same spot
        int newSpot = randomNumberGenerator.nextInt(spots.length);

        while(newSpot == player.getCurrentSpot())
        {
            newSpot = randomNumberGenerator.nextInt(spots.length);
        }
        player.setCurrentSpot(newSpot);
        return spots[player.getCurrentSpot()];
    }

    /*
        Grab the money from the spot.
     */
    public int gather()
    {
        int dollarsGathered = (int) (spots[player.getCurrentSpot()] * gatherPercentage);
        player.gatherDollars(dollarsGathered);
        spots[player.getCurrentSpot()] -= dollarsGathered;
        return dollarsGathered;
    }

    public int vacuum()
    {
        int dollarsVacuumedCenter = 0;
        int dollarsVacuumedRight = 0;
        int dollarsVacuumedLeft = 0;

        //first vacuum the current spot
        dollarsVacuumedCenter = (int)(spots[player.getCurrentSpot()] * mainVacuumPercentage);
        player.gatherDollars(dollarsVacuumedCenter);
        spots[player.getCurrentSpot()] -= dollarsVacuumedCenter;

        //next gather the spot to the left (down) if it exists
        if (player.getCurrentSpot() > 1)
        {
            dollarsVacuumedLeft = (int)(spots[player.getCurrentSpot() - 1] * randomNumberGenerator.nextInt(spots.length););
            player.gatherDollars(dollarsVacuumedLeft);
            spots[player.getCurrentSpot()] -= dollarsVacuumedLeft;
        }

        //finally, gather from the spot to the right (up) if it exists
        if (player.getCurrentSpot() < spots.length - 1)
        {
            dollarsVacuumedRight = (int)(spots[player.getCurrentSpot() + 1] * splashVacuumPercentage);
            player.gatherDollars(dollarsVacuumedRight);
            spots[player.getCurrentSpot()] -= dollarsVacuumedRight;
        }

        //return total dollars vacuumed
        return dollarsVacuumedCenter + dollarsVacuumedLeft + dollarsVacuumedRight;
    }
    //endregion


    //region accessor

    /*
        Returns the current status of the player represented as a PlayerStatusModel
        @returns The status of the player as a PlayerStatusModel
     */
    public PlayerStatusModel statusUpdate()
    {
        return new PlayerStatusModel(player);
    }
}
