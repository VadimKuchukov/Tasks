package Task9;

public class Airplane {
    String producer; // производитель
    int year;        //год выпуска
    int length;      //длина
    int weight;      //вес
    int fuel = 100;  //количество топлива

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel + ".");
    }
}
