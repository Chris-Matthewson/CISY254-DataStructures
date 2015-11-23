package Lab08_09_Trees;
/**
    Programmed by    Stephen Brower
    Inspired by      Michael Main

    Date Written:    4/9/2013
    Date Modified    7/23/2013 - renamed to Lab 9
                     4/2/2014  - renamed to lab 8
                     4/6/2015  - renamed to lab 10
                               - changed print to inOrderPrint
                     11/4/2015 - merged with Lab 5's RunTestLinkedBagWithString
                                 and now references Lab0809TestTreeGeneric

    NOTE:  for Lab 8, you are writing your own generic Tree<E>
    using your own generic BTNode<E>

    No changes to THIS file is needed for Lab 9 - just Lab0809TestTreeGeneric

*/

public class Lab0809RunTestTreeWithString
{
    public static void main(String[] args)
    {
        runMe();
    }

    public static void runMe()
    {
        Lab0809TestTreeGeneric<String> testTreeString = new Lab0809TestTreeGeneric<String>();

        String[] lab08ArrayOfStringsToAdd = {"Swiss", "Colby", "Montery Jack", "Cheddar", "Havarti",
                    "Montery Jack", "Alpine Lace", "Wisconsin Cheddar"};

        // Note: because we are using .equals() to be generic in our code, the down side
        //       is that for Strings case matters - so my searches/removes play nice!

        String testConditionOneSingleStringToDelete = "Edam";

        testTreeString.test ( lab08ArrayOfStringsToAdd, testConditionOneSingleStringToDelete );

    }
}

/* LAB 08 Output is:

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: Swiss   added...now size is 1
Adding: Colby   added...now size is 2
Adding: Montery Jack    added...now size is 3
Adding: Cheddar         added...now size is 4
Adding: Havarti         added...now size is 5
Adding: Montery Jack    added...now size is 6
Adding: Alpine Lace     added...now size is 7
Adding: Wisconsin Cheddar       added...now size is 8
Stopped adding>>
===========


Display Tree/Size after adds
Alpine Lace
Cheddar
Colby
Havarti
Montery Jack
Montery Jack
Swiss
Wisconsin Cheddar
Size: 8

LAB 09 additional output is:


Edam is stated as not in the Tree - remove failed...double check output

Display Tree after trying to remove: Edam
Alpine Lace
Cheddar
Colby
Havarti
Montery Jack
Montery Jack
Swiss
Wisconsin Cheddar
Size: 8

Colby stated as removed from Tree...double check output

Display Tree after trying to remove: Colby
Alpine Lace
Cheddar
Havarti
Montery Jack
Montery Jack
Swiss
Wisconsin Cheddar
Size: 7

Alpine Lace stated as removed from Tree...double check output

Display Tree after trying to remove: Alpine Lace
Cheddar
Havarti
Montery Jack
Montery Jack
Swiss
Wisconsin Cheddar
Size: 6

Swiss stated as removed from Tree...double check output

Display Tree after trying to remove: Swiss
Cheddar
Havarti
Montery Jack
Montery Jack
Wisconsin Cheddar
Size: 5


*/