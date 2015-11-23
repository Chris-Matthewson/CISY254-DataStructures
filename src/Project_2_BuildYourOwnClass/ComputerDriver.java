package Project_2_BuildYourOwnClass;

import java.util.Scanner;

/**
 * Created by Chris on 11/14/15.
 */
public class ComputerDriver
{
    public static void main (String[] args)
    {
        boolean quitRequested = false;
        Scanner scanner = new Scanner(System.in);

        while (!quitRequested)
        {
            System.out.println("Please enter a command.");
            System.out.println("Q or QUIT: Quit this program.");
            System.out.println("T or TEST: Run automated tests on the computer class.");
            System.out.println("E or ENTER: Enter your own computer class.");

            switch (scanner.nextLine().toLowerCase())
            {
                case "q":
                case "quit":
                    quitRequested = true;
                    break;
                case "t":
                case "test":
                    //define computers for test
                    Computer c1 = new Computer("dell", 2.1); //control case
                    Computer c2 = new Computer("dell", 2.1); //for testing equals true
                    Computer c3 = new Computer("DELL", 2.1); //for testing equalsIgnoreCase true
                    Computer c4 = new Computer("HP",2.1); //for testing equals false on name
                    Computer c5 = new Computer("dell", 2.2); //for testing equals false on speed

                    //test whether two identical computers are equal
                    boolean equalsTrue = c1.equals(c2);
                    if (equalsTrue)
                    {
                        System.out.println("Test 1 passed.");
                    }
                    else
                    {
                        System.out.println("Test 1 failed.");
                    }

                    //test computers with different capitalization
                    boolean equalsIgnoreCaseTrue = c1.equalsIgnoreCase(c3);
                    if (equalsIgnoreCaseTrue)
                    {
                        System.out.println("Test 2 passed.");
                    }
                    else
                    {
                        System.out.println("Test 2 failed.");
                    }

                    //make sure that different model names come back as false
                    boolean equalsFalseName = c1.equalsIgnoreCase(c4);
                    if (equalsFalseName == false)
                    {
                        System.out.println("Test 3 passed.");
                    }
                    else
                    {
                        System.out.println("Test 3 failed.");
                    }

                    //make sure that different speeds come back as false
                    boolean equalsFalseSpeed = c1.equalsIgnoreCase(c5);
                    if (equalsFalseSpeed == false)
                    {
                        System.out.println("Test 4 passed.");
                    }
                    else
                    {
                        System.out.println("Test 4 failed.");
                    }

                    //test toString()
                    System.out.println(c1.toString());
                    break;
                case "e":
                case "enter":

                    //define the computer
                    Computer c = new Computer();

                    //prompt the user to enter the model name and store it
                    System.out.println("Please enter the model name of your computer.");
                    String modelName = scanner.next();
                    c.setModelName(modelName);

                    //prompt the user to enter the speed and store it
                    System.out.println("Please enter the speed (in GHZ) of your computer.");
                    String speed = scanner.next();
                    c.setCpuSpeed(Double.parseDouble(speed));

                    //report the results
                    System.out.println("Your computer name: " + c.getModelName());
                    System.out.println("Your computer speed: " + c.getCpuSpeed());
                    break;

            }
        }



    }
}
