package Lab08_09_Trees;
/**
    Programmed by    Stephen Brower
    Inspired by      Michael Main
    Date Written:    3/20/2012
    Date Modified    10/23/2012 - removed package info
                                  renamed to lab 8
                     3/27/2013 - renamed to Lab 6/7
                     7/23/2013 - renamed to Lab 9
                     4/2/2014  - renamed to lab 8
                     4/6/2015  - renamed to lab 10
                               - changed print to inOrderPrint
                     11/4/2015 - merged with Lab 5's RunTestLinkedBagWithCar
                                 and now references Lab0809TestTreeGeneric

    NOTE:  for Lab 8, you are writing your own generic Tree<E>
    using your own generic BTNode<E>

    No changes to THIS file is needed for Lab 9 - just Lab0809TestTreeGeneric

*/


public class Lab0809RunTestTreeWithCar
{
    public static void main(String[] args)
    {
        runMe();
    }

    public static void runMe()
    {
        Lab0809TestTreeGeneric<Car> testTreeCar = new Lab0809TestTreeGeneric<Car>();

        Car[] lab08ArrayOfCarsToAdd = {
                    new Car(2015,"Honda Accord"),
                    new Car(1998,"Camry"),
                    new Car(1994,"Explorer"),
                    new Car(2015,"Zoom Zoom"),
                    new Car(2015,"Acura"),
                    new Car(2007,"Neon"),
                    new Car(1965,"Shelby Mustang GT 350"),
                    new Car(2015,"zOom zoOM")};

        // To Test remove() method - condition 1
        // - cursor is null - target not found
        // meaning:  attempt to remove value not in tree
        // Note: since the .equals() in Car ignores case for the
        //       make, then case doesn't matter so my wAckY cAr caSe
        Car testConditionOneSingleCarToDelete = new Car(1994,"Expedition");

        // array for Lab 9 Test Condition  2
        Car[] lab09ArrayOfCarsToAddForCondition2 = { new Car(2013,"Dodge"),
                    new Car(2013,"Explorer"), new Car(2013,"Malibu"),
                    new Car(2013,"Edsel") };

        // To Test remove() method - condition 2
        // node to be removed is at root and no left child
        Car testConditionTwoSingleCarToDelete = new Car(2013,"Dodge") ;

        // array for Lab 9 Test Condition 3
        Car[] lab09ArrayOfCarsToAddForCondition3 = { new Car(2013,"Explorer"),
                new Car(2013,"Dodge"), new Car(2013,"Malibu"),
                new Car(2013,"Aero"), new Car(2013,"Edsel"),
                new Car(2013,"Avalon") };

        // To Test remove() method - condition 3
        // node removed is not at root and has no left child
        Car testConditionThreeSingleCarToDelete = new Car(2013,"Aero");

        // array for Lab 9 Test Condition 4
        Car[] lab09ArrayOfCarsToAddForCondition4 = { new Car(2013,"Explorer"),
                new Car(2013,"Dodge"), new Car(2013,"Malibu"),
                new Car(2013,"Aero"), new Car(2013,"Edsel"),
                new Car(2013,"Avalon") };

        // To Test remove() method - condition 4
        // node to be removed has a left child
        // - will go left and get largest on left and bring up
        Car testConditionFourSingleCarToDelete = new Car(2013,"Explorer"); // coincidentally root


        testTreeCar.test ( lab08ArrayOfCarsToAdd,
                                   testConditionOneSingleCarToDelete );

        testTreeCar.test ( lab09ArrayOfCarsToAddForCondition2,
                                   testConditionTwoSingleCarToDelete );

        testTreeCar.test ( lab09ArrayOfCarsToAddForCondition3,
                                   testConditionThreeSingleCarToDelete );

        testTreeCar.test ( lab09ArrayOfCarsToAddForCondition4,
                                   testConditionFourSingleCarToDelete );

    }
}

