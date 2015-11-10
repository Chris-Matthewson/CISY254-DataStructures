package Lab_8_Trees;

/**
 * Created by Chris Matthewson on 11/9/15.
 */
public class BTNode<T>
{
    //region FIELDS
    private T data; //the data to be stored in this node
    private BTNode<T> left; //the node stored to the left of this node
    private BTNode<T> right; // the node stored to the right of this node
    //endregion



    //region

    /**
     * Default consructor
     *
     * @param newData The new data for this node.
     * @param newLeft The node to the left of this node.
     * @param newRight The node to the right of this node.
     */
    public BTNode(T newData, BTNode<T> newLeft, BTNode<T> newRight)
    {
        //initialize the data
        data = newData;
        left = newLeft;
        right = newRight;
    }
    //endregion



    //region PRIVATE METHODS
    //endregion



    //region PUBLIC METHODS

    /**
     * Gets the data stored in this node.
     *
     * @return The data stored in this node
     */
    public T getData()
    {
        return data;
    }

    /**
     * Gets the node to the left of this node.
     *
     * @return The node to the left of this node
     */
    public BTNode<T> getLeft()
    {
        return left;
    }

    /**
     * Gets the node to the right of this node.
     *
     * @return The node to the right of this node.
     */
    public BTNode<T> getRight()
    {
        return right;
    }

    /**
     * Print
     */
    public void inOrderPrint()
    {
        if (left != null)
        {
            left.inOrderPrint();
        }

        System.out.println(data);

        if (right != null)
        {
            right.inOrderPrint();
        }
    }

    /**
     * Sets the data of this node to the new data specified.
     *
     * @param newData The data to store in this node.
     */
    public void setData(T newData)
    {
        data = newData;
    }

    /**
     * Replace the link to the left node with a new link.
     *
     * @param newLeft The link to the new node to the left of this node.
     */
    public void newLeft(BTNode<T> newLeft)
    {
        left = newLeft;
    }

    /**
     * Replace the link to the right node with a new link.
     *
     * @param newRight The new node to the right of this node.
     */
    public void newRight(BTNode<T> newRight)
    {
        right = newRight;
    }

    /**
     * Traverses the tree and returns the rightmost data.
     *
     * @return The rightmost data.
     */
    public T getRightMostData()
    {
        if (right == null)
        {
            return data;
        }
        else
        {
            return right.getRightMostData();
        }
    }

    /**
     * Removes and returns the rightmost node.
     *
     * @return The rightmost node.
     */
    public BTNode<T> removeRightMostNode()
    {
        if (right == null)
        {
            return left;
        }
        else
        { // A recursive call removes the leftmost node from my left subtree.
            right = right.removeRightMostNode();
            return this;
        }

    }
    //endregion
}
