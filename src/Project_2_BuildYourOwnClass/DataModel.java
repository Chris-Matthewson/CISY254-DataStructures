package Project_2_BuildYourOwnClass;

/**
 * Created by Chris on 10/10/15.
 */
public class DataModel
{
    //region FIELDS
    public String data; //the data
    public String[] tags; //the metadata describing the data
    //endregion


    //region CONSTRUCTORS
    /*
        No-Arg constructor.
     */
    public DataModel()
    {
        data = "";
        tags = new String[]{""};
    }

    /*
        Constructor with data only. Initializes the tags to an empty string.
        @param initialData The data to be used to initialize the DataModel.
     */
    public DataModel(String initialData)
    {
        data = initialData;
        tags = new String[]{""};
    }

    /*
        Constructor with all data initialized to a given value.
        @param initialData The data to be used to initialize the DataModel.
        @param initialTags The tags to be used to initialize the DataModel.
     */
    public DataModel(String initialData, String[] initialTags)
    {
        data = initialData;
        tags = initialTags;
    }
    //endregion

    //region ACCESSORS
    /*
        Returns the array of tags associated with this Data Model.
        @returns The array of tags associated with this Data Model.
     */
    public String[] getTags()
    {
        return tags;
    }

    /*
        Returns the data contained in this Data Model.
        @returns the data countained in this Data Model.
     */
    public String getData()
    {
        return data;
    }

    /*
        Returns whether or not the Data Model has a specified tag associated with it.
        @returns Whether or not the Data Model has a specified tag associated with it.
        @param tag The tag to be checked for assocation with the data model.
     */
    public boolean hasTag(String tag)
    {
        boolean tagFound = false;//initialize the variable for the return value.

        for(String t : tags)
        {
            //loop through all of the tags in tags[] and check for a match
            if (t.equalsIgnoreCase(tag))
            {
                //record that we found a match and break to stop looking
                tagFound = true;
                break;
            }
        }

        //return value
        return tagFound;
    }
    //endregion


    //region MUTATORS

    /*
        Changes the data stored within this Data Model.
        @param newData The new data to be stored in the Data Model.
     */
    public void setData(String newData)
    {
        data = newData;
    }

    /*
        Changes the tags associated with this data model.
        @param newTags The new tags to be associated with this Data Model.
     */
    public void setTags(String[] newTags)
    {
        tags = newTags;
    }

    /*
        Add a tag to the tags associated with this data model.
        @param newTag The new tag to be associated with this data model.
     */
    public void addTag(String newTag)
    {
        //calculate a new size for the array and create it
        int newSize = tags.length + 1;
        String[] newTagArray = new String[newSize];

        //copy the old array
        for (int x = 0; x < tags.length; x++)
        {
            newTagArray[x] = tags[x];
        }

        //store the new tag
        newTagArray[tags.length] = newTag;

        //save the new array
        tags = newTagArray;
    }
    //endregion

    //region OVERRIDES
    /*
        Converts the DataModel to a String object.
        @returns The DataModel as a String object.
     */
    public String toString()
    {

        return null;
    }

    /*
        Determines whether two Data Models are equal.
        @returns Whether or not the two Data Models are equal.
        @param otherDataModel The data model to be compared.
     */
    public boolean equals(DataModel otherDataModel)
    {
        //create the variable for the return value
        boolean areNotEqual = false;

        if (!data.equals(otherDataModel.getData()))
        {
            areNotEqual = true;
        }

        if (tags.length == otherDataModel.getTags().length)
        {
            String[] otherTags = otherDataModel.getTags();
            for (int x = 0; x < tags.length; x++)
            {
                if (!tags[x].equals(otherTags[x]))
                {
                    areNotEqual = true;
                    break;
                }
            }
        }

        return !areNotEqual;
    }

    /*
        Determines whether two Data Models are equal. Ignores Case.
        @returns Whether or not the two Data Models are equal.
        @param otherDataModel The data model to be compared.
     */
    public boolean equalsIgnoreCase(DataModel otherDataModel)
    {
        //create the variable for the return value
        boolean areNotEqual = false;

        if (!data.equalsIgnoreCase(otherDataModel.getData()))
        {
            areNotEqual = true;
        }

        if (tags.length == otherDataModel.getTags().length) {
            String[] otherTags = otherDataModel.getTags();
            for (int x = 0; x < tags.length; x++)
            {
                if (!tags[x].equalsIgnoreCase(otherTags[x]))
                {
                    areNotEqual = true;
                    break;
                }
            }
        }

        return !areNotEqual;
    }
    //endregion
}
