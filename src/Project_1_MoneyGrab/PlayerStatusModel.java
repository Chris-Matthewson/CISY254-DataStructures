package Project_1_MoneyGrab;

/**
 * Created by chrismatthewson on 9/28/15.
 */
public class PlayerStatusModel
{
    private int numberOfJumpsTaken; //total jumps taken this game
    private int numberOfTimesGathered; //number of times the player has chosen to gather
    private int numberOfDollarsGathered; //total dollars gathered this game
    private int numberOfTimesVacummed; //the number of times the player has used his awesome money vacuum
    private int currentSpot; //current spot

    /*
        No Arg constructor. Defaults all values to 0
     */
    public PlayerStatusModel()
    {
        numberOfJumpsTaken = 0;
        numberOfDollarsGathered = 0;
        currentSpot = 0;
    }


    /*
        Copy constructor.
        @params copyPlayer The player to be copied.
     */
    public PlayerStatusModel(PlayerStatusModel copyPlayer)
    {
        numberOfJumpsTaken = copyPlayer.getNumberOfJumpsTaken();
        numberOfDollarsGathered = copyPlayer.getNumberOfDollarsGathered();
        currentSpot = copyPlayer.getCurrentSpot();
    }


    //region ACCESSORS
    /*
        Gets the number of Jumps taken.
        @returns The total number fo jumps taken.
     */
    public int getNumberOfJumpsTaken()
    {
        return numberOfJumpsTaken;
    }

    /*
        gets the total number of dollars gathered.
        @returns The total number of dollars gathered.
     */
    public int getNumberOfDollarsGathered()
    {
        return numberOfDollarsGathered;
    }

    /*
        The current spot of the player.
        @returns The current spot of the player.
     */
    public int getCurrentSpot()
    {
        return currentSpot;
    }
    //endregion


    //region MUTATORS
    /*
        Add 1 to the number of jumps taken.
     */
    public void takeJump()
    {
        numberOfJumpsTaken++;
    }

    /*
        Gathers dollars. Adds the passed number of dollars to the current number of dollars
     */
    public void gatherDollars(int dollarsGathered)
    {
        numberOfDollarsGathered += dollarsGathered;
    }

    /*
        Sets a new current spot for the player
        @param currentSpot The new current spot for the player.
     */
    public void setCurrentSpot(int newCurrentSpot)
    {
        currentSpot = newCurrentSpot;
    }
    //endregion
}
