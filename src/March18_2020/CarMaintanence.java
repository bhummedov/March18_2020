package March18_2020;

public class CarMaintanence {
    private String carName;
    private int odometerCurrent;
    private int odometerNextOilChange;
    private String airFilterStatus;
    private String cabinFilterStatus;
    private String oilFilterStatus;


    public CarMaintanence(String carName, int odometerCurrent, int odometerNextOilChange, String airFilterStatus, String cabinFilterStatus, String oilFilterStatus) {
        this.carName = carName;
        this.odometerCurrent = odometerCurrent;
        this.odometerNextOilChange = odometerNextOilChange;
        this.airFilterStatus = airFilterStatus;
        this.cabinFilterStatus = cabinFilterStatus;
        this.oilFilterStatus = oilFilterStatus;
    }

    public String getCarName() {
        return carName;
    }


    public void setCarName(String carName) {
        this.carName = carName;
    }


    public int getOdometerCurrent() {
        return odometerCurrent;
    }


    public void setOdometerCurrent(int odometerCurrent) {
        this.odometerCurrent = odometerCurrent;
    }

    public int getOdometerNextOilChange() {
        return odometerNextOilChange;
    }


    public String getAirFilterStatus() {
        return airFilterStatus;
    }


    public void setAirFilterStatus(String airFilterStatus) {
        this.airFilterStatus = airFilterStatus;
    }


    public String getCabinFilterStatus() {
        return cabinFilterStatus;
    }


    public void setCabinFilterStatus(String cabinFilterStatus) {
        this.cabinFilterStatus = cabinFilterStatus;
    }


    public String getOilFilterStatus() {
        return oilFilterStatus;
    }


    public void setOilFilterStatus(String oilFilterStatus) {
        this.oilFilterStatus = oilFilterStatus;
    }

    public void displayFilterStatus() {
        String status = "\t\t\t FILTER STATUS\n" +
                "Air Filter \t: \t\t" + this.airFilterStatus + "\n" +
                "Cabin Filter \t: \t\t" + this.cabinFilterStatus + "\n" +
                "Oil Filter \t: \t\t" + this.oilFilterStatus;
        System.out.println(status);
    }

    public void doOilChange() {
        if (!this.oilFilterStatus.equalsIgnoreCase("new") && this.odometerNextOilChange - this.odometerCurrent <= 0) {
            this.oilFilterStatus = "new";
        } else {
            System.out.println("You do not need to change oil filter");
        }
        if (!this.cabinFilterStatus.equalsIgnoreCase("new") && this.odometerNextOilChange - this.odometerCurrent <= 0) {
            this.cabinFilterStatus = "new";
        } else {
            System.out.println("Cabin filter is OK");
        }
        if (!this.airFilterStatus.equalsIgnoreCase("new") && this.odometerNextOilChange - this.odometerCurrent <= 0) {
            this.airFilterStatus = "new";
        } else {
            System.out.println("Air filter is OK");
        }
        this.odometerNextOilChange = this.odometerCurrent + 5000;
    }


    @Override
    public String toString() {
        return "CarMaintain{" +
                "carName='" + carName + '\'' +
                ", odometerCurrent=" + odometerCurrent +
                ", odometerNextOilChange=" + odometerNextOilChange +
                ", airFilterStatus='" + airFilterStatus + '\'' +
                ", cabinFilterStatus='" + cabinFilterStatus + '\'' +
                ", oilFilterStatus='" + oilFilterStatus + '\'' +
                '}';
    }
}