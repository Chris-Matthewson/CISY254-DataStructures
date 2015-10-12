package Lab5_GenericCollectionClass;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java
                    10/6/2015 - updated output to reflect check on remove
                              - NetBeanafied
    For Sample Output, see below
*/

public class RunTestLinkedBagWithInteger
{
    public static void main(String[] args)
    {
        runMe();
    }
    
    public static void runMe()
    {
        TestLinkedBagGeneric<Integer> testLinkedBagInteger = new TestLinkedBagGeneric<Integer>();

        Integer[] arrayOfIntsToAdd = {81, 605, 71, 57, 302, 605, 201, 923};
        Integer[] arrayOfIntsToSearchFor = {66, 57, 201, 81, 605};
        Integer[] arrayOfIntsToDelete = {66, 57, 201, 81} ;

        testLinkedBagInteger.test ( arrayOfIntsToAdd,
                                   arrayOfIntsToSearchFor,
                                   arrayOfIntsToDelete );
    }

}

/*
run:

Display Bag on startup

Bag is empty


Display Bag after adds
923, 201, 605, 302, 57, 71, 605, 81
Size: 8

66 is not in the bag

57 is in the bag

201 is in the bag

81 is in the bag

605 is in the bag

Display Bag after searches
923, 201, 605, 302, 57, 71, 605, 81
Size: 8

number of 66 in bag? 0

number of 57 in bag? 1

number of 201 in bag? 1

number of 81 in bag? 1

number of 605 in bag? 2

Display Bag after counts
923, 201, 605, 302, 57, 71, 605, 81
Size: 8

66 is stated as not in the bag - remove failed	-value indeed gone from bag
Display Bag after trying to remove: 66
923, 201, 605, 302, 57, 71, 605, 81
Size: 8

57 stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: 57
201, 605, 302, 923, 71, 605, 81
Size: 7

201 stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: 201
605, 302, 923, 71, 605, 81
Size: 6

81 stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: 81
302, 923, 71, 605, 605
Size: 5
BUILD SUCCESSFUL (total time: 0 seconds)

*/