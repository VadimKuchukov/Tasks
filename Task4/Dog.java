package Task4;

public class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }

    public void jump(int count) {
        System.out.println("Пёс " + name + " прыгнул " + count + " раз.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Барбос");
        dog.jump(7);
    }
}
