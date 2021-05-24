/**
 * Тут создан класс, в котором имеется статический метод.
 * Этот метод принимает на вход три параметра:
 *   login
 *   password
 *   confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException -
 */


public class Account {
    private String login;
    private String password;
    private String confirmPassword;


    public static void setData(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException(" Login incorrect.");
        } else if (password.length() >= 20) {
            throw new WrongPasswordException(" Password incorrect");
        } else if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException(" Password mismatch.");
        } else {
            login = login;
            password = password;
            confirmPassword = confirmPassword;
        }
    }
}
