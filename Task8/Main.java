package Task8;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Account account2 = new Account();
        account.id = 1235;
        account2.id = 9985;
        account.showInfo();
        account2.showInfo();
        Close.deleteAccount(account);
        account.showInfo();
        account2.showInfo();



    }
}
