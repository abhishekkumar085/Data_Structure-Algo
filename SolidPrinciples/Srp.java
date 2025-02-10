package SolidPrinciples;

// The single responsibility principles states that a class should have only one reason to change,meaning it should have only one responsibility.This makes the code easier to maintain,test,extend.
//"For example, imagine a UserManager class that handles user authentication, updating usernames, and sending email notifications. If we need to change how authentication works, we might accidentally break email sending. To follow SRP, we should split this into separate classes:"
class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
// service responsible for user authentication

class AuthenticationService {

    public boolean authenticate(User user) {
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            System.out.println("User Authenticated");
            return true;
        }
        System.out.println("Authentication Failed");
        return false;
    }
}

// service responsible for user updates
class UserService {

    public void updateUsername(User user, String newUsername) {
        user.setUsername(newUsername);
        System.out.println("Username updated to: " + newUsername);
    }
}

public class Srp {

    public static void main(String[] args) {
        System.out.println("Implementation of Single Responsibility Principle");

        User user = new User("admin", "Hii");

        AuthenticationService auth = new AuthenticationService();

        UserService userService = new UserService();

        auth.authenticate(user);
        System.out.println("Actual Username is:" + " " + user.getUsername() + " and PAssword is: " + "" + user.getPassword());

        userService.updateUsername(user, "Hello");

        System.out.println("Updated Username is:" + " " + user.getUsername() + " and PAssword is: " + "" + user.getPassword());

    }

}
