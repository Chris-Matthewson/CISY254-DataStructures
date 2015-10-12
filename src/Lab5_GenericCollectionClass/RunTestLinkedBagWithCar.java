package Lab5_GenericCollectionClass;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - written to use generic tester to test generic linked list
                                needs TestLinkedBagGeneric.java
                    10/6/2015 - added a duplicate car and a fun car
                              - updated output to reflect check on remove
                              - NetBean-assimilated...apparently not futile
    For Sample Output, see below
*/

public class RunTestLinkedBagWithCar
{
    public static void main(String[] args)
    {
        runMe();
    }
    
    public static void runMe()
    {
        TestLinkedBagGeneric<Car> testLinkedBagCar = new TestLinkedBagGeneric<Car>();

        Car[] arrayOfCarsToAdd = {
                    new Car(2015,"Honda Accord"),
                    new Car(1998,"Camry"),
                    new Car(1994,"Explorer"),
                    new Car(2015,"Zoom Zoom"),
                    new Car(2015,"Acura"),
                    new Car(2007,"Neon"),
                    new Car(1965,"Shelby Mustang GT 350"),
                    new Car(2015,"zOom zoOM")};

        // Note: since the .equals() in Car ignores case for the
        //       make, then case doesn't matter so my wAckY cAr caSe
        Car[] arrayOfCarsToSearchFor = {
                    new Car(1994,"Expedition"),
                    new Car(1994,"expLorer"),
                    new Car(2015,"acura"),
                    new Car(2015,"honda ACcord"),
                    new Car(1965,"Shelby Mustang GT 350"),
                    new Car(2015,"Zoom Zoom")};
        Car[] arrayOfCarsToDelete = {
                    new Car(1994,"Expedition"),
                    new Car(1994,"expLorer"),
                    new Car(2015,"acura"),
                    new Car(2015,"honda ACcord") };

        testLinkedBagCar.test ( arrayOfCarsToAdd,
                                   arrayOfCarsToSearchFor,
                                   arrayOfCarsToDelete );
    }

}

/*
Expected output:
run:

Display Bag on startup

Bag is empty


Display Bag after adds
[Car 2015 zOom zoOM], [Car 1965 Shelby Mustang GT 350], [Car 2007 Neon], [Car 2015 Acura], [Car 2015 Zoom Zoom], [Car 1994 Explorer], [Car 1998 Camry], [Car 2015 Honda Accord]
Size: 8

[Car 1994 Expedition] is not in the bag

[Car 1994 expLorer] is in the bag

[Car 2015 acura] is in the bag

[Car 2015 honda ACcord] is in the bag

[Car 1965 Shelby Mustang GT 350] is in the bag

[Car 2015 Zoom Zoom] is in the bag

Display Bag after searches
[Car 2015 zOom zoOM], [Car 1965 Shelby Mustang GT 350], [Car 2007 Neon], [Car 2015 Acura], [Car 2015 Zoom Zoom], [Car 1994 Explorer], [Car 1998 Camry], [Car 2015 Honda Accord]
Size: 8

number of [Car 1994 Expedition] in bag? 0

number of [Car 1994 expLorer] in bag? 1

number of [Car 2015 acura] in bag? 1

number of [Car 2015 honda ACcord] in bag? 1

number of [Car 1965 Shelby Mustang GT 350] in bag? 1

number of [Car 2015 Zoom Zoom] in bag? 2

Display Bag after counts
[Car 2015 zOom zoOM], [Car 1965 Shelby Mustang GT 350], [Car 2007 Neon], [Car 2015 Acura], [Car 2015 Zoom Zoom], [Car 1994 Explorer], [Car 1998 Camry], [Car 2015 Honda Accord]
Size: 8

[Car 1994 Expedition] is stated as not in the bag - remove failed	-value indeed gone from bag
Display Bag after trying to remove: [Car 1994 Expedition]
[Car 2015 zOom zoOM], [Car 1965 Shelby Mustang GT 350], [Car 2007 Neon], [Car 2015 Acura], [Car 2015 Zoom Zoom], [Car 1994 Explorer], [Car 1998 Camry], [Car 2015 Honda Accord]
Size: 8

[Car 1994 expLorer] stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: [Car 1994 expLorer]
[Car 1965 Shelby Mustang GT 350], [Car 2007 Neon], [Car 2015 Acura], [Car 2015 Zoom Zoom], [Car 2015 zOom zoOM], [Car 1998 Camry], [Car 2015 Honda Accord]
Size: 7

[Car 2015 acura] stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: [Car 2015 acura]
[Car 2007 Neon], [Car 1965 Shelby Mustang GT 350], [Car 2015 Zoom Zoom], [Car 2015 zOom zoOM], [Car 1998 Camry], [Car 2015 Honda Accord]
Size: 6

[Car 2015 honda ACcord] stated as removed from bag	-value indeed gone from bag -good
Display Bag after trying to remove: [Car 2015 honda ACcord]
[Car 1965 Shelby Mustang GT 350], [Car 2015 Zoom Zoom], [Car 2015 zOom zoOM], [Car 1998 Camry], [Car 2007 Neon]
Size: 5
BUILD SUCCESSFUL (total time: 0 seconds)

*/

