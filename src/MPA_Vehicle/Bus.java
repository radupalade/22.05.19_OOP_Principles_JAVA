package MPA_Vehicle;

public class Bus extends Vehicle{

    @Override
    public void printState() {
        System.out.println("Bus => speed: "+ this.getSpeed()+
                " gear: "+ this.getSpeed());
    }
}
