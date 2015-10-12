package Lab5_GenericCollectionClass;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java
                    10/6/2015 - updated output to reflect check on remove
                              - NetBeanoozled
    For Sample Output, see below
*/

public class RunTestLinkedBagWithString
{
    public static void main(String[] args)
    {
        runMe();
    }
    
    public static void runMe()
    {
        TestLinkedBagGeneric<String> testLinkedBagString = new TestLinkedBagGeneric<String>();

        String[] arrayOfStringsToAdd = {"Swiss", "Colby", "Montery Jack", "Cheddar", "Havarti",
                    "Montery Jack", "Alpine Lace", "Wisconsin Cheddar"};

        // Note: because we are using .equals() to be generic in our code, the down side
        //       is that for Strings case matters - so my searches/removes play nice!

        String[] arrayOfStringsToSearchFor = {"Edam","Colby","Alpine Lace","Swiss","Montery Jack"};

        String[] arrayOfStringsToDelete = {"Edam","Colby","Alpine Lace","Swiss"} ;

        testLinkedBagString.test ( arrayOfStringsToAdd,
                                   arrayOfStringsToSearchFor,
                                   arrayOfStringsToDelete );        
    }

}

/*
Expected Output:
run:

Display Bag on startup

Bag is empty


Display Bag after adds
Wisconsin Cheddar, Alpine Lace, Montery Jack, Havarti, Cheddar, Montery Jack, Colby, Swiss
Size: 8

Edam is not in the bag

Colby is in the bag

Alpine Lace is in the bag

Swiss is in the bag

Montery Jack is in the bag

Display Bag after searches
Wisconsin Cheddar, Alpine Lace, Montery Jack, Havarti, Cheddar, Montery Jack, Colby, Swiss
Size: 8

number of Edam in bag? 0

number of Colby in bag? 1

number of Alpine Lace in bag? 1

number of Swiss in bag? 1

number of Montery Jack in bag? 2

Display Bag after counts
Wisconsin Cheddar, Alpine Lace, Montery Jack, Havarti, Cheddar, Montery Jack, Colby, Swiss
Size: 8

Edam is stated as not in the bag - remove failed	-value indeed gone from bag
Display Bag after trying to remove: Edam
Wisconsin Cheddar, Alpine Lace, Montery Jack, Havarti, Cheddar, Montery Jack, Colby, Swiss
Size: 8

Colby stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: Colby
Alpine Lace, Montery Jack, Havarti, Cheddar, Montery Jack, Wisconsin Cheddar, Swiss
Size: 7

Alpine Lace stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: Alpine Lace
Montery Jack, Havarti, Cheddar, Montery Jack, Wisconsin Cheddar, Swiss
Size: 6

Swiss stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: Swiss
Havarti, Cheddar, Montery Jack, Wisconsin Cheddar, Montery Jack
Size: 5
BUILD SUCCESSFUL (total time: 0 seconds)
*/