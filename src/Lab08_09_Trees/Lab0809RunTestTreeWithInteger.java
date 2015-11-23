package Lab08_09_Trees;
/**
    Programmed by    Stephen Brower
    Inspired by      Michael Main
    Date Written:    4/9/2013
    Date Modified    7/23/2013 - renamed to Lab 9
                     4/2/2014  - renamed to lab 8
                     11/12/2014 - renamed to lab 11
                     4/6/2015  - renamed to lab 10
                               - changed print to inOrderPrint
                     11/4/2015 - merged with Lab 5's RunTestLinkedBagWithInteger
                                 and now references Lab0809TestTreeGeneric

    NOTE:  for Lab 8, you are writing your own generic Tree<E>
    using your own generic BTNode<E>

    No changes to THIS file is needed for Lab 9 - just Lab0809TestTreeGeneric
*/

public class Lab0809RunTestTreeWithInteger
{
    public static void main(String[] args)
    {
        runMe();
    }

    public static void runMe()
    {
        Lab0809TestTreeGeneric<Integer> testTreeInteger = new Lab0809TestTreeGeneric<Integer>();

        // array for Lab 8 and Test Condition 1 for Lab 9
        Integer[] lab08ArrayOfIntsToAdd = {81, 605, 71, 57, 302, 605, 201, 923};

        // To Test remove() method - condition 1
        // - cursor is null - target not found
        // meaning:  attempt to remove value not in tree
        Integer testConditionOneSingleIntToDelete = 66 ;

        // array for Lab 9 Test Condition  2
        Integer[] lab09ArrayOfIntsToAddForCondition2 = { 15, 37, 23, 78 };

        // To Test remove() method - condition 2
        // node to be removed is at root and no left child
        Integer testConditionTwoSingleIntToDelete = 15 ;

        // array for Lab 9 Test Condition 3
        Integer[] lab09ArrayOfIntsToAddForCondition3 = { 38, 11, 62, 5, 21, 7 };

        // To Test remove() method - condition 3
        // node removed is not at root and has no left child
        Integer testConditionThreeSingleIntToDelete = 5 ;

        // array for Lab 9 Test Condition 4
        Integer[] lab09ArrayOfIntsToAddForCondition4 = { 38, 11, 62, 5, 21, 7 };

        // To Test remove() method - condition 4
        // node to be removed has a left child
        // - will go left and get largest on left and bring up
        Integer testConditionFourSingleIntToDelete = 38 ; // coincidentally root

        testTreeInteger.test ( lab08ArrayOfIntsToAdd,
                                   testConditionOneSingleIntToDelete );

        testTreeInteger.test ( lab09ArrayOfIntsToAddForCondition2,
                                   testConditionTwoSingleIntToDelete );

        testTreeInteger.test ( lab09ArrayOfIntsToAddForCondition3,
                                   testConditionThreeSingleIntToDelete );

        testTreeInteger.test ( lab09ArrayOfIntsToAddForCondition4,
                                   testConditionFourSingleIntToDelete );


    }
}

/*

*** LAB 08 Output is:

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: 81      added...now size is 1
Adding: 605     added...now size is 2
Adding: 71      added...now size is 3
Adding: 57      added...now size is 4
Adding: 302     added...now size is 5
Adding: 605     added...now size is 6
Adding: 201     added...now size is 7
Adding: 923     added...now size is 8
Stopped adding>>
===========


Display Tree/Size after adds
57
71
81
201
302
605
605
923
Size: 8

*** LAB 09 additional Output is:

66 is stated as not in the Tree - remove failed...double check output

Display Tree after trying to remove: 66
57
71
81
201
302
605
605
923
Size: 8

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: 15      added...now size is 1
Adding: 37      added...now size is 2
Adding: 23      added...now size is 3
Adding: 78      added...now size is 4
Stopped adding>>
===========


Display Tree/Size after adds
15
23
37
78
Size: 4

15 stated as removed from Tree...double check output

Display Tree after trying to remove: 15
23
37
78
Size: 3

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: 38      added...now size is 1
Adding: 11      added...now size is 2
Adding: 62      added...now size is 3
Adding: 5       added...now size is 4
Adding: 21      added...now size is 5
Adding: 7       added...now size is 6
Stopped adding>>
===========


Display Tree/Size after adds
5
7
11
21
38
62
Size: 6

5 stated as removed from Tree...double check output

Display Tree after trying to remove: 5
7
11
21
38
62
Size: 5

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: 38      added...now size is 1
Adding: 11      added...now size is 2
Adding: 62      added...now size is 3
Adding: 5       added...now size is 4
Adding: 21      added...now size is 5
Adding: 7       added...now size is 6
Stopped adding>>
===========


Display Tree/Size after adds
5
7
11
21
38
62
Size: 6

38 stated as removed from Tree...double check output

Display Tree after trying to remove: 38
5
7
11
21
62
Size: 5
*/