package homework3.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        isAuthenticate = this.name.equals(name) && this.password.equals(password);
        return isAuthenticate();
    }

    public void logOut()
    {
        isAuthenticate = false;
    }
}