package Lab2_CoinCollection;

/**
 *
 * @author Chris Matthewson - G00192903
 */
public class Coin 
{
    private double faceValue = 0;
    private int yearMinted = 0;
    private String mintLocation = "";

    /*
        No Arg Constructor. Defaults:
        faceValue is 0.01
        yearMinted is 1776
        mintLocation is Philadelphia
     */
    public Coin()
    {
        faceValue = 0.01;
        yearMinted = 1776;
        mintLocation = "Philadelphia";
    }

    /*
        constructor where all values are specified
        @param newFaceValue The value of the coin as a double.
        @param newMintLocation The location the coin was minted in.
        @param yearMinted The year the coin was minted.
     */
    public Coin(double newFaceValue, String newMintLocation, int newYearMinted)
    {
        faceValue = newFaceValue;
        yearMinted = newYearMinted;
        mintLocation = newMintLocation;
    }
    
    /*
    Get the location the coin was minted.
    @returns - the location where the coin was minted as a string.
    */
    public String getMintLocation()
    {
        return mintLocation;
    }
    
    /*
    Gets the face value of the coin.
    @return - the face value of the coin as an integer.
    */
    public double getFaceValue()
    {
        return faceValue;
    }
    
    /*
    Gets the face value of the coin.
    @return - the face value of the coin by coin name.
    */
    public String getFaceValueString()
    {
        String name;
        switch((int)(faceValue * 100))
        {
            case 1: name =  "Penny";
            case 5: name = "Nickel";
            case 10: name = "Dime";
            case 25: name = "Quarter";
            case 50: name = "Half Dollar";
            case 100: name = "Dollar";
            default: name = "Unknown";
        }
        return name;
    }
    
    /*
    Gets the year the coin was minted.
    @return - the year the coin was minted.
    */
    public int getYearMinted()
    {
        return yearMinted;
    }
}
