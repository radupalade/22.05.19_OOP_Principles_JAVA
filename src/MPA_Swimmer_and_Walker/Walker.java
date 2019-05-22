package MPA_Swimmer_and_Walker;

public class Walker implements Walk, Breath{

    @Override
    public void breathe() {
        System.out.println("Can breathe!");
    }

    @Override
    public void go() {
        System.out.println("Can go!");
    }
}
