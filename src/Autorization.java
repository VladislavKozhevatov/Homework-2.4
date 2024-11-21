import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Autorization {


    public static void check(String login, String password, String confirmPassword) {
        checkLogin(login);
        checkPassword(password, confirmPassword);
    }


    public static void checkLogin(String login) {

        if (login.length() <= 20 && login.matches("^[a-zA-Z0-9_]*$")) {
            System.out.println("Логин удовлетворяет заданным требованиям");
        } else {
            throw new WrongLoginException();
        }
    }


    public static void checkPassword(String password, String confirmPassword) {

        if (password.equals(confirmPassword) && password.length() <= 20 & password.matches("^[a-zA-Z0-9_]*$")) {
            System.out.println("Пароль удовлетворяет заданным требованиям");
        } else {
            throw new WrongPasswordException();
        }
    }
}


