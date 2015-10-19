package Lab7_Queues;

/**
 * @author Chris Matthewson
 * Created on 10/19/2015
 */
public class Queue<T>
{
    //region FEILDS
    private Node<T> front; //the node at the front of the Queue
    private Node<T> rear; //the node at the rear of the Queue
    private int numElements; //the number of Element stored int the Queue
    //endregion



    //region CONSTRUCTORS

    /**
        No Arg constructor.
     */
    public Queue()
    {
        front = null;
        rear = null;
        numElements = 0;
    }
    //endregion



    //region PUBLIC METHODS

    /**
        Add an element to the back of the queue.
        @params element The element to be added to the back of the Queue.
     */
    public void add(T element) {
        //create the new ode from the element
        Node<T> newNode = new Node(element, null);

        if (rear != null)
        {
            //set the element to the end of the Queue
            rear.setLink(newNode);
        }
        if (front == null)
        {
            //if the front is null, we need to set the front node
            front = newNode;
        }
        rear = newNode;

        //increase the number of elements
        numElements += 1;
    }

    /**
        Returns the data from the Node at the front of the Queue and removes it from the Queue.
        @returns The data from the Node at the front of the Queue.
     */
    public T remove()
    {
        //create an array to hold the data
        T returnData;

        if (front == null)
        {
            returnData = null;
        }
        else
        {
            //get the data from the element in the front of the Queue
            returnData = front.getData();

            //remove the front node and lower the number of elements
            front = front.getLink();
            numElements -= 1;
        }

        //return the data
        return returnData;
    }

    /**
        Returns the size of the Queue as an integer.
        @returns The size of the Queue as an integer.
     */
    public int size()
    {
        return numElements;
    }
    //endregion

}
