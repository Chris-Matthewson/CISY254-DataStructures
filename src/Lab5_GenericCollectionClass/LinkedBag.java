package Lab5_GenericCollectionClass;

/**
 * Created by Chris on 10/12/15.
 */
public class LinkedBag<T>
{
    //region FIELDS
    private Node<T> head; //the first node in the list
    private int numElements; //the number of elements in the list
    //endregion



    //region CONSTRUCTORS

    /*
        No-args constructor. Initializes to 0 elements with no head node.
     */
    public LinkedBag()
    {
        head = null;
        numElements = 0;
    }
    //endregion



    //region ACCESSORS

    /*
        Returns the size of the list.
        @returns the size of the list.
    */
    public int getSize()
    {
        return numElements;
    }

    /*
        Checks whether or not the given element exists within the list.
        @params The element to be searched for in the list.
        @returns Whether or not the element exists.
     */
    public boolean exists(T element)
    {
        boolean elementFound = false;

        for (Node<T> cursor = head; cursor != null && !elementFound; cursor = cursor.getLink())
        {
            if (cursor.getData().equals(element))
            {
                elementFound = true;
            }
        }

        return elementFound;
    }

    /*
        Counts the number of times an element is contained within the list.
        @params The element to be searched for.
        @returns The number of times the element has been found within the list.
     */
    public int countOccurrences(T element)
    {
        int occurrences = 0;

        for (Node<T> cursor = head; cursor != null; cursor = cursor.getLink())
        {
            if (cursor.getData().equals(element))
            {
                occurrences++;
            }
        }

        return occurrences;
    }
    //endregion



    //region MUTATORS

    /*
        Add an element to the list.
        @param element The element to be added to the list.
     */
    public void add(T element)
    {
        head = new Node<>(element, head);
        numElements++;
    }

    /*
        Removes the element from the list.
        @param element The element to be removed.
     */
    public boolean remove(T element)
    {
        boolean elementFound = false;

        Node<T> targetNode = head;
        for (Node<T> cursor = head; cursor != null && !elementFound; cursor = cursor.getLink())
        {
            if (cursor.getData().equals(element)) {
                elementFound = true;
                targetNode = cursor;
            }
        }

        if (elementFound)
        {
            targetNode.setData(head.getData());
            head = head.getLink();
            numElements--;
        }

        return elementFound;
    }
    //endregion



    //region OVERRIDES

    /*
        Returns the list as a single string.
        @returns The list as a single String.
     */
    public String toString()
    {
        //first check for a null head, or 0 elements
        if (head == null || numElements == 0)
        {
            return "empty";
        }

        String returnString = "";

        for (Node<T> cursor = head; cursor != null; cursor = cursor.getLink())
        {
            returnString += cursor.getData();

            if (cursor.getLink() == null)
            {
                returnString += ".";
            }
            else
            {
                returnString += ", ";
            }
        }

        return returnString;
    }
    //endregion
}
