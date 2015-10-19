package Lab7_Queues;

/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java

    Date Modified   10/12/2014 - changed to use Queue

    For Sample Output, see below
*/

public class RunTestQueueWithCar
{
    public static void main(String[] args)
    {
        runMe();
    }

    public static void runMe()
    {
        TestQueueGeneric<Car> testQueueCar = new TestQueueGeneric<Car>();

        Car[] arrayOfCarsToAdd = {
                    new Car(2013,"Honda Accord"),
                    new Car(1998,"Camry"),
                    new Car(1994,"Explorer"),
                    new Car(2013,"Zoom Zoom"),
                    new Car(2013,"Acura"),
                    new Car(2007,"Neon") };

        testQueueCar.test ( arrayOfCarsToAdd );
    }

}

/*
Expected output:

Display Queue Size on startup
Size: 0

===========
<<Start adds:
Adding: [Car 2013 Honda Accord]         added...now size is 1
Adding: [Car 1998 Camry]        added...now size is 2
Adding: [Car 1994 Explorer]     added...now size is 3
Adding: [Car 2013 Zoom Zoom]    added...now size is 4
Adding: [Car 2013 Acura]        added...now size is 5
Adding: [Car 2007 Neon]         added...now size is 6
Stopped adding>>
===========


Display Queue size after adds
Size: 6

About to remove 1 item...
Removed: [Car 2013 Honda Accord]

Display Queue size after 1 remove
Size: 5

===========
<<Start removing:
About to remove......removed...Item Removed: [Car 1998 Camry]   size: 4
About to remove......removed...Item Removed: [Car 1994 Explorer]        size: 3
About to remove......removed...Item Removed: [Car 2013 Zoom Zoom]       size: 2
About to remove......removed...Item Removed: [Car 2013 Acura]   size: 1
About to remove......removed...Item Removed: [Car 2007 Neon]    size: 0
Stopped removing>>
===========

Display Queue size after remove all
Size: 0

attempt to remove 1 item from an empty Queue: good

Display Queue size after 1 remove
Size: 0
Press any key to continue . . .
*/

