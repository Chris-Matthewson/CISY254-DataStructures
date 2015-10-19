package Lab7_Queues;

/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - made tester generic
    Date Modified   10/12/2014 - changed to use Queues

    Run this program using the following:
        RunTestQueueWithCar.java
        RunTestQueueWithInteger.java
        RunTestQueueWithString.java
*/

public class TestQueueGeneric<E>
{
    public void test(E[] testDataAdd)
    {
        // creates a Queue
        Queue<E> myGenericQueue = new Queue<E>( );

        // holds an item removed
        E itemRemoved;

        // show initial Queue size
        displayQueueSize("Display Queue Size on startup",myGenericQueue);

        // add some stuff to the Queue
        System.out.println("\n===========\n<<Start adds:");
        for (E item : testDataAdd)
        {
            System.out.print("Adding: " + item);
            myGenericQueue.add(item);
            System.out.println(" \tadded...now size is " + myGenericQueue.size());
        }
        System.out.println("Stopped adding>>\n===========");

        // show Queue size after adds
        displayQueueSize("\nDisplay Queue size after adds",myGenericQueue);


        System.out.print("\nAbout to remove 1 item...");

        // remove 1 item
        itemRemoved = myGenericQueue.remove();

        // display 1 item
        System.out.println("\nRemoved: " + itemRemoved);


        // show Queue size after 1 remove
        displayQueueSize("Display Queue size after 1 remove",myGenericQueue);


        // remove all
        System.out.println("\n===========\n<<Start removing:");
        while (myGenericQueue.size() > 0)
        {
            System.out.print("About to remove...");
            // remove 1 item
            itemRemoved = myGenericQueue.remove();

            // display 1 item
            System.out.println("...removed...Item Removed: " + itemRemoved
                                + " \tsize: " + myGenericQueue.size());

        }
        System.out.println("Stopped removing>>\n===========");


        // show Queue size after removing  all
        displayQueueSize("Display Queue size after remove all",myGenericQueue);


        System.out.print("\nattempt to remove 1 item from an empty Queue: ");
        itemRemoved = myGenericQueue.remove();

        // display 1 item
        if (itemRemoved == null)
            System.out.println("good");
        else
            System.out.println("OOPS! Removed: " + itemRemoved);


        // show Queue size after 1 pop
        displayQueueSize("Display Queue size after 1 remove",myGenericQueue);


    }




    /**
        the displayBag method displays the Queue size
        @params heading a String to display before the Queue size
        @params aBag the Queue to display the size from
    */
    private void displayQueueSize(String heading, Queue<E> aQueue)
    {
        System.out.println("\n" + heading);
        System.out.println("Size: " + aQueue.size());


    }
}