package Lab3_CollectionClass;

/**
 * Created by chrismatthewson on 9/22/15.
 */
public class StringBag
{
    //region Description
    private String[] data; //the data being stored
    private int numElements; //the number of elements in the actual array
    //endregion



    /* CONSTRUCTORS */
    public StringBag()
    {
        //default is 10 slots, no elements
        data = new String[10];
        numElements = 0;
    }

    public StringBag(int initCapacity)
    {
        data = new String[initCapacity];
        numElements = 0;
    }



    // <editor-fold desc="PRIVATE METHODS">

    /*
        Enlarges the array to be twice its current size plus 1. (2 * length + 1)
     */
    private void enlargeArray() throws Exception
    {
        //create a temporary array to hold the data while enlarging the original array
        String[] tempArray = new String[numElements];

        //copy the data into the temp array
        for (int x = 0; x < numElements; x++)
        {
            tempArray[x] = data[x];
        }

        //enlarge the original array
        data = new String[2 * data.length + 1];

        //copy the data back
        for (int x = 0; x < numElements; x++)
        {
            data[x] = tempArray[x];
        }
    }

    //</editor-fold>



    // <editor-fold desc="ACCESSORS">
    /*
        Returns the capacity of the current StringBag instance.
        @returns The capacity of the current StringBag instance.
     */
    public int getCapacity()
    {
        return data.length;
    }

    /*

     */
    public int getSize()
    {
        //not implemented
    }

    public boolean exists(String taget)
    {
        //not implemented
    }

    public int countOccurence(String target)
    {
        //not implemented
    }

    // </editor-fold>



    /* MUTATORS */
    public void add(String newElement)
    {
        //not implemented
    }

    public void add(String[] newElements)
    {
        //not implemented
    }

    public void remove(String target)
    {
        //not implemented
    }



    /*  OVERRIDES   */
    public String toString()
    {
        //not implemented
    }
}
