package Task8;

public class Account {
    int id;
    boolean isWork = true;

    public void showInfo() {
        if (isWork) {
            System.out.println("Счет " + id + " открыт.");
        }
        else System.out.println("Счет " + " закрыт.");
    }
}
