package Encapsulation;

public class User {
    private final String username;
    private final String firstName;
    private final String lastName;

    User(  String username,String firstName,String lastName){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateDisplayName(User user){
        return "Full name: "+this.username +
                " "+ this.firstName +
                " "+this.lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
