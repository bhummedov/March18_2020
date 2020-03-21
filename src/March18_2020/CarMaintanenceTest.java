package March18_2020;

public class CarMaintanenceTest {
    public static void main(String[] args) {
        CarMaintanence myCar = new CarMaintanence("Toyota", 65000, 70000, "new", "new", "old");
        System.out.println(myCar.toString());
        myCar.displayFilterStatus();
        myCar.doOilChange();
        myCar.setAirFilterStatus("old");
        myCar.doOilChange();
        System.out.println(myCar.getOdometerNextOilChange());
        System.out.println(myCar.toString());
        myCar.doOilChange();
        myCar.doOilChange();
        System.out.println(myCar.toString());

    }
}


