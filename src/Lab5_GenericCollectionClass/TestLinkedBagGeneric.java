package Lab5_GenericCollectionClass;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    10/3/2014 - made tester generic
                    10/6/2015 - added check to remove

    Run this program using the following:
        RunTestLinkedBagWithCar.java
        RunTestLinkedBagWithInteger.java
        RunTestLinkedBagWithString.java
*/

public class TestLinkedBagGeneric<E>
{
    public void test(E[] testDataAdd, E[] testDataSearch, E[] testDataRemove)
    {
        // creates a linked bag
        LinkedBag<E> myGenericBag = new LinkedBag<E>( );

        // show initial bag
        displayBag("Display Bag on startup",myGenericBag);

        // add some stuff to the bag
        for (E item : testDataAdd)
            myGenericBag.add(item);

        // show bag after adds
        displayBag("\nDisplay Bag after adds",myGenericBag);

        // look for some stuff
        for (E item : testDataSearch)
            displayValueExists(item,myGenericBag);

        // show bag after searched
        displayBag("Display Bag after searches",myGenericBag);

        // count some stuff
        for (E item : testDataSearch)
            displayCountValue(item,myGenericBag);

        // show bag after counting
        displayBag("Display Bag after counts",myGenericBag);

        // remove some stuff AND display
        for (E item : testDataRemove)
            removeValue(item,myGenericBag);
    }

    /**
        the displayValueExists method displays whether aValue exists in aBag
        @param aValue the E to look for
        @param aBag the LinkedBag<E> to look in
    */
    private void displayValueExists(E aValue, LinkedBag<E> aBag)
    {
        if (aBag.exists(aValue))
            System.out.println("\n" + aValue + " is in the bag");
        else
            System.out.println("\n" + aValue + " is not in the bag");
    }

    /**
        the displayCountValue method displays the number of aValue that occurs in aBag
        @param aValue the E to look for
        @param aBag the LinkedBag<E> to look in
    */
    private void displayCountValue(E aValue, LinkedBag<E> aBag)
    {
        System.out.println("\nnumber of "+aValue+" in bag? " +
            aBag.countOccurrences(aValue));
    }

    /**
        the removeValue method attempts to remove aValue from aBag
        @param aValue the E to remove
        @param aBag the LinkedBag<E> to look in
    */
    private void removeValue(E aValue, LinkedBag<E> aBag)
    {
        if (aBag.remove(aValue))
        {
            System.out.print("\n"+aValue+" stated as removed from bag");
            // double check it is really gone using bags toString() as opposed to exists
            if (aBag.toString().toLowerCase().indexOf(aValue.toString().toLowerCase()) == -1)
                System.out.print("\t-value indeed gone from bag -good");
            else
               System.out.print("\t-boolean returned was true but value is still in bag\t<==== issue");
        }
        else
        {
            System.out.print("\n"+aValue+" is stated as not in the bag - remove failed");
            // double check it is really gone using bags toString() as opposed to exists
            if (aBag.toString().toLowerCase().indexOf(aValue.toString().toLowerCase()) == -1)
                System.out.print("\t-value indeed gone from bag");
            else
               System.out.print("\t-boolean returned was false but value is in bag\t<==== issue");

        }

        displayBag("Display Bag after trying to remove: "+aValue,aBag);
    }


    /**
        the displayBag method displays the linked bag
        @param heading a String to display before the bag
        @param aBag the LinkedBag<E> to display
    */
    private void displayBag(String heading, LinkedBag<E> aBag)
    {
        System.out.println("\n" + heading);

        if (aBag.getSize() == 0)
            System.out.println("\nBag is empty");
        else
        {
            System.out.println(aBag);
            System.out.println("Size: " + aBag.getSize());
        }

    }
}