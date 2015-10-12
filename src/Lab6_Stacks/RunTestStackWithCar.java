package Lab6_Stacks;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java
    Date Modified   10/12/2014 - changed to use stacks

    For Sample Output, see below
*/

public class RunTestStackWithCar
{
    public static void main(String[] args)
    {
        runMe();
    }
    
    public static void runMe()
    {
        TestStackGeneric<Car> testStackCar = new TestStackGeneric<Car>();

        Car[] arrayOfCarsToAdd = {
                    new Car(2015,"Honda Accord"),
                    new Car(1998,"Camry"),
                    new Car(1994,"Explorer"),
                    new Car(2015,"Zoom Zoom"),
                    new Car(2015,"Acura"),
                    new Car(2007,"Neon"),
                    new Car(1965,"Shelby Mustang GT 350"),
                    new Car(2015,"zOom zoOM") };

        testStackCar.test ( arrayOfCarsToAdd );
    }

}

/*
Expected output:
run:

Display Stack Size on startup
Size: 0

===========
<<Start Pushes:
Pushing: [Car 2015 Honda Accord] 	pushed...now size is 1
Pushing: [Car 1998 Camry] 	pushed...now size is 2
Pushing: [Car 1994 Explorer] 	pushed...now size is 3
Pushing: [Car 2015 Zoom Zoom] 	pushed...now size is 4
Pushing: [Car 2015 Acura] 	pushed...now size is 5
Pushing: [Car 2007 Neon] 	pushed...now size is 6
Pushing: [Car 1965 Shelby Mustang GT 350] 	pushed...now size is 7
Pushing: [Car 2015 zOom zoOM] 	pushed...now size is 8
Stopped Pushing>>
===========


Display stack size after adds
Size: 8

About to pop......popped...Item Removed: [Car 2015 zOom zoOM] 	size: 7

Display stack size after 1 pop
Size: 7

===========
<<Start poping:
About to pop......popped...Item Removed: [Car 1965 Shelby Mustang GT 350] 	size: 6
About to pop......popped...Item Removed: [Car 2007 Neon] 	size: 5
About to pop......popped...Item Removed: [Car 2015 Acura] 	size: 4
About to pop......popped...Item Removed: [Car 2015 Zoom Zoom] 	size: 3
About to pop......popped...Item Removed: [Car 1994 Explorer] 	size: 2
About to pop......popped...Item Removed: [Car 1998 Camry] 	size: 1
About to pop......popped...Item Removed: [Car 2015 Honda Accord] 	size: 0
Stopped Poping>>
===========

Display stack size after pop all
Size: 0

attempt to remove 1 item from an empty stack: good

Display stack size after 1 pop
Size: 0
BUILD SUCCESSFUL (total time: 0 seconds)

*/

