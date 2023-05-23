package Task7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2);
        Dog dog = new Dog("Мухтар", 12);
        System.out.println("Имя кота: " + Transformator.changeDog(dog).getName());
        System.out.println("Имя пса: " + Transformator.changeCat(cat).getName());

    }
}
