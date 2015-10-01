package Lab3_CollectionClass;

/**
 * Created by chrismatthewson on 9/22/15.
 */
public class StringBag
{
    //region FIELDS
    private String[] data; //the data being stored
    private int numElements; //the number of elements in the actual array
    //endregion



    //region CONSTRUCTORS

    /*
        No Arg constructor. Initializes to 10 empty slots in the array.
     */
    public StringBag()
    {
        //default is 10 slots, no elements
        data = new String[10];
        numElements = 0;
    }

    /*
        Initializes the StringBag with the given capacity as empty slots.
     */
    public StringBag(int initCapacity)
    {
        data = new String[initCapacity];
        numElements = 0;
    }
    //endregion



    //region PRIVATE METHODS

    /*
        Enlarges the array to be twice its current size plus 1. (2 * length + 1)
     */
    private void enlargeArray()
    {
        //create a new enlarged array
        String[] newArray = new String[2 * data.length + 1];

        //copy the data
        for (int x = 0; x < numElements; x++)
        {
            newArray[x] = data[x];
        }

        //reference the new array
        data = newArray;
    }

    //endregion



    //region ACCESSORS
    /*
        Returns the capacity of the current StringBag instance.
        @returns The capacity of the current StringBag instance.
     */
    public int getCapacity()
    {
        return data.length;
    }

    /*
        Returns the number of elements currently stored in the array.
        @returns The number of elements currently stored in the array.
     */
    public int getSize()
    {
        return numElements;
    }

    /*
        Determines whether or not the StringBag holds the given String.
        @returns True if the StringBag contains the target string.
        @param target The string being searched for in StringBag
     */
    public boolean exists(String target)
    {
        boolean targetFound = false;

        //loop through the data and return true if a match to target is found
        for (int x = 0; x < numElements && !targetFound; x++)
        {
            if (data[x].equalsIgnoreCase(target))
            {
                targetFound = true;
            }
        }
        return targetFound;
    }

    /*
        Counts the number of times the target string appears in StringBag
        @params target The string to be searched for and counted in StringBag
        @returns The number of occurrences of the target string.
     */
    public int countOccurrences(String target)
    {
        int occurrences = 0;

        //loop through the data and tally the occurrences
        for (int x = 0; x < numElements ; x++)
        {
            if (data[x].equalsIgnoreCase(target))
            {
                occurrences++;
            }
        }

        return occurrences;
    }
    //endregion



    //region MUTATORS

    /*
        Adds a string to the StringBag.
        @param newElement The element to be added to the StringBag
     */
    public void add(String newElement)
    {
        //check the capacity of the array
        if (numElements == data.length)
        {
            enlargeArray();
        }

        boolean spotFound = false;

        //loop through the array and compare the newElement alphabetically to find a spot
        for (int x = 0; x < numElements && !spotFound; x++)
        {
            //if compareTo is negative then newElement is alphabetically first, and must be placed here
            if (data[x].compareToIgnoreCase(newElement) > 0)
            {
                spotFound = true;

                //move the other elements in data up 1 space
                for (int y = numElements; y >= x + 1; y--)
                {
                    data[y] = data[y-1];
                }

                data[x] = newElement;
                numElements++;
            }
        }

        //if no spot found, add it to the end
        if (!spotFound)
        {
            data[numElements++] = newElement;
        }
    }

    /*
        Removes a string from the StringBag.
     */
    public boolean remove(String target)
    {
        boolean targetFound = false;

        //loop through the data and compare to target
        for (int x  = 0; x < numElements && !targetFound ; x++ )
        {
            if (data[x].equalsIgnoreCase(target))
            {
                targetFound = true;

                //a match was found, decrease the number of elements
                numElements--;

                //shift the remaining elements down
                for (int y = x; y < numElements; y++)
                {
                    data[y] = data[y + 1];
                }

                //clear the last element
                data[numElements] = "";

            }
        }

        return targetFound; //if we get this far, a match was not found
    }
    //endregion



    //region OVERRIDES
    /*
        Convert contents of the StringBag into one string.
        @returns The StringBag as one string.
     */
    public String toString()
    {
        //first check to see if the StringBag is empty
        if (numElements == 0)
        {
            return "Empty.";
        }

        //create a container for the return string
        String returnString = "";

        //add each string in the StringBag to the returnString separated by comma (or period for last element)
        for (int x = 0; x < numElements ; x++)
        {
            returnString += data[x];

            if (x == numElements - 1)
            {
                returnString += ".";
            }
            else
            {
                returnString += ", ";
            }
        }

        //return the result
        return returnString;
    }
    //endregion
}
