package Lab10_Graphs;

/**
 Written by Michael Main
 Source:  http://www.cs.colorado.edu/~main/docs/
 Trimmed by Stephen Brower
 Date Modified:   11/26/2012 - removed package, clone, depth/bredth search
 - removed 'comments' for extra credit opportunity

 Javadoc added by:

 @author - Chris Matthewson
 */

public class Graph
{
    private boolean[ ][ ] edges;//the edges
    private Object[ ] labels;//labels assigned to vertecis, usually strings

    /**
     * Default constructor, initializes with a size.
     * @param n The size of the array.
     */
    public Graph(int n)
    {
        edges = new boolean[n][n];  // All values initially false
        labels = new Object[n];     // All values initially null
    }

    /**
     * Add an edge to the graph.
     *
     * @param source The starting point of the new edge.
     * @param target The end point of the new edge.
     */
    public void addEdge(int source, int target)
    {
        edges[source][target] = true;
    }

    /**
     * Returns the label of the specified vertex.
     *
     * @param vertex The index of the vertex.
     * @return The label of the vertex.
     */
    public Object getLabel(int vertex)
    {
        return labels[vertex];
    }

    /**
     * Determines whether an edge exists between two vertices.
     *
     * @param source The starting vertex.
     * @param target The ending vertex.
     * @return
     */
    public boolean isEdge(int source, int target)
    {
        return edges[source][target];
    }

    /**
     * Determine the neighbors of a vertex.
     *
     * @param vertex The index of the vertex.
     * @return The vertices attached to the specified vertex.
     */
    public int[ ] neighbors(int vertex)
    {
        int i;
        int count;//number of neighbors
        int[ ] answer; //return value

        // First count how many edges have the vertex as their source
        count = 0;
        for (i = 0; i < labels.length; i++)
        {
            if (edges[vertex][i]) //match found, count it
                count++;
        }

        // Allocate the array for the answer
        answer = new int[count];

        // Fill the array for the answer
        count = 0;
        for (i = 0; i < labels.length; i++)
        {
            if (edges[vertex][i])
                answer[count++] = i; //store the matches in the return value
        }

        return answer;
    }

    /**
     * Remove an edge from the graph.
     *
     * @param source The starting point of the edge.
     * @param target The ending point of the edge.
     */
    public void removeEdge(int source, int target)
    {
        edges[source][target] = false;
    }

    /**
     * Set or change the label of a vertex.
     *
     * @param vertex The index of the vertex.
     * @param newLabel The new label of the vertex.
     */
    public void setLabel(int vertex, Object newLabel)
    {
        labels[vertex] = newLabel;
    }

    /**
     * Returns the size of the graph.
     *
     * @return
     */
    public int size( )
    {
        return labels.length;
    }

}

