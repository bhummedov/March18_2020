package March18_2020;

public class CarWash {
    public static void calculateCost(int numberOfCars){
       int totalCostOfWash=numberOfCars*7;
       numberOfCars++;
        System.out.println("Total washing cost for  " + numberOfCars+ " is" +totalCostOfWash);
    }
}
