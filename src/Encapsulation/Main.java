package Encapsulation;

public class Main {
    public static void main(String[] args) {
        User user = new User("ion","Johny", "Jo");
        System.out.println(user.generateDisplayName(user));
    }
}
