package Lab3_CollectionClass;

/**
 * Lab 3 String Bag - Extra Credit tester for Lab 3
 * Programmed by    Stephen Brower
 * Inspired by  Michael Main
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class StringBagSimpleTestExtraCredit
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        StringBag fruitBag = new StringBag(9);

        System.out.println("\nDisplay Bag upon startup:");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        fruitBag.add("Pear");
        fruitBag.add("Banana");
        fruitBag.add("Plum");
        fruitBag.add("watermellon");
        fruitBag.add("Grapefruit");
        fruitBag.add("Peach");
        fruitBag.add("apple");
        fruitBag.add("Mellon");
        fruitBag.add("macintosh");

        System.out.println("\nDisplay Bag after 9 adds");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        fruitBag.add("Mango");

        System.out.println("\nDisplay bag after 1 additional add");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        // does pomegranate exist? (non existant)
        if (fruitBag.exists("pomegranate"))
            System.out.println("\nYes!  There is a pomegranate in the bag!");
        else
            System.out.println("\nNo!  No pomegranate in the bag");

        // does macintosh exist?
        if (fruitBag.exists("macintosh"))
            System.out.println("\nYes!  There is a macintosh in the bag!");
        else
            System.out.println("\nNo!  No macintosh in the bag");

        System.out.println("\nNumber of pomegranate? " + fruitBag.countOccurrences("pomegranate")); // (non existant)
        System.out.println("\nNumber of macintosh? " + fruitBag.countOccurrences("macintosh"));

        // attempt to remove pomegranate (non existant)
        if (fruitBag.remove("pomegranate"))
            System.out.println("\nWas able to remove pomegranate.");
        else
            System.out.println("\nSorry! unable to remove pomegranate!");

        System.out.println("\nDisplay Bag after removing pomegranate?");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        // attempt to remove macintosh (middle)
        if (fruitBag.remove("macintosh"))
            System.out.println("\nWas able to remove macintosh.");
        else
            System.out.println("\nSorry! unable to remove macintosh!");

        System.out.println("\nDisplay Bag after removing macintosh");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        // attempt to remove apple (first)
        if (fruitBag.remove("apple"))
            System.out.println("\nWas able to remove apple.");
        else
            System.out.println("\nSorry! unable to remove apple!");

        System.out.println("\nDisplay Bag after removing apple");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

        // attempt to remove watermellon (last)
        if (fruitBag.remove("watermellon"))
            System.out.println("\nWas able to remove watermellon.");
        else
            System.out.println("\nSorry! unable to remove watermellon!");

        System.out.println("\nDisplay Bag after removing watermellon");
        System.out.println(fruitBag);
        System.out.println("Capacity: " + fruitBag.getCapacity() + " Size: " + fruitBag.getSize());

    }
}

/*
Output should be:
run:

Display Bag upon startup:
empty
Capacity: 9 Size: 0

Display Bag after 9 adds
apple, Banana, Grapefruit, macintosh, Mellon, Peach, Pear, Plum, watermellon,
Capacity: 9 Size: 9

Display bag after 1 additional add
apple, Banana, Grapefruit, macintosh, Mango, Mellon, Peach, Pear, Plum, watermellon,
Capacity: 19 Size: 10

No!  No pomegranate in the bag

Yes!  There is a macintosh in the bag!

Number of pomegranate? 0

Number of macintosh? 1

Sorry! unable to remove pomegranate!

Display Bag after removing pomegranate?
apple, Banana, Grapefruit, macintosh, Mango, Mellon, Peach, Pear, Plum, watermellon,
Capacity: 19 Size: 10

Was able to remove macintosh.

Display Bag after removing macintosh
apple, Banana, Grapefruit, Mango, Mellon, Peach, Pear, Plum, watermellon,
Capacity: 19 Size: 9

Was able to remove apple.

Display Bag after removing apple
Banana, Grapefruit, Mango, Mellon, Peach, Pear, Plum, watermellon,
Capacity: 19 Size: 8

Was able to remove watermellon.

Display Bag after removing watermellon
Banana, Grapefruit, Mango, Mellon, Peach, Pear, Plum,
Capacity: 19 Size: 7
BUILD SUCCESSFUL (total time: 0 seconds)

*/