package MPA_Vehicle;

public class Truck  extends Vehicle{


    @Override
    public void printState() {
        System.out.println("Truck => speed: "+ this.getSpeed()+
                " gear: "+ this.getSpeed());
    }
}