/*

*** LAB 08 Output is:

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: [Car 2015 Honda Accord]         added...now size is 1
Adding: [Car 1998 Camry]        added...now size is 2
Adding: [Car 1994 Explorer]     added...now size is 3
Adding: [Car 2015 Zoom Zoom]    added...now size is 4
Adding: [Car 2015 Acura]        added...now size is 5
Adding: [Car 2007 Neon]         added...now size is 6
Adding: [Car 1965 Shelby Mustang GT 350]        added...now size is 7
Adding: [Car 2015 zOom zoOM]    added...now size is 8
Stopped adding>>
===========


Display Tree/Size after adds
[Car 1965 Shelby Mustang GT 350]
[Car 1994 Explorer]
[Car 1998 Camry]
[Car 2007 Neon]
[Car 2015 Acura]
[Car 2015 Honda Accord]
[Car 2015 Zoom Zoom]
[Car 2015 zOom zoOM]
Size: 8

*** LAB 09 Additional Output is:

[Car 1994 Expedition] is stated as not in the Tree - remove failed...double chec
k output

Display Tree after trying to remove: [Car 1994 Expedition]
[Car 1965 Shelby Mustang GT 350]
[Car 1994 Explorer]
[Car 1998 Camry]
[Car 2007 Neon]
[Car 2015 Acura]
[Car 2015 Honda Accord]
[Car 2015 Zoom Zoom]
[Car 2015 zOom zoOM]
Size: 8

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: [Car 2013 Dodge]        added...now size is 1
Adding: [Car 2013 Explorer]     added...now size is 2
Adding: [Car 2013 Malibu]       added...now size is 3
Adding: [Car 2013 Edsel]        added...now size is 4
Stopped adding>>
===========


Display Tree/Size after adds
[Car 2013 Dodge]
[Car 2013 Edsel]
[Car 2013 Explorer]
[Car 2013 Malibu]
Size: 4

[Car 2013 Dodge] stated as removed from Tree...double check output

Display Tree after trying to remove: [Car 2013 Dodge]
[Car 2013 Edsel]
[Car 2013 Explorer]
[Car 2013 Malibu]
Size: 3

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: [Car 2013 Explorer]     added...now size is 1
Adding: [Car 2013 Dodge]        added...now size is 2
Adding: [Car 2013 Malibu]       added...now size is 3
Adding: [Car 2013 Aero]         added...now size is 4
Adding: [Car 2013 Edsel]        added...now size is 5
Adding: [Car 2013 Avalon]       added...now size is 6
Stopped adding>>
===========


Display Tree/Size after adds
[Car 2013 Aero]
[Car 2013 Avalon]
[Car 2013 Dodge]
[Car 2013 Edsel]
[Car 2013 Explorer]
[Car 2013 Malibu]
Size: 6

[Car 2013 Aero] stated as removed from Tree...double check output

Display Tree after trying to remove: [Car 2013 Aero]
[Car 2013 Avalon]
[Car 2013 Dodge]
[Car 2013 Edsel]
[Car 2013 Explorer]
[Car 2013 Malibu]
Size: 5

Display Tree/Size on startup

Tree is empty...Tree says:
empty

===========
<<Start adds:
Adding: [Car 2013 Explorer]     added...now size is 1
Adding: [Car 2013 Dodge]        added...now size is 2
Adding: [Car 2013 Malibu]       added...now size is 3
Adding: [Car 2013 Aero]         added...now size is 4
Adding: [Car 2013 Edsel]        added...now size is 5
Adding: [Car 2013 Avalon]       added...now size is 6
Stopped adding>>
===========


Display Tree/Size after adds
[Car 2013 Aero]
[Car 2013 Avalon]
[Car 2013 Dodge]
[Car 2013 Edsel]
[Car 2013 Explorer]
[Car 2013 Malibu]
Size: 6

[Car 2013 Explorer] stated as removed from Tree...double check output

Display Tree after trying to remove: [Car 2013 Explorer]
[Car 2013 Aero]
[Car 2013 Avalon]
[Car 2013 Dodge]
[Car 2013 Edsel]
[Car 2013 Malibu]
Size: 5

*/