import java.util.Date;

public interface User {
    void logIn();

    void logOut();

    String getUserName(String userName);

    String getRegisterDate(Date registerDate);
}
