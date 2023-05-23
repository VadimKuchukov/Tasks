package Task6;

public class Check {
    public void find (Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade == 5) {
                System.out.println("Нашли отличника: "+ students[i].name);
            }
        }
    }
}
