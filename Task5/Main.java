package Task5;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Supplier supplier = new Supplier();
        supplier.refuel(plane);
        System.out.println(plane.getFuel());
    }
}
