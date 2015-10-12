package Lab6_Stacks;

/**
 *
 * @author Chris Matthewson
 */
public class Node<T>
{
    //region FIELDS
    private T data; //the data stored within the node
    private Node<T> link; //the node associated with this node
    //endregion



    //region CONSTRUCTORS

    /*
        Default constructor. Initializes with a data item and a link.
        @param initialData The initial string this node is initialized with.
        @param initialLink The initial string this node is initialized with.
     */
    public Node(T initialData, Node<T> initialLink)
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
    public T getData()
    {
        return data;
    }

    /*
        Returns the link associate with this node.
        @returns The link associated with this node.
     */
    public Node<T> getLink()
    {
        return link;
    }
    //endregion



    //region MUTATORS

    /*
        Changes the data associated with this node.
        @params The new data to be associated with this node.
     */
    public void setData(T newData)
    {
        data = newData;
    }

    /*
        Changes the link associated with this node.
        @params The new data to be associated with this node.
     */
    public void setLink(Node<T> newLink)
    {
        link = newLink;
    }
    //endregion
}
