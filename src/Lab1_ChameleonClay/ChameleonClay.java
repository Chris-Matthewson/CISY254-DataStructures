package Lab1_ChameleonClay;

import java.util.Random;

/*
 * @author Chris Matthewson - G00192903
 */
public class ChameleonClay 
{
    private Random randomNumberGenerator = new Random(); //to generante random numbers
    private int colorNumber = 0; //the currently selected color index
    private String[] colorNames = new String[]{""}; //the array of possible colors
    
    /*
    No args constructor.
    */
    public ChameleonClay()
    {
        //stroe the deffault color names
        colorNames = new String[]{"Red", "Orange","Yellow","Green",
                                  "Blue", "Indigo", "Violet"};
        //pick a new random color
        changeColor();
    }
    
    /*
    Initialize the chameleon clay class with the given array of colors.
    @param otherColors - The new colors for the chameleon clay.
    */
    public ChameleonClay(String[] otherColors)
    {
        //store the new colors
        colorNames = otherColors;
        
        //change to a new random color.
        changeColor();
    }
    
    /*
    Returns the currently selected color name.
    @retrun - The colorname of the currently selected color.
    */
    public String getColor()
    {

        return colorNames[colorNumber];
    }
    
    /*
    Returns all of the possible colors stored in the chameleon clay.
    @return - The array of possible strings for the colorNames
    */
    public String[] getPossibleColors()
    {
        return colorNames;
    }
    
    /*
    Change to a new random color.
    */
    public void changeColor()
    {
        //call Random to generate a new index that fits within the array
        //of colorNames
        colorNumber = randomNumberGenerator.nextInt(colorNames.length);
    }
}
