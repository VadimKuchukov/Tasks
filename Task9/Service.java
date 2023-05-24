package Task9;

import java.time.LocalDate;


public class Service {
    // Заправка
    public void refueling(Airplane airplane) {
        if (airplane.fuel == 100) System.out.println("Полный бак");;
        int priceRub = 56;
        int result = (100 - airplane.fuel) * priceRub;
        airplane.fuel = 100;
        System.out.println("Стоимость заправки " + result);
    }
    // Утилизация
    public void util(Airplane airplane) {
        if (LocalDate.now().getYear() - airplane.year > 30) {
            System.out.println("Самолет пора в утиль");
        }
        else System.out.println("Самолет еще полетает");
    }

    // Количество самолетов, весом более 50 тонн
    public int countAirplane(Airplane[] airplanes) {
        int count = 0;
        for (int i = 0; i < airplanes.length; i++) {
            if (airplanes[i].weight > 50) {
                count++;
            }
        }
        return count;
    }
}
