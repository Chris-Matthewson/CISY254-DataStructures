package Project_1_MoneyGrab;

/**
 * Created by chrismatthewson on 9/30/15.
 */
public class SpotInfoModel
{
    //region FIELDS
    private int index; //the index of the spot
    private int moneyInSpot; //the number of money left in the spot
    //endregion

    //region CONSTRUCTORS - no "no arg" constructor needed, should not be used without passing args!!

    /*
        Default Constructor. Initializes with the given index of the spot and the amount of.
        @param index The index of the spot.
        @param moneyInSpot The amount of money left in the spot.
     */
    public SpotInfoModel(int index, int moneyInSpot)
    {
        this.index = index;
        this.moneyInSpot = moneyInSpot;
    }
    //endregion
}
