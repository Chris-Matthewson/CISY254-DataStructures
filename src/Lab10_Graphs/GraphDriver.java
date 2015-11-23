package Lab10_Graphs;

import java.util.Scanner;

/**
 Programmed by:   Stephen Brower
 Date Written:    4/17/2012
 Date Modified:   11/26/2012 - changed reference to Graph to not be in package
 08/01/2013 - changed comments at bottom of method to "match" lab sheet
 04/21/2015 - added vertex labels

 Lab 10 stuff added by:

 @author - Chris Matthewson
 */

public class GraphDriver
{
    /**
     * Main entry point for the application.
     *
     * @param args Arguments.
     */
    public static void main(String[] args)
    {
        // create graph using Author's Graph
        Graph myGraph = new Graph(4);

        // add labels
        myGraph.setLabel(0,"Spot zero");
        myGraph.setLabel(1,"Spot one");
        myGraph.setLabel(2,"Spot two");
        myGraph.setLabel(3,"Spot three");

        // Add each edge (this undirected Graph has 5 edges,
        //                  so we add 10 edges)
        myGraph.addEdge(0,1);
        myGraph.addEdge(1,0);

        myGraph.addEdge(0,2);
        myGraph.addEdge(2,0);

        myGraph.addEdge(0,3);
        myGraph.addEdge(3,0);

        myGraph.addEdge(1,3);
        myGraph.addEdge(3,1);

        myGraph.addEdge(2,3);
        myGraph.addEdge(3,2);

        //region Code by Chris Matthewson
        int currentVertex = 2; //start on vertex 2
        boolean exitRequested = false; //exit condition
        Scanner scanner = new Scanner(System.in); //scan for user input

        //this code will start the user at the spot stored in currentVertex by faking user input of 2
        int input = currentVertex; //start the user on the current vertex
        int[] possibleNeighbors = new int[] {currentVertex}; //possible neighbors

        while(!exitRequested)
        {
            //check to see if the user has selected a valid input.
            if (input < myGraph.size() && ArrayContains(possibleNeighbors, input))
            {
                currentVertex = input;

                //display current vertex
                System.out.println("You are on vertex " + currentVertex + ".");

                //display the possible neighbors from the current vertex
                System.out.println("Possible neighboring vertexes: ");
                possibleNeighbors = myGraph.neighbors(currentVertex);

                for (int neighbor : possibleNeighbors)
                {
                    System.out.printf("%2d-%s\n", neighbor, myGraph.getLabel(neighbor)); //shamelessly stolen from above
                }

                //prompt user for input
                System.out.println("Please enter a new vertex to move to: ");
            }
            else
            {
                System.out.println("Invalid input. Please try again or enter '-1' to exit.");
            }

            //first, read the user's input
            input = scanner.nextInt(); //no error checking required, we are assuming correct values

            if (input == -1)
            {
                System.out.println("Exiting.");
                exitRequested = true;
            }
        }
        //endregion
    }

    /**
     * Checks to see if an int array contains a specific value.
     *
     * @param array The array to be searched.
     * @param value The array we are looking for.
     * @return Whether or not the array contains the value.
     */
    private static boolean ArrayContains(int[] array, int value)
    {
        boolean containsValue = false;
        for(int o: array)
        {
            if (o == value)
            {
                containsValue = true;
            }
        }

        return containsValue;
    }
}