import exceptions.WrongLoginException;
import exceptions.exceptions.WrongPasswordException;

public class Main {

    public static void main(String[] args) {
        String login = "Alex_1971";
        String password = "AAA_1287";
        String confirmPassword = "AAA_1287";

        Autorization check = new Autorization(login, password, confirmPassword);

        try {
            Autorization.check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Логин не удовлетворяет требованиям, попробуйте другой");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль не удовлетворяет требованиям, попробуйте другой");
        }

    }
}