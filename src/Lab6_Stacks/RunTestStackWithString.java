package Lab6_Stacks;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java

    Date Modified   10/12/2014 - changed to use stacks

    For Sample Output, see below
*/

public class RunTestStackWithString
{
    public static void main(String[] args)
    {
        runMe();
    }
    
    public static void runMe()
    {
        TestStackGeneric<String> testStackString = new TestStackGeneric<String>();

        String[] arrayOfStringsToAdd = {"Swiss", "Colby", "Montery Jack", "Cheddar", "Havarti",
                    "Montery Jack", "Alpine Lace", "Wisconsin Cheddar"};

        testStackString.test ( arrayOfStringsToAdd);
    }

}

/*
Expected Output:
run:

Display Stack Size on startup
Size: 0

===========
<<Start Pushes:
Pushing: Swiss 	pushed...now size is 1
Pushing: Colby 	pushed...now size is 2
Pushing: Montery Jack 	pushed...now size is 3
Pushing: Cheddar 	pushed...now size is 4
Pushing: Havarti 	pushed...now size is 5
Pushing: Montery Jack 	pushed...now size is 6
Pushing: Alpine Lace 	pushed...now size is 7
Pushing: Wisconsin Cheddar 	pushed...now size is 8
Stopped Pushing>>
===========


Display stack size after adds
Size: 8

About to pop......popped...Item Removed: Wisconsin Cheddar 	size: 7

Display stack size after 1 pop
Size: 7

===========
<<Start poping:
About to pop......popped...Item Removed: Alpine Lace 	size: 6
About to pop......popped...Item Removed: Montery Jack 	size: 5
About to pop......popped...Item Removed: Havarti 	size: 4
About to pop......popped...Item Removed: Cheddar 	size: 3
About to pop......popped...Item Removed: Montery Jack 	size: 2
About to pop......popped...Item Removed: Colby 	size: 1
About to pop......popped...Item Removed: Swiss 	size: 0
Stopped Poping>>
===========

Display stack size after pop all
Size: 0

attempt to remove 1 item from an empty stack: good

Display stack size after 1 pop
Size: 0
BUILD SUCCESSFUL (total time: 0 seconds)

*/