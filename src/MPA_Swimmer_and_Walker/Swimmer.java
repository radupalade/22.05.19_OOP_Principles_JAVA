package MPA_Swimmer_and_Walker;

public class Swimmer implements Swim, Breath {

    @Override
    public void breathe() {
        System.out.println("Can breathe!");
    }

    @Override
    public void swimming() {
        System.out.println("Can swim!");
    }
}
