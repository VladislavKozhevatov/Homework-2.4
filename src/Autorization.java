import exceptions.WrongLoginException;
import exceptions.exceptions.WrongPasswordException;

public class Autorization {
    String login;
    String password;
    String confirmPassword;

    public Autorization(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin(String login) {
        return this.login;
    }

    public String getPassword(String password) {
        return this.password;
    }

    public String getConfirmPassword(String confirmPassword) {
        return this.confirmPassword;
    }

    public static void check(String login, String password, String confirmPassword) {

        if (login.length() <= 20) {
            if (login.matches("^[a-zA-Z0-9_]*$")) {
                System.out.println("Логин удовлетворяет заданным требованиям");
            } else {
                throw new WrongLoginException();
            }
        } else {
            throw new WrongLoginException();
        }

        if (password.equals(confirmPassword)) {
            if (password.length() <= 20) {
                if (login.matches("^[a-zA-Z0-9_]*$")) {
                    System.out.println("Пароль удовлетворяет заданным требованиям");
                } else {
                    throw new WrongPasswordException();
                }
            }
        } else {
            throw new WrongPasswordException();
        }

    }
}
