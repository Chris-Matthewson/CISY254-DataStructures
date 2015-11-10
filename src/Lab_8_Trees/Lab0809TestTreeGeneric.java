package Lab_8_Trees;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    11/4/2015 - Took Lab 5 Generic and made Tree Generic

    Run this program using the following:
        Lab09RunTestTreeWithCar.java
        Lab09RunTestTreeWithInteger.java
        Lab09RunTestTreeWithString.java

    NOTE:  for Lab 8, you are writing your own generic Tree<E>
    using your own generic BTNode<E>

    Lab 9 just this file, Lab0809TestTreeGeneric, will be modified to run Lab09 tests

*/

public class Lab0809TestTreeGeneric<E extends Comparable<E>>
{
    public void test(E[] testDataAdd, E testDataSingleItemRemove)
    {
        // creates a Tree of E
        Tree<E> myGenericTree = new Tree<E>();

        // show initial Tree
        displayTree("Display Tree/Size on startup",myGenericTree);

        // add some stuff to the Tree
        System.out.println("\n===========\n<<Start adds:");
        for (E item : testDataAdd)
        {
            System.out.print("Adding: " + item);
            myGenericTree.add(item);
            System.out.println(" \tadded...now size is " + myGenericTree.size());
        }
        System.out.println("Stopped adding>>\n===========");

        // show Tree after adds
        displayTree("\nDisplay Tree/Size after adds",myGenericTree);

        // attempt to remove 1 item AND display
        removeValue(testDataSingleItemRemove, myGenericTree);


    }



    /**
        the removeValue method attempts to remove aValue from a Tree
        @param aValue the E to remove
        @param aTree the Tree<E> to delete from
    */
    private void removeValue(E aValue, Tree<E> aTree)
    {
        if (aTree.remove(aValue))
        {
            System.out.println("\n"+aValue+" stated as removed from Tree...double check output");
        }
        else
        {
            System.out.println("\n"+aValue+" is stated as not in the Tree - remove failed...double check output");
        }

        displayTree("Display Tree after trying to remove: "+aValue,aTree);
    }

    /**
        the displayTree method displays the Tree and its size
        @param heading a String to display before the Tree
        @param aTree the Tree to display
    */
    private void displayTree(String heading, Tree<E> aTree)
    {
        System.out.println("\n" + heading);

        if (aTree.size() == 0)
        {
            System.out.println("\nTree is empty...Tree says: ");
            aTree.printTree();
        }
        else
        {
            aTree.printTree();
            System.out.println("Size: " + aTree.size());
        }
    }
}