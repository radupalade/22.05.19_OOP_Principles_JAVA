package MPA_Swimmer_and_Walker;

public class Main {

    public static void main(String[] args) {

        Swimmer s = new Swimmer();
        s.breathe();
        s.swimming();
        System.out.println();

        Walker w = new Walker();
        w.breathe();
        w.go();

    }
}
