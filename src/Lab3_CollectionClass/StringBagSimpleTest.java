package Lab3_CollectionClass;


/**
 * Lab 3 String Bag - tester for Lab 3
 * Programmed by    Stephen Brower
 * Inspired by  Michael Main
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class StringBagSimpleTest
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        StringBag fruitBag = new StringBag(3);

        System.out.println("\nDisplay Bag upon startup:");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        fruitBag.add("Pear");
        fruitBag.add("Plum");
        fruitBag.add("Peach");

        System.out.println("\nDisplay Bag after 3 adds");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        fruitBag.add("Mango");

        System.out.println("\nDisplay bag after 1 additional add");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        // does banana exist?
        if (fruitBag.exists("banana"))
            System.out.println("\nYes!  There is a banana in the bag!");
        else
            System.out.println("\nNo!  No banana in the bag");

        // does plum exist?
        if (fruitBag.exists("plum"))
            System.out.println("\nYes!  There is a plum in the bag!");
        else
            System.out.println("\nNo!  No plum in the bag");

        System.out.println("\nNumber of banana? " + fruitBag.countOccurrences("banana"));
        System.out.println("\nNumber of plum? " + fruitBag.countOccurrences("plum"));

        // attempt to remove banana
        if (fruitBag.remove("banana"))
            System.out.println("\nWas able to remove banana.");
        else
            System.out.println("\nSorry! unable to remove banana!");

        System.out.println("\nDisplay Bag after removing banana?");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        // attempt to remove plum
        if (fruitBag.remove("plum"))
            System.out.println("\nWas able to remove plum.");
        else
            System.out.println("\nSorry! unable to remove plum!");

        System.out.println("\nDisplay Bag after removing plum");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());
    }
}
/*
Sample Run Should Be:
run:

Display Bag upon startup:
empty
Capacity: 3 Size: 0

Display Bag after 3 adds
Pear, Plum, Peach,
Capacity: 3 Size: 3

Display bag after 1 additional add
Pear, Plum, Peach, Mango,
Capacity: 7 Size: 4

No!  No banana in the bag

Yes!  There is a plum in the bag!

Number of banana? 0

Number of plum? 1

Sorry! unable to remove banana!

Display Bag after removing banana?
Pear, Plum, Peach, Mango,
Capacity: 7 Size: 4

Was able to remove plum.

Display Bag after removing plum
Pear, Mango, Peach,
Capacity: 7 Size: 3
BUILD SUCCESSFUL (total time: 0 seconds)

*/
