package Project_2_BuildYourOwnClass;

/**
 * Created by Chris on 10/10/15.
 */
public class Computer
{
    //region FIELDS
    private String modelName; //the model name for the computer
    private double cpuSpeed; //the speed of the cpu in GHZ
    //endregion



    //region CONSTRUCTORS
    /**
     * No-Arg constructor.
     */
    public Computer()
    {
        setModelName("");
        setCpuSpeed(0);
    }

    /**
     * Constructor with all data given.
     *
     * @param modelName The model name of the computer.
     * @param cpuSpeed The speed of the CPU in GHZ.
     */
    public Computer(String modelName, double cpuSpeed)
    {
        this.setModelName(modelName);
        this.setCpuSpeed(cpuSpeed);
    }
    //endregion



    //region ACCESSORS
    /**
     * Get the model name of this Computer.
     *
     * @return The model name of this Computer.
     */
    public String getModelName()
    {
        return modelName;
    }

    /**
     * Get the CPU speed of this computer.
     *
     * @return The CPU speed of this computer.
     */
    public double getCpuSpeed()
    {
        return cpuSpeed;
    }
    //endregion



    //region MUTATORS
    /**
     * Change the model name of this Computer.
     *
     * @param modelName The new model name of the computer.
     */
    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    /**
     * Change the speed of this computer.
     *
     * @param cpuSpeed Thew new speed of this computer.
     */
    public void setCpuSpeed(double cpuSpeed)
    {
        this.cpuSpeed = cpuSpeed;
    }
    //endregion



    //region OVERRIDES

    /**
     * Converts this class into a readable string.
     *
     * @return The Computer as a String
     */
    public String toString()
    {
        String outputString = "";

        outputString += modelName + " ";

        outputString += cpuSpeed + "ghz";

        return outputString;
    }

    /**
     * Determines whether two Computers are equal.
     *
     * @param otherComputer The computer to be compared to this one.
     * @return Whether or not the two computers are equal.
     */
    public boolean equals(Computer otherComputer)
    {
        return (otherComputer.getCpuSpeed() == cpuSpeed && otherComputer.getModelName().equals(getModelName()));
    }

    /**
     * Determines whether two Computers are equal. Ignores case.
     *
     * @param otherComputer The Computer to be compared to this one.
     * @return Whether or not the two computers are equal.
     */
    public boolean equalsIgnoreCase(Computer otherComputer)
    {
        return (otherComputer.getCpuSpeed() == cpuSpeed && otherComputer.getModelName().equalsIgnoreCase(getModelName()));
    }
    //endregion
}
