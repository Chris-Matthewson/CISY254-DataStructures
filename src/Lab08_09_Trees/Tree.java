package Lab08_09_Trees;

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

    /**
     * Removes the specified element from the array.
     *
     * @param element The element to be removed.
     * @return Whether or not the element was removed.
     */
    public boolean remove(T element)
    {
        boolean elementFound = false;
        boolean keepSearching = true;

        BTNode<T> parent = null;
        BTNode<T> cursor = root;

        if (root == null)
        {
            return false;
        }

        while(keepSearching)
        {
            //compare the cursor data to the element to see where to go
            int comparison = element.compareTo(cursor.getData());

            if (comparison == 0) //match!
            {
                keepSearching = false;
                elementFound = true;

                if (parent == null && root.getLeft() == null)
                {
                    root = root.getRight();
                }
                else if (cursor.getLeft() == null && parent != null)
                {
                    parent.newLeft(cursor.getRight());
                }
                else
                {
                    cursor.setData(cursor.getLeft().getRightMostData());
                    cursor.newLeft(cursor.getLeft().removeRightMostNode());
                }
                numItems--;
            }
            else if (comparison < 0) //go left
            {
                parent = cursor;
                cursor = cursor.getLeft();

            }
            else //go right
            {
                parent = cursor;
                cursor = cursor.getRight();
            }

            //check to see if we have reached the end
            if (cursor == null)
            {
                keepSearching = false;
            }
        }

        return elementFound;
    }

    /**
     * Checks to see if the given element exists within this tree.
     *
     * @param element The element.
     * @return Whether or not the element is stored within this tree.
     */
    public boolean exists(T element)
    {
        boolean elementFound = false;
        boolean keepSearching = true;

        BTNode<T> parent = null;
        BTNode<T> cursor = root;

        if (root == null)
        {
            return false;
        }

        while(keepSearching)
        {
            //compare the cursor data to the element to see where to go
            int comparison = element.compareTo(cursor.getData());

            if (comparison == 0) //match!
            {
                keepSearching = false;
                elementFound = true;
            }
            else if (comparison < 0) //go left
            {
                parent = cursor;
                cursor = cursor.getLeft();

            }
            else //go right
            {
                parent = cursor;
                cursor = cursor.getRight();
            }

            //check to see if we have reached the end
            if (cursor == null)
            {
                keepSearching = false;
            }
        }

        return elementFound;
    }

    /**
     * Counts the number of occurences of the given element within this tree.
     *
     * @param element The element.
     * @return The number of times this tree contains the element.
     */
    public int countOccurences(T element)
    {
        int occurences = 0;
        boolean keepSearching = true;

        BTNode<T> parent = null;
        BTNode<T> cursor = root;

        if (root == null)
        {
            return 0;
        }

        while(keepSearching)
        {
            //compare the cursor data to the element to see where to go
            int comparison = element.compareTo(cursor.getData());

            if (comparison == 0) //match!
            {
                keepSearching = false;
                occurences++;
            }
            else if (comparison < 0) //go left
            {
                parent = cursor;
                cursor = cursor.getLeft();

            }
            else //go right
            {
                parent = cursor;
                cursor = cursor.getRight();
            }

            //check to see if we have reached the end
            if (cursor == null)
            {
                keepSearching = false;
            }
        }

        return occurences;
    }
    //endregion
}