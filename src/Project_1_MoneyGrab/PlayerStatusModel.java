package Project_1_MoneyGrab;

/**
 * Created by chrismatthewson on 9/28/15.
 */
public class PlayerStatusModel
{
    private int numberOfJumpsTaken; //total jumps taken this game
    private int numberOfTimesGathered; //number of times the player has chosen to gather
    private int numberOfDollarsGathered; //total dollars gathered this game
    private int numberOfTimesVacuumed; //the number of times the player has used his awesome money vacuum

    /*
        No Arg constructor. Defaults all values to 0
     */
    public PlayerStatusModel()
    {
        numberOfJumpsTaken = 0;
        numberOfDollarsGathered = 0;
    }


    /*
        Copy constructor.
        @params copyPlayer The player to be copied.
     */
    public PlayerStatusModel(PlayerStatusModel copyPlayer)
    {
        //copy the information
        this.numberOfJumpsTaken = copyPlayer.getNumberOfJumpsTaken();
        this.numberOfTimesGathered = copyPlayer.getNumberOfTimesGathered();
        this.numberOfDollarsGathered = copyPlayer.getNumberOfDollarsGathered();
        this.numberOfTimesVacuumed = copyPlayer.getNumberOfTimesVacuumed();
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
        Returns the number of times the player has gathered (not vacuumed)
        @returns The number of times the player has gathered (not vacuumed)
     */
    public int getNumberOfTimesGathered() {return numberOfTimesGathered;}

    /*
        Returns the number of times the player has vacuumed.
        @returns The number of times the playe rhas vacuumed.
     */
    public int getNumberOfTimesVacuumed() {return numberOfTimesVacuumed;}
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
        Gathers dollars. Adds the passed number of dollars to the current number of dollars and increments the
        appropriate "numberOfTimes" variable.
        @param dollarsGathered The number of dollars gathered/vacuumed.
        @param gathered True if gathered, false if vacuumed.
     */
    public void gatherDollars(int dollarsGathered, boolean gathered)
    {

        numberOfDollarsGathered += dollarsGathered;
        if (gathered)
        {
            numberOfTimesGathered++;
        }
        else
        {
            numberOfTimesVacuumed++;
        }
    }
    //endregion
}
