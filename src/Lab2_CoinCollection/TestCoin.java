package lab2;

/**
 *
 * @author Chris Matthewson - G00192903
 */
public class TestCoin 
{
    /*
    Sample run of the Coin class. Taken from the lab
    */
    public TestCoin()
    {
        Coin myDefaultCoin = new Coin();
        Coin myDenverDime = new Coin(.1,"Denver",2015);
        
        System.out.printf("%4d %-12s %-12s %4.2f\n", myDefaultCoin.getYearMinted(),
                         myDefaultCoin.getMintLocation(),
                         myDefaultCoin.getFaceValueString(),
                         myDefaultCoin.getFaceValue());
        
        System.out.printf("%4d %-12s %-12s %4.2f\n", myDenverDime.getYearMinted(),
                          myDenverDime.getMintLocation(),
                          myDenverDime.getFaceValueString(),
                          myDenverDime.getFaceValue());
    }
}
