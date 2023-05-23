package Task8;

public class Close {
    public static void deleteAccount(Account account) {
        System.out.println("Закрытие счета " + account.id);
        account.id = 0;
        account.isWork = false;
    }
}
