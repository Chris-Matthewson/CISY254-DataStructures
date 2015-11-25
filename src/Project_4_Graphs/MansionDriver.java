package Project_4_Graphs;

import Lab10_Graphs.Graph;

/**
 * Created by Chris on 11/24/15.
 */
public class MansionDriver
{
    /**
     * Main entry point to the program.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //initialize the graph
        Graph mansionGraph = new Graph(18);

        //add all of the edges
        mansionGraph.addEdge(0,1);
        mansionGraph.addEdge(1,0);

        mansionGraph.addEdge(1,2);
        mansionGraph.addEdge(2,1);

        mansionGraph.addEdge(2,3);
        mansionGraph.addEdge(3,2);

        mansionGraph.addEdge(1,5);
        mansionGraph.addEdge(5,1);

        mansionGraph.addEdge(3,7);
        mansionGraph.addEdge(7,3);

        mansionGraph.addEdge(4,8);
        mansionGraph.addEdge(8,4);

        mansionGraph.addEdge(6,7);
        mansionGraph.addEdge(7,6);

        mansionGraph.addEdge(7,8);
        mansionGraph.addEdge(8,7);

        mansionGraph.addEdge(5,9);
        mansionGraph.addEdge(9,5);

        mansionGraph.addEdge(6,10);
        mansionGraph.addEdge(10,6);

        mansionGraph.addEdge(9,10);
        mansionGraph.addEdge(10,9);

        mansionGraph.addEdge(10,11);
        mansionGraph.addEdge(11,10);

        mansionGraph.addEdge(11,12);
        mansionGraph.addEdge(12,11);

        mansionGraph.addEdge(10,14);
        mansionGraph.addEdge(14,10);

        mansionGraph.addEdge(11,15);
        mansionGraph.addEdge(15,11);

        mansionGraph.addEdge(12,16);
        mansionGraph.addEdge(16,12);

        mansionGraph.addEdge(13,14);
        mansionGraph.addEdge(14,13);

        mansionGraph.addEdge(14,15);
        mansionGraph.addEdge(15,14);

        mansionGraph.addEdge(15,16);
        mansionGraph.addEdge(16,15);

        mansionGraph.addEdge(16,17);
        mansionGraph.addEdge(17,16);

        //set labels
        mansionGraph.setLabel(0, "Entryway");
        mansionGraph.setLabel(1, "Hallway");
        mansionGraph.setLabel(2, "Hallway");
        mansionGraph.setLabel(3, "Grand Staircase");
        mansionGraph.setLabel(4, "Walk in closet");
        mansionGraph.setLabel(5, "Servant's quarters");
        mansionGraph.setLabel(6, "Large Hallway");
        mansionGraph.setLabel(7, "Large Hallway");
        mansionGraph.setLabel(8, "Master Bedroom");
        mansionGraph.setLabel(9, "Back Kitchen");
        mansionGraph.setLabel(10, "Font Kitchen");
        mansionGraph.setLabel(11, "Dining Room");
        mansionGraph.setLabel(12, "Sitting room");
        mansionGraph.setLabel(13, "Basement");
        mansionGraph.setLabel(14, "Drawing room");
        mansionGraph.setLabel(15, "Hallway");
        mansionGraph.setLabel(16, "Hallway");
        mansionGraph.setLabel(17, "Hidden Room");

    }
}

/*
    Mansion Layout

    START
    |
    1 - 2 - 3   4 *key
    |       |   |
    5   6 - 7 - 8
    |   |
    9 - 10- 11- 12
        |   |   |
    13- 14- 15- 16
                |
                exit


 */
