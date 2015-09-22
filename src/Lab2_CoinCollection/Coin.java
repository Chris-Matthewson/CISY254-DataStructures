package lab2;

/**
 *
 * @author Chris Matthewson - G00192903
 */
public class Coin 
{
    private double faceValue = 0;
    private int yearMinted = 0;
    private String mintLocation = "";
    
    public Coin()
    {
        faceValue = 0.01;
        yearMinted = 1176;
        mintLocation = "Philadelphia";
    }
    
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
        switch((int)(faceValue * 100))
        {
            case 1: return "Penny";
            case 5: return "Nickel";
            case 10: return "Dime";
            case 25: return "Quarter";
            case 50: return "Half Dollar";
            case 100: return "Dollar";
            default: return "Unknown";
        }
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
