package Inheritance;

public class Animal {
    private int age;
    private int numberOfLegs;
    private boolean vegetarian;

    Animal(int age, int numberOfLegs, boolean vegetarian){
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }


    public void eat(){
        System.out.println("Inheritance.Animal is eating!");
    }

    public String printUsingGetters(){
        return "years: "+ this.getAge() +" legs: "
                +this.getNumberOfLegs()+" vegetarian: "+ this.isVegetarian();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString(){
        return "years: "+ this.age +" legs: "
                +this.numberOfLegs+" vegetarian: "+ this.vegetarian;
    }
}
