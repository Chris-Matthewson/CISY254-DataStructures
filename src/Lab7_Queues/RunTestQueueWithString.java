package Lab7_Queues;

/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java

    Date Modified   10/12/2014 - changed to use Queues

    For Sample Output, see below
*/

public class RunTestQueueWithString
{
    public static void main(String[] args)
    {
        runMe();
    }

    public static void runMe()
    {
        TestQueueGeneric<String> testQueueString = new TestQueueGeneric<String>();

        String[] arrayOfStringsToAdd = {"Swiss", "Colby", "Montery Jack", "Cheddar", "Havarti",
                    "Montery Jack", "Alpine Lace", "Wisconsin Cheddar"};

        testQueueString.test ( arrayOfStringsToAdd);
    }

}

/*
Expected Output:

Display Queue Size on startup
Size: 0

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


Display Queue size after adds
Size: 8

About to remove 1 item...
Removed: Swiss

Display Queue size after 1 remove
Size: 7

===========
<<Start removing:
About to remove......removed...Item Removed: Colby      size: 6
About to remove......removed...Item Removed: Montery Jack       size: 5
About to remove......removed...Item Removed: Cheddar    size: 4
About to remove......removed...Item Removed: Havarti    size: 3
About to remove......removed...Item Removed: Montery Jack       size: 2
About to remove......removed...Item Removed: Alpine Lace        size: 1
About to remove......removed...Item Removed: Wisconsin Cheddar  size: 0
Stopped removing>>
===========

Display Queue size after remove all
Size: 0

attempt to remove 1 item from an empty Queue: good

Display Queue size after 1 remove
Size: 0
Press any key to continue . . .
*/