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
