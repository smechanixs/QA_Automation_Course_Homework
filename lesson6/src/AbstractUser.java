import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class AbstractUser implements User {

    private String userName;
    private String registerDate;
    private boolean isAdmin;
    private boolean isLoggedIn;

    public AbstractUser(String userName, String registerDate, boolean isAdmin, boolean isLoggedIn) {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date currDate = new Date();
        this.userName = userName;
        this.registerDate = df.format(currDate);
        this.isAdmin = false;
        this.isLoggedIn = isLoggedIn;
    }


    public String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegisterDate() {
        return registerDate;
    }


    boolean isAdmin() {
        return isAdmin;
    }

    void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public void logIn() {
        System.out.println("User " + this.userName + " has logged in.");
        this.isLoggedIn = true;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    @Override
    public void logOut() {
        System.out.println("User " + this.userName + " has logged out.");
        this.isLoggedIn = false;
    }

    @Override
    public String toString() {
        return "[userName=" + userName + ", registrationDate=" + registrationDate + ", isAdmin=" + isAdmin + ", isLoggedIn=" + isLoggedIn + "]";
    }
}
