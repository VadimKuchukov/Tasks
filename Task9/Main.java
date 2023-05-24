package Task9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2010, 50000, 100);
        Airplane airplane2 = new Airplane("Boeing", 1970, 30000, 51);
        Airplane airplane3 = new Airplane("Airbus", 2000, 25000, 20);
        Airplane[] airplanes = new Airplane[]{airplane1, airplane2, airplane3};

        airplane1.fuel = 50;
        Service service = new Service();
        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i].info();
            service.refueling(airplanes[i]);
            service.util(airplanes[i]);
        }

        System.out.println("Количество самолетов, весом более 50 тонн: " + service.countAirplane(airplanes));

    }
}
