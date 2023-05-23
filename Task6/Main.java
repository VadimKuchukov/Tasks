package Task6;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Andrey", 4);
        students[1] = new Student("Andrey", 3);
        students[2] = new Student("Andrey", 5);
        students[3] = new Student("Oleg", 2);
        students[4] = new Student("Max", 5);
        Check check = new Check();
        check.find(students);

    }
}
