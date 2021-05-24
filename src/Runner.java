public class Runner {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException{

        Account account = new Account();

        account.setData( "Login", "password", "password");
    }
}
