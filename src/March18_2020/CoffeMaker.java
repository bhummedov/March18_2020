package March18_2020;

public class CoffeMaker {
    int cups_Quantity;
    String timer;

    public CoffeMaker(int cups, String time){
        this.cups_Quantity=cups;
        this.timer=time;

    }

    public int getCups_Quantity() {
        return cups_Quantity;
    }

    public void setCups_Quantity(int cups_Quantity) {
        this.cups_Quantity = cups_Quantity;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "cups_Quantity=" + cups_Quantity +
                ", timer='" + timer + '\'' +
                '}';
    }
public void setTheTimer(String time){
        String []arr=new String [3];
        arr=time.split(":");
        int hour=Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr[1]);
        int sec=Integer.parseInt(arr[2]);
        if(hour>=0&& hour<24&&min>=0 && min<60 && sec<60 &&sec>=0){
            this.timer=time;
        }
        else{
            System.out.println("not valid");
        }
    }
    public void checkStatus(){
        System.out.println("cups:"+cups_Quantity);
        System.out.println("timer:"+this.timer);

    }
    public void resetTimer(){
        this.timer="00:00:00";
    }
}

