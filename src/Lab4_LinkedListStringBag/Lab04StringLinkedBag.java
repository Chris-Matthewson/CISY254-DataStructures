package Lab4_LinkedListStringBag;

/**
 * Tester for Lab 4 
 * Programmed by   Stephen Brower
 * Inspired by     Michael Main
 * Date Modified   10/2/2012 - fixed the labels to match the actions
 *                  2/20/2013 - Changed Class Name
 *                  6/20/2013 - changed calls to remove to be in if
 *                              added comments
 *                  2/19/2014 - added 2 more cheeses...mmm...cheese
 *                            - added comments to displayBag
 *                  9/21/2014 - Split into Part 1 and Part 2
 *                  9/29/2015 - merged back to 1 part and arrayafied data
 *                  10/1/2015 - for removes, now scans text of bag's toString() 
 *                              to see if data is there
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class Lab04StringLinkedBag 
{

    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // creates a linked bag
        StringLinkedBag cheeseBag = new StringLinkedBag();
        
        //test data
        String[] stringsToAddArray = {"Swiss", "Colby", "MonteRey jack", "Cheddar",
                                 "Havarti", "MoNterey JAck", "Alpine Lace",
                                 "Wisconsin Cheddar"};
        String[] stringsToFindArray = {"edam", "sWiss", "coLBy", 
                                    "monTereY jaCk"};
        boolean[] expectedFindResults = {false,true,true,true};
        String[] stringsToCountArray = stringsToFindArray.clone();
        int[] expectedCountResults = {0,1,1,2};
        String[] stringsToRemoveArray = {"Edam", "Colby", "Alpine Lace", "Swiss"};
        boolean[] expectedRemoveResults = {false,true,true,true};

        // show initial bag
        displayBag("Display Bag on startup",cheeseBag);

        // add some cheeses to bag
        for (String stringToAdd : stringsToAddArray)
            addValue(stringToAdd,cheeseBag);

        // show bag after adds
        displayBag("Display Bag after adds",cheeseBag);

        // look for some cheeses
        for (int i = 0; i < stringsToFindArray.length; i++)
            displayValueExists(stringsToFindArray[i],cheeseBag,expectedFindResults[i]);

        // show bag after searches
        displayBag("Display Bag after searches",cheeseBag);

        // count some cheeses
        for (int i = 0; i < stringsToCountArray.length; i++)
            displayCountValue(stringsToCountArray[i],cheeseBag,expectedCountResults[i]);

        // show bag after counted
        displayBag("Display Bag after counts",cheeseBag);

        // remove some cheeses AND display
        for (int i = 0; i < stringsToRemoveArray.length; i++)
            removeValue(stringsToRemoveArray[i],cheeseBag,expectedRemoveResults[i]);
    }

    /**
        the displayValueExists method displays whether aValue exists in aBag
        @param aValue the String to look for
        @param aBag the StringLinkedBag to look in
    */
    public static void displayValueExists(String aValue, StringLinkedBag aBag,
                                         boolean shouldSucceed)
    {
        if (aBag.exists(aValue))
        {
            System.out.print( aValue + " is in the bag");
            if (!shouldSucceed)
                System.out.print("\t\t<==== issue - shouldn't exist");
            else
                System.out.print("\t-good");
        }
        else
        {
            System.out.print( aValue + " is not in the bag");
            if (shouldSucceed)
                System.out.print("\t\t<==== issue - should exist");
            else
                System.out.print("\t-good");
        }
        System.out.println();
    }

    /**
        the displayBag method displays the linked bag
        @param heading a String to display before the bag
        @param aBag the StringLinkedBag to display
    */
    public static void displayBag(String heading, StringLinkedBag aBag)
    {
        System.out.println(heading);

        if (aBag.getSize() == 0)
        {
            System.out.println("Empty: Check [ " + aBag + "]");
        }
        else
        {
            System.out.println("Not Empty: Check [ " + aBag + "]");
            System.out.println("Size: " + aBag.getSize());
        }
        System.out.println();
    }
    /**
        the displayCountValue method displays the number of aValue that occurs in aBag
        @param aValue the String to look for
        @param aBag the StringLinkedBag to look in
    */
    public static void displayCountValue(String aValue, StringLinkedBag aBag, 
                                        int expectedCount)
    {
        int count = aBag.countOccurrences(aValue);
        
        System.out.printf("# of %20s in bag: %2d", aValue, count );
        
        if (count != expectedCount)
            System.out.print("\t\t<==== issue - expected "+expectedCount);
        else
            System.out.print("\t-good");
        System.out.println();
    }

    /**
        the removeValue method attempts to remove aValue from aBag
        @param aValue the String to remove
        @param aBag the StringLinkedBag to look in
    */
    public static void removeValue(String aValue, StringLinkedBag aBag,
                                boolean shouldSucceed)
    {
        boolean wasInBagBeforeRemoval;
        if (aBag.toString().toLowerCase().indexOf(aValue.toLowerCase()) == -1)
            wasInBagBeforeRemoval = false;
        else
            wasInBagBeforeRemoval = true;
        // was remove successful?
        if (aBag.remove(aValue))
        {
            // remove() returned true
            System.out.print(aValue+" removed");
            // should remove have suceeded? 
            if (shouldSucceed)
            {
                // double check it is really gone
                if (aBag.toString().toLowerCase().indexOf(aValue.toLowerCase()) == -1)
                    System.out.print("\t-correct return- value gone from bag -good");
                else
                   System.out.print("\t-correct boolean return- but value is still in bag\t<==== issue");
            }
            else // remove should not have succeeded
            {
                // remove returned true but false expected
                // was it there?
                if (wasInBagBeforeRemoval)
                {
                    // how can something that shouldn't have been in the bag
                    // had actually been in the bag?
                    System.out.print("\t-uhhhhh...possible logic issue in tester-contact instructor<<Code A");                    
                    if (aBag.toString().toLowerCase().indexOf(aValue.toLowerCase()) == -1)
                        System.out.print("01>>\t<==== issue");                    
                    else
                        System.out.print("02>>\t<==== issue");                    
                        
                }
                else
                {
                    // is it there
                    if (aBag.toString().toLowerCase().indexOf(aValue.toLowerCase()) == -1)
                        System.out.print("\t\tremove() returned true and shouldn't have / it's not in bag \t<==== issue");
                    else
                       System.out.print("\t\tremove() returned true and shouldn't have and it's still in bag \t<==== issue");
                }
            }                
        }
        else  // remove returned false
        {
            // remove() returned false
            System.out.printf(aValue+" remove failed");
            // should remove have returned true? 
            if (shouldSucceed)
            {
                // remove() returned false, should have returned true
                // was it actually removed?
                if (aBag.toString().toLowerCase().indexOf(aValue.toLowerCase()) == -1)
                {
                    // remove() returned false but did remove it
                    System.out.print("\t - remove worked but returned false\t<==== issue");
                }
                else
                {
                    // remove() returned false and that was expected
                    // make sure it isn't there
                    System.out.print("\t\t- remove returned false item still in bag\t<==== issue");
                }
                    
            }
            else // remove() returned false as exptected
            {
                if (aBag.toString().toLowerCase().indexOf(aValue.toLowerCase()) == -1)
                {
                    if (wasInBagBeforeRemoval)
                    {
                        // how can something that shouldn't have been in the bag
                        // had actually been in the bag?
                        System.out.print("\t-uhhhhh...possible logic issue in tester-contact instructor<<Code B02>>\t<==== issue");
                    }
                    else
                        System.out.print("\twasn't in bag before removal so it was expected to fail remove-good");
                }
                else
                {
                    System.out.print("\t-received expected false return value, but it is still in the bag\t<==== issue");
                }
            }
        }
        System.out.println();

        displayBag("Display Bag after trying to remove: ["+aValue+"]",aBag);
    }    

    /**
        the addValue method adds aValue to aBag
        @param aValue the String to remove
        @param aBag the StringLinkedBag to look in
    */
    public static void addValue(String aValue, StringLinkedBag aBag)
    {
        System.out.print("Currently: "+aBag.getSize()+" adding: "+aValue);
        aBag.add(aValue);
        System.out.println("...added...now: "+aBag.getSize());
        // uncomment next line if you need to debug
        //displayBag("Display Bag after adding: ["+aValue+"]",aBag);
    }    
}
/*
Expected Output:
run:
Display Bag on startup
Empty: Check [ empty]

Currently: 0 adding: Swiss...added...now: 1
Currently: 1 adding: Colby...added...now: 2
Currently: 2 adding: MonteRey jack...added...now: 3
Currently: 3 adding: Cheddar...added...now: 4
Currently: 4 adding: Havarti...added...now: 5
Currently: 5 adding: MoNterey JAck...added...now: 6
Currently: 6 adding: Alpine Lace...added...now: 7
Currently: 7 adding: Wisconsin Cheddar...added...now: 8
Display Bag after adds
Not Empty: Check [ Wisconsin Cheddar, Alpine Lace, MoNterey JAck, Havarti, Cheddar, MonteRey jack, Colby, Swiss]
Size: 8

edam is not in the bag	-good
sWiss is in the bag	-good
coLBy is in the bag	-good
monTereY jaCk is in the bag	-good
Display Bag after searches
Not Empty: Check [ Wisconsin Cheddar, Alpine Lace, MoNterey JAck, Havarti, Cheddar, MonteRey jack, Colby, Swiss]
Size: 8

# of                 edam in bag:  0	-good
# of                sWiss in bag:  1	-good
# of                coLBy in bag:  1	-good
# of        monTereY jaCk in bag:  2	-good
Display Bag after counts
Not Empty: Check [ Wisconsin Cheddar, Alpine Lace, MoNterey JAck, Havarti, Cheddar, MonteRey jack, Colby, Swiss]
Size: 8

Edam remove failed	wasn't in bag before removal so it was expected to fail remove-good
Display Bag after trying to remove: [Edam]
Not Empty: Check [ Wisconsin Cheddar, Alpine Lace, MoNterey JAck, Havarti, Cheddar, MonteRey jack, Colby, Swiss]
Size: 8

Colby removed	-correct return- value gone from bag -good
Display Bag after trying to remove: [Colby]
Not Empty: Check [ Alpine Lace, MoNterey JAck, Havarti, Cheddar, MonteRey jack, Wisconsin Cheddar, Swiss]
Size: 7

Alpine Lace removed	-correct return- value gone from bag -good
Display Bag after trying to remove: [Alpine Lace]
Not Empty: Check [ MoNterey JAck, Havarti, Cheddar, MonteRey jack, Wisconsin Cheddar, Swiss]
Size: 6

Swiss removed	-correct return- value gone from bag -good
Display Bag after trying to remove: [Swiss]
Not Empty: Check [ Havarti, Cheddar, MonteRey jack, Wisconsin Cheddar, MoNterey JAck]
Size: 5

BUILD SUCCESSFUL (total time: 0 seconds)

*/