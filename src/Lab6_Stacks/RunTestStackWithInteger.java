package Lab6_Stacks;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java

    Date Modified   10/12/2014 - changed to use stacks

    For Sample Output, see below
*/

public class RunTestStackWithInteger
{
    public static void main(String[] args)
    {
        runMe();
    }
    
    public static void runMe()
    {
        TestStackGeneric<Integer> testStackInteger = new TestStackGeneric<Integer>();

        Integer[] arrayOfIntsToAdd = {81, 605, 71, 57, 302, 201, 923};

        testStackInteger.test ( arrayOfIntsToAdd);
    }

}

/*
Expected output:
run:

Display Stack Size on startup
Size: 0

===========
<<Start Pushes:
Pushing: 81 	pushed...now size is 1
Pushing: 605 	pushed...now size is 2
Pushing: 71 	pushed...now size is 3
Pushing: 57 	pushed...now size is 4
Pushing: 302 	pushed...now size is 5
Pushing: 201 	pushed...now size is 6
Pushing: 923 	pushed...now size is 7
Stopped Pushing>>
===========


Display stack size after adds
Size: 7

About to pop......popped...Item Removed: 923 	size: 6

Display stack size after 1 pop
Size: 6

===========
<<Start poping:
About to pop......popped...Item Removed: 201 	size: 5
About to pop......popped...Item Removed: 302 	size: 4
About to pop......popped...Item Removed: 57 	size: 3
About to pop......popped...Item Removed: 71 	size: 2
About to pop......popped...Item Removed: 605 	size: 1
About to pop......popped...Item Removed: 81 	size: 0
Stopped Poping>>
===========

Display stack size after pop all
Size: 0

attempt to remove 1 item from an empty stack: good

Display stack size after 1 pop
Size: 0
BUILD SUCCESSFUL (total time: 0 seconds)

*/