package Lab4_LinkedListStringBag;

/**
 * Created by Chris on 10/5/15.
 */
public class StringNode
{
    //region FIELDS
    private String data; //holds the string
    private StringNode link; //the node this one is linked to
    //endregion

    //region CONSTRUCTORS

    /*
        Default constructor. Initializes with a data item and a link.
        @param initialData The initial string this node is initialized with.
        @param initialLink The initial string this node is initialized with.
     */
    public StringNode(String initialData, StringNode initialLink)
    {
        data = initialData;
        link = initialLink;
    }
    //endregion

    //region ACCESSORS

    /*
        Returns the data associated with this node.
        @returns The data associated with this node.
     */
    public String getData()
    {
        return data;
    }

    /*
        Returns the link associate with this node.
        @returns The link associated with this node.
     */
    public StringNode getLink()
    {
        return link;
    }
    //endregion

    //region MUTATORS

    /*
        Changes the data associated with this node.
        @params The new data to be associated with this node.
     */
    public void setData(String newData)
    {
        data = newData;
    }

    /*
        Changes the link associated with this node.
        @params The new data to be associated with this node.
     */
    public void setLink(StringNode newLink)
    {
        link = newLink;
    }
    //endregion
}
