package Task7;

public class Transformator {
    public static Cat changeDog(Dog dog) {
        Cat cat = new Cat(dog.getName(), dog.getAge());
        return cat;
    }

    public static Dog changeCat(Cat cat) {
        Dog dog = new Dog(cat.getName(), cat.getAge());
        return dog;
    }
}
