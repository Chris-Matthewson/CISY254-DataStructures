package Lab1_ChameleonClay;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @author Chris Matthewson - G00192903
 */
public class ChameleonClayDriver 
{
    /*
    Default no arg constructor. Does nothing but create the object.
    */
    public ChameleonClayDriver(){}
    
    /*
    Run the driver.
    */
    public void Run()
    {
        System.out.println("Moulding clay... ");
        
        //create the first chameleon clay with default values
        ChameleonClay defaultClay = new ChameleonClay();
        
        //create another chameleon clay with the colors "Red", "Yellow", "Blue", "Green", "Orange", "Brown"
        //IMPORTANT - these are the colors of M&M plain
        ChameleonClay specifiedClay = new ChameleonClay(new String[]{"Red", 
                                                        "Yellow", "Blue", 
                                                        "Green", "Orange", 
                                                        "Brown"});
        //run the assignment
        ChangeClayColors(defaultClay, specifiedClay, "Default", "Specified", 2);  
        
        /* EXTRA CREDIT */
        //create the 2 clays
        ChameleonClay clay300 = new ChameleonClay(new String[] {"Red", "Yellow", 
                                                  "Blue", "Green", "Orange", 
                                                  "Brown", "Indigo",
                                                  "No Color"});
        
        ChameleonClay clay3Mil = new ChameleonClay(new String[] {"Red", "Yellow", 
                                                  "Blue", "Green", "Orange", 
                                                  "Brown", "Indigo",
                                                  "No Color", "Invisible"});
        //change the color and count
        ChangeClayWithReportColorFrequency(clay300, 300);
        ChangeClayWithReportColorFrequency(clay3Mil, 300000000);
    }
    
    /*
    Change the color of the clays and check before and after
    
    @param clay1 - The first clay.
    @param clay2 - The second clay.
    @param clay1Name - The name of the clay1 to be displayed.
    @param clay2Name - The name of the clay2 to be displayed.
    @param numIterations - the number of times the clay color should be changed.
    */
    private void ChangeClayColors(ChameleonClay clay1, ChameleonClay clay2,
                                  String clay1Name, String clay2Name, 
                                  int numIterations)
    {
        //report the possible colors for each clay
        System.out.println("Possible colors of the clay:");
        System.out.print(clay1Name + " Clay - ");        
        for (int x = 0 ; x < clay1.getPossibleColors().length ; x++)
        {
            System.out.print("\"" + clay1.getPossibleColors()[x] + "\"");
            if (x < clay1.getPossibleColors().length - 1)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.println();
            }
        }
        System.out.print(clay2Name + " Clay - ");
        for (int x = 0 ; x < clay2.getPossibleColors().length ; x++)
        {
            System.out.print("\"" + clay2.getPossibleColors()[x] + "\"");
            if (x < clay2.getPossibleColors().length - 1)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.println();
            }
        }
        System.out.println();
        
        //report the starting color
        System.out.println("Initial caly colors:");
        System.out.println(clay2Name + " Clay - " + clay1.getColor());
        System.out.println(clay2Name + " Clay - " + clay2.getColor());
        System.out.println();

        //loop through the given number of times
        for(int x = 0; x < numIterations; x++)
        {
            //before change
            System.out.println("Before:");
            System.out.println(clay2Name + " Clay - " + clay1.getColor());
            System.out.println(clay2Name + " Clay - " + clay2.getColor());
            System.out.println();

            //change the color
            System.out.println("Changing color...");
            clay1.changeColor();
            clay2.changeColor();
            System.out.println();

            //after the change
            System.out.println("After:");
            System.out.println(clay2Name + " Clay - " + clay1.getColor());
            System.out.println(clay2Name + " Clay - " + clay2.getColor());
            if (clay1.getColor().equals(clay2.getColor()))
            {
                System.out.println("Whoa... same color!");
            }
            System.out.println();
            
            //check to see if we are iterating again
            if (x < numIterations)
            {
                //Change one more time
                System.out.println("Changing again...");
                System.out.println();
            }
        }
    }
    
    /*
    Change the clay any number of times, and report the total frequency of each color.
    @param theClay - The clay to be changed.
    @param numIterations - The number of times to change the color of the clay.
    */
    private void ChangeClayWithReportColorFrequency(ChameleonClay theClay,
                                                    int numIterations)
    {
        //first create an array to hold the frequency of the colors 
        int[] frequencies = new int[theClay.getPossibleColors().length + 1];
        
        //create an array list for finding the index of the color, add all colors
        ArrayList<String> possibleColors = new ArrayList<String>();
        possibleColors.addAll(Arrays.asList(theClay.getPossibleColors()));
        
        //for loop to change the clay "numIterations" number of tmes
        for (int x = 0; x < numIterations; x++)
        {
            //change the clay then increment the frequency of the corresponding index
            theClay.changeColor();
            frequencies[possibleColors.indexOf(theClay.getColor())]++;
        }
        
        //prepare to display the results by creating formatters
        DecimalFormat frequencyFormatter = new DecimalFormat("###,###");
        //format for percent and specify 1 decimal place
        NumberFormat percentageFormatter = NumberFormat.getPercentInstance();
        percentageFormatter.setMinimumFractionDigits(1);
        percentageFormatter.setMinimumIntegerDigits(2);
        
        //display the results
        System.out.println("Results of changing clay " + numIterations + " times:");
        for (int x = 0 ; x < possibleColors.size(); x++)
        {
            double percentage = frequencies[x] / (double)numIterations;
            
            System.out.printf("%-12s  ", x + " " + (possibleColors.get(x)));
            System.out.printf("%12s  ", frequencyFormatter.format(frequencies[x]));
            System.out.printf("%5s\n", percentageFormatter.format(percentage));
        }
        System.out.println();
    }
}
