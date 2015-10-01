package Lab3_CollectionClass;
/**
 * Lab 3 String Bag - additional extra credit tester for Lab 3
 * Programmed by    Stephen Brower
 * Inspired by  Michael Main
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class StringBagSimpleTestExtraCreditCrash
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

        // attempt to remove plum (2nd to last)
        if (fruitBag.remove("plum"))
            System.out.println("\nWas able to remove plum.");
        else
            System.out.println("\nSorry! unable to remove plum!");

        System.out.println("\nDisplay Bag after removing watermellon");
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

Was able to remove plum.

Display Bag after removing watermellon
apple, Banana, Grapefruit, macintosh, Mellon, Peach, Pear, watermellon, 
Capacity: 9 Size: 8

Was able to remove watermellon.

Display Bag after removing watermellon
apple, Banana, Grapefruit, macintosh, Mellon, Peach, Pear, 
Capacity: 9 Size: 7
BUILD SUCCESSFUL (total time: 0 seconds)

*/