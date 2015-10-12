package Lab6_Stacks;

/**
 * @author Chris Matthewson
 */
public class Stack<T>
{
    //region FIELDS
    private Node<T> top; //the node on the top of the class.
    private int numElements; //the number of elements contained in the Stack
    //endregion



    //region CONSTRUCTORS
    /*
        No-Arg constructor. Initializes the stack to have a null top node and 0 nodes in the array.
     */
    public Stack()
    {
        top = null;
        numElements = 0;
    }
    //endregion



    //region PUBLIC METHODS
    /*
        Receives and element and places it at the top of the stack.
        @param element The element to be placed at the top of the stack.
     */
    public void push(T element)
    {
        numElements++; //increase the number of elements by 1
        top = new Node<T>(element, top); //make the top node a new node containing the element
    }

    /*
        Returns the top element of the stack in type <T>. This element is removed from the stack.
        @returns The top element of the stack in type <T>. This element is removed from the stack.
     */
    public T pop()
    {
        T returnValue; //initialize a variable for the return value;

        //check to make sure it is possible to remove a node
        if (top == null)
        {
            returnValue = null;
        }
        else
        {
            //store the return data
            returnValue = top.getData();

            //remove the top node
            top = top.getLink();

            //decrement the numElements counter
            numElements--;
        }

        return returnValue;//return the data from the original node
    }

    /*
        returns the data from the node at the top of the stack. Does not remove the element from the stack.
        @returns The data from the node at the top of the stack. Does not remove the element from the stack.
     */
    public T peek()
    {
        return top.getData(); //return the data from the first element.
    }


    /*
        Return the number of nodes stored in the stack.
        @returns The number of nodes stored in the stack.
     */
    public int size()
    {
        return numElements;
    }
    //endregion
}
