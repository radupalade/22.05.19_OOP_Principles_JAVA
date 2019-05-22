package MPA_Multime;

public class Multime {

    private int[] date;
    private final int DIM;
    private int n;

    Multime() {
        DIM = 10;
        date = new int[DIM];
        n = 0;
    }

    Multime(int DIM) {
        this.DIM = DIM;
        date = new int[DIM];
        n = 0;
    }

    public void adauga(int valoare) {

        boolean valExist = false;

        for (int i = 0; i < date.length; i++) {
            if (date[i] == valoare) {
                valExist = true;
                break;
            }
        }

        if (!valExist && n < DIM) {
            date[n] = valoare;
            n++;

        } else {
            System.out.println("Array-ul este plin/valaorea exita deja! ");
        }

    }

    public void afisare() {
        System.out.print("date: ");
        for (int i = 0; i < n ; i++) {
            System.out.print(date[i] + " ");
        }
        System.out.println();
    }

    public void extrage(int valoare){

        boolean valExist = false;
        int index=0;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == valoare) {
                valExist = true;
                index = i;
                break;
            }
        }

        if( n>0  && valExist){

            while(index <n) {
                date[index] = date[index + 1];
                index++;
            }
            n--;
        }else{
            System.out.println("Valoare nu se gaseste in array/array-ul este gol!");
        }

    }


}
