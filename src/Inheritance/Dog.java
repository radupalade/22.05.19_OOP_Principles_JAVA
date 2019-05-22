package Inheritance;

public class Dog extends Animal {

    private String color;

    Dog(int age, int numberOfLegs, boolean vegetarian,String color){
        super( age,  numberOfLegs,  vegetarian);
        this.color = color;
    }

    public void bark(){
        System.out.println("Ham Ham!");

    }

    @Override
    public String printUsingGetters() {
        return super.printUsingGetters() +
                " color: "+this.getColor();
    }

        public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + " color: " +this.color;
    }
}
