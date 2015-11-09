package Lab_8_Trees;

/**
 *
 * @author Chris Matthewson 11/09/2015
 */
public class Tree<T extends Comparable<T>>
{
    //region FIELDS
    private  BTNode<T> root; //The root of the tree.
    private int numItems; //the number of items stored in the tree.
    //endregion



    //region CONSTRUCTORS

    /**
     * No-Args constructor for Tree()
     */
    public Tree()
    {
        root = null;
        numItems = 0;
    }
    //endregion



    //region PUBLIC METHODS

    /**
     * Adds the element to the tree.
     *
     * @param element The element to be added to the tree.
     */
    public void add(T element)
    {
        if (root == null)
        {
            root = new BTNode<T>(element, null, null);
            numItems++;
        }
        else
        {
            //1 go left
            //-1 or 0 go right
            boolean positionFound = false;
            BTNode<T> cursor = root;

            while (!positionFound)
            {
                //compare this element with the current element on the cursor
                int comparison = element.compareTo(cursor.getData());

                if (comparison < 0) //go left
                {
                    if (cursor.getLeft() == null)
                    {
                        //if we have found an empty spot for the element, store it and exit the loop
                        positionFound = true;
                        cursor.newLeft(new BTNode<T>(element, null, null));
                        numItems++;
                    }
                    else
                    {
                        //we have not found and empty spot, keep looking
                        cursor = cursor.getLeft();
                    }
                }
                else //go right
                {
                    if (cursor.getRight() == null)
                    {
                        //if we have found an empty spot for the element, store it and exit the loop
                        positionFound = true;
                        cursor.newRight(new BTNode<T>(element, null, null));
                        numItems++;
                    }
                    else
                    {
                        //we have not found an empty spot, keep looking
                        cursor = cursor.getRight();
                    }
                }
            }

        }
    }

    /**
     * Gets the number of elements stored in the tree.
     *
     * @return The number of elements stored in the tree.
     */
    public int size()
    {
        return numItems;
    }

    /**
     * Print the tree in order.
     */
    public void printTree()
    {
        if (root == null)
        {
            System.out.println("empty");
        }
        else
        {
            root.inOrderPrint();
        }
    }
    //endregion
}

/*

If the Integer is equal to the argument then 0 is returned.

If the Integer is less than the argument then -1 is returned.

If the Integer is greater than the argument then 1 is returned.
 */