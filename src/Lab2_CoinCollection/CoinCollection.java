package lab2;

/*
 * @author Chris Matthewson - G00192903
 */
public class CoinCollection 
{
    public CoinCollection(){}
    
    /*
    Create a coin collection and populate them by using a nested array.
    Then use another array to print out the results.
    */
    public void Run()
    {
        //create the collection
        Coin[] myCoinCollection = new Coin[12];
        
        //enumerate all of the possible corrency values and mint locations
        double[] possibleCurrencies = new double[]{.01, .05, .1, .25, .5, 1.0};
        String[] possibleMintLocations = new String[]{"Denver", "Philadelphia"};
        
        //create the counter
        int coinCounter = 0;
        //foreach location
        for (int x = 0; x < 2; x++)
        {
            //foreach currency
            for (int y = 0; y < 6; y++)
            {
                //create a coin with the corresponding location and value
                myCoinCollection[coinCounter++] = new Coin(possibleCurrencies[y], 
                                                possibleMintLocations[x], 2015);
            }
        }
        
        //for each coin in coins print the string value
        for(Coin coin : myCoinCollection)
        {
            System.out.printf("%-5s", coin.getYearMinted());            
            System.out.printf("%-15s ", coin.getMintLocation());
            System.out.printf("%-15s ", coin.getFaceValueString());
            System.out.printf("%.2f\n", coin.getFaceValue());
        }
    }
}
