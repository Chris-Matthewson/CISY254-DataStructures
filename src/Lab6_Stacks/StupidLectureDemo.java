package Lab6_Stacks;
/**
    Programmed by   Stephen Brower
    Inspired by     Michael Main
    Date Written    ?
    Date Modified   10/8/2015 - changed cars

    For Sample Output, see below
*/

public class StupidLectureDemo
{
    public static void main(String[] args)
    {
        Stack<Car> myStack = new Stack<Car>();  // Stack of Car!

        Car carInGarage = new Car(2016,"Porsche Cayenne GTS");
        Car carInDriveway = new Car(1965,"Shelby Mustang GT 350");

        System.out.println("Car in Garage: " + carInGarage);
        System.out.println("Car in Driveway: " + carInDriveway);

        System.out.println("\nSWAP using stack\n");

        myStack.push(carInGarage);
        myStack.push(carInDriveway);

        carInGarage = myStack.pop();
        carInDriveway = myStack.pop();

        System.out.println("Car in Garage: " + carInGarage);
        System.out.println("Car in Driveway: " + carInDriveway);
    }

}

/*
run:
Car in Garage: [Car 2016 Porsche Cayenne GTS]
Car in Driveway: [Car 1965 Shelby Mustang GT 350]

SWAP using stack

Car in Garage: [Car 1965 Shelby Mustang GT 350]
Car in Driveway: [Car 2016 Porsche Cayenne GTS]
BUILD SUCCESSFUL (total time: 0 seconds)

*/

