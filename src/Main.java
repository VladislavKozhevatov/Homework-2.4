import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {

    public static void main(String[] args) {
        String login = "Alex_197";
        String password = "AAA_1287";
        String confirmPassword = "AAA_1287";

        Autorization check = new Autorization();

        try {
            Autorization.checkLogin(login);
            Autorization.checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Логин не удовлетворяет требованиям, попробуйте другой");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль не удовлетворяет требованиям, попробуйте другой");
        } finally {
            System.out.println("Валидация окончена");
        }

    }
}