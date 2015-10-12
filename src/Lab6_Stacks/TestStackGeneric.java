package Lab6_Stacks;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - made tester generic
    Date Modified   10/12/2014 - changed to use stacks

    Run this program using the following:
        RunTestStackWithCar.java
        RunTestStackWithInteger.java
        RunTestStackWithString.java
*/

public class TestStackGeneric<E>
{
    public void test(E[] testDataAdd)
    {
        // creates a Stack
        Stack<E> myGenericStack = new Stack<E>( );

        // holds an item removed
        E itemRemoved;

        // show initial stack size
        displayStackSize("Display Stack Size on startup",myGenericStack);

        // add some stuff to the stack
        System.out.println("\n===========\n<<Start Pushes:");
        for (E item : testDataAdd)
        {
            System.out.print("Pushing: " + item);
            myGenericStack.push(item);
            System.out.println(" \tpushed...now size is " + myGenericStack.size());
        }
        System.out.println("Stopped Pushing>>\n===========");

        // show stack size after adds
        displayStackSize("\nDisplay stack size after adds",myGenericStack);

        System.out.print("\nAbout to pop...");

        // remove 1 item
        itemRemoved = myGenericStack.pop();

        // display 1 item
        System.out.println("...popped...Item Removed: " + itemRemoved
                    + " \tsize: " + myGenericStack.size());

        // show stack size after 1 pop
        displayStackSize("Display stack size after 1 pop",myGenericStack);

        // pop all
        System.out.println("\n===========\n<<Start poping:");
        while (myGenericStack.size() > 0)
        {
            System.out.print("About to pop...");

            // remove 1 item
            itemRemoved = myGenericStack.pop();

            // display 1 item
            System.out.println("...popped...Item Removed: " + itemRemoved
                                + " \tsize: " + myGenericStack.size());
        }
        System.out.println("Stopped Poping>>\n===========");

        // show stack size after poping all
        displayStackSize("Display stack size after pop all",myGenericStack);

        System.out.print("\nattempt to remove 1 item from an empty stack: ");
        itemRemoved = myGenericStack.pop();

        // display 1 item
        if (itemRemoved == null)
            System.out.println("good");
        else
            System.out.println("OOPS! Removed: " + itemRemoved);

        // show stack size after 1 pop
        displayStackSize("Display stack size after 1 pop",myGenericStack);
    }

    /**
        the displayBag method displays the linked bag
        @param heading a String to display before the bag
        @param aBag the LinkedBag<E> to display
    */
    private void displayStackSize(String heading, Stack<E> aStack)
    {
        System.out.println("\n" + heading);
        System.out.println("Size: " + aStack.size());


    }
}