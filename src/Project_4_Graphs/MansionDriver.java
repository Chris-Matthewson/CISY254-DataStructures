package Project_4_Graphs;

import Lab10_Graphs.Graph;
import Lab5_GenericCollectionClass.Car;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

/**
 * Created by Chris Matthewson on 11/24/15.
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

        //create the mansion
        LocationNode nodeStart = new LocationNode("Entryway");
        LocationNode node1 = new LocationNode("Hallway");
        LocationNode node2 = new LocationNode("Hallway");
        LocationNode node3 = new LocationNode("Grand Staircase");
        LocationNode node4 = new LocationNode("Walk in Closet");
        LocationNode node5 = new LocationNode("Servant's Quarters");
        LocationNode node6 = new LocationNode("Large Hallway");
        LocationNode node7 = new LocationNode("Large Hallway");
        LocationNode node8 = new LocationNode("Master Bedroom");
        LocationNode node9 = new LocationNode("Back Kitchen");
        LocationNode node10 = new LocationNode("Front Kitchen");
        LocationNode node11 = new LocationNode("Dining Room");
        LocationNode node12 = new LocationNode("Sitting Room");
        LocationNode node13 = new LocationNode("Basement");
        LocationNode node14 = new LocationNode("Drawing Room");
        LocationNode node15 = new LocationNode("Hallway");
        LocationNode node16 = new LocationNode("Hallway");
        LocationNode nodeExit = new LocationNode("Hidden Room");

        //hide the key
        node4.hideKey();

        //set the connections
        nodeStart.setNode(CardinalDirection.South, node1);
        node1.setAllNodes(nodeStart, node5, node2, null);
        node2.setAllNodes(null, null, node3, node2);
        node3.setAllNodes(null, node7, null, node2);
        node4.setAllNodes(null, node8, null, null);
        node5.setAllNodes(node1, node9, null, null);
        node6.setAllNodes(null, node10, node7, null);
        node7.setAllNodes(node3, null, node8, node6);
        node8.setAllNodes(node4, null, null, node7);
        node9.setAllNodes(node5, null, node10, null);
        node10.setAllNodes(node6, node14, node11, node9);
        node11.setAllNodes(null, node15, node12, node10);
        node12.setAllNodes(null, node16, null, node11);
        node13.setAllNodes(null, null, node13, null);
        node14.setAllNodes(node10, null, node15, node13);
        node15.setAllNodes(node11, null, null, node14);
        node16.setAllNodes(node12, nodeExit, null, null);

        //set up player variables
        LocationNode currentNode = nodeStart;
        boolean keyFound = false;
        int roomsExplored = 0;

        //set up loop controls
        Scanner inputScanner = new Scanner(System.in);
        boolean exit = false;

        //show the story
        System.out.println("You find yourself in the empty mansion of Sir Pendleton IV. " +
                "You have heard stories that Sir Pendleton IV has hidden his treasure somewhere" +
                "in this mansion.");
        System.out.println("Find the key, then find the treasure!");
        System.out.println();

        while (!exit)
        {
            System.out.println("You are in: " + currentNode.getDescription());
            if (keyFound)
            {
                System.out.println("You have the key.");
            }
            System.out.print("You look around. You see you can travel ");
            for (CardinalDirection direction : CardinalDirection.values())
            {
                if (currentNode.getNode(direction) != null)
                {
                    System.out.print(direction.toString() + ", ");
                }
            }
            System.out.print("Search (R), Exit (E).");
            System.out.println();

            System.out.println("Which direction would you like to go?");

            String input = inputScanner.next();
            CardinalDirection travelDirection = null;

            switch (input.toLowerCase())
            {
                case "a":
                case "abandon":
                    System.out.println("You give up searching for the gold Sir Pendleton IV's treasure is safe.");
                    exit = true;
                    travelDirection = null;
                    break;

                case "north":
                case "n":
                    travelDirection = CardinalDirection.North;
                    break;

                case "south":
                case "s":
                    travelDirection = CardinalDirection.South;
                    break;

                case "east":
                case "e":
                    travelDirection = CardinalDirection.East;
                    break;

                case "west":
                case "w":
                    travelDirection = CardinalDirection.West;
                    break;

                case "search":
                case "r":
                    travelDirection = null;
                    if (currentNode.searchRoom())
                    {
                        System.out.println("You found the key in this room!");
                    }
                    else
                    {
                        System.out.println("The key was not found. Keep looking.");
                    }

                    keyFound = currentNode.searchRoom();
                    break;
            }

            //now travel, if applicable.
            if (travelDirection != null)
            {
                //if the node is null, they have entered an invalid direction
                if (currentNode.getNode(travelDirection) == null)
                {
                    System.out.println("Invalid Direction");
                }
                else
                {
                    //check to see if we are at the end
                    if (currentNode.getNode(travelDirection).getDescription() == "Hidden Room")
                    {
                        if (keyFound)
                        {
                            exit = true;
                            System.out.println("YOU FOUND THE TREASURE!");
                        }
                        else
                        {
                            System.out.println("The door is locked.");
                        }
                    }
                    else
                    {
                        //otherwise travel to the node
                        currentNode = currentNode.getNode(travelDirection);
                    }
                }
            }
        }
    }
}


