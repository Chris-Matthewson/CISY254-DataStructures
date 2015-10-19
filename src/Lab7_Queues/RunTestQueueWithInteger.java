package Lab7_Queues;

/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestQueueGeneric.java

    Date Modified   10/12/2014 - changed to use Queue

    For Sample Output, see below
*/

public class RunTestQueueWithInteger
{
    public static void main(String[] args)
    {
        runMe();
    }

    public static void runMe()
    {
        TestQueueGeneric<Integer> testQueueInteger = new TestQueueGeneric<Integer>();

        Integer[] arrayOfIntsToAdd = {81, 605, 71, 57, 302, 201, 923};

        testQueueInteger.test ( arrayOfIntsToAdd);
    }

}

/*
Expected output:

Display Queue Size on startup
Size: 0

===========
<<Start adds:
Adding: 81      added...now size is 1
Adding: 605     added...now size is 2
Adding: 71      added...now size is 3
Adding: 57      added...now size is 4
Adding: 302     added...now size is 5
Adding: 201     added...now size is 6
Adding: 923     added...now size is 7
Stopped adding>>
===========


Display Queue size after adds
Size: 7

About to remove 1 item...
Removed: 81

Display Queue size after 1 remove
Size: 6

===========
<<Start removing:
About to remove......removed...Item Removed: 605        size: 5
About to remove......removed...Item Removed: 71         size: 4
About to remove......removed...Item Removed: 57         size: 3
About to remove......removed...Item Removed: 302        size: 2
About to remove......removed...Item Removed: 201        size: 1
About to remove......removed...Item Removed: 923        size: 0
Stopped removing>>
===========

Display Queue size after remove all
Size: 0

attempt to remove 1 item from an empty Queue: good

Display Queue size after 1 remove
Size: 0
Press any key to continue . . .
*/