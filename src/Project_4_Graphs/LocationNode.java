package Project_4_Graphs;

/**
 * Created by Chris Matthewson on 12/7/15.
 */
public class LocationNode
{
    //region FIELDS
    private String description;//description of this node.
    private boolean hasKey;

    //connected nodes, may be null.
    private LocationNode[] connectedNodes;
    //endregion



    //region CONSTRUCTORS
    /**
     * No arg constructor
     *
     * @param newDescription The new description for this node.
     */
    public LocationNode(String newDescription)
    {
        connectedNodes = new LocationNode[4];
        description = newDescription;
        hasKey = false;
    }

    /**
     * Constructor with all nodes and a description. Nodes may be null.
     *
     * @param newDescription Description of this node.
     * @param northNode North node.
     * @param southNode South node.
     * @param eastNode East node.
     * @param westNode West node.
     */
    public LocationNode(String newDescription, LocationNode northNode, LocationNode southNode,
                        LocationNode eastNode, LocationNode westNode, boolean key)
    {
        //init array
        connectedNodes = new LocationNode[4];

        //set description
        description = newDescription;

        //set node
        setNode(CardinalDirection.North, northNode);
        setNode(CardinalDirection.South, southNode);
        setNode(CardinalDirection.East, eastNode);
        setNode(CardinalDirection.West, westNode);

        //set key
        hasKey = key;
    }
    //endregion



    //region public methods

    /**
     * Get the description of this node.
     * @return The description of this node.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Get the node in the specified cardinal direction from this node.
     *
     * @param direction The direction of the node to get.
     * @return The node in the specified direction. May be null.
     */
    public LocationNode getNode(CardinalDirection direction)
    {
        //get integer value of direction and return corresponding node
        return connectedNodes[direction.ordinal()];
    }

    /**
     * Set the node int he given ordinal direction.
     *
     * @param direction The direction of the node to set.
     * @param node The new node, may be null.
     */
    public void setNode(CardinalDirection direction, LocationNode node)
    {
        //get integer value of direction and return corresponding node
        connectedNodes[direction.ordinal()] = node;
    }

    /**
     * Set all nodes connected to this one. Nodes may be null.
     *
     * @param northNode New north node.
     * @param southNode new south node.
     * @param eastNode new east node.
     * @param westNode new west node.
     */
    public void setAllNodes(LocationNode northNode, LocationNode southNode,
                            LocationNode eastNode, LocationNode westNode)
    {
        setNode(CardinalDirection.North, northNode);
        setNode(CardinalDirection.South, southNode);
        setNode(CardinalDirection.East, eastNode);
        setNode(CardinalDirection.West, westNode);
    }

    /**
     * Checks the room for a key. Returns whether or not the key was found.
     *
     * @return Whether or not the key was found.
     */
    public boolean searchRoom()
    {
        return hasKey;
    }

    /**
     * Hide the key in this room.
     */
    public void hideKey()
    {
        hasKey = true;
    }
    //endregion
}
