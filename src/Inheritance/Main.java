package Inheritance;


public class Main {

    public static void printDetails(Animal animal){
        System.out.println(animal);
    }

    public static void main(String[] args) {

        Animal animal = new Animal(6, 4,true);
        System.out.println(animal.printUsingGetters());

        Dog dog1 = new Dog(15,4,false,"white");
        System.out.println(dog1.printUsingGetters());
        dog1.bark();

        Animal dog2 = new Dog(5,4,false,"black");
        System.out.println(dog2.printUsingGetters());
        ((Dog)dog2).bark();

        ///////

        Animal animal2 = new Animal(2,2,true);
        System.out.println(animal2.toString());

        Animal dog3 = new Dog(8,4,false,"gray");
        System.out.println(dog3.toString());

        ////

        printDetails(animal2);
        printDetails(dog3);

    }
}
