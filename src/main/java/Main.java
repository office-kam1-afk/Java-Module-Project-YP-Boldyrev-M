import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        final int minSpeed = 0;
        final int maxSpeed = 250;
        for (int i = 0; i < 3; i++) {
            System.out.println("- Введите название машины №" + (i + 1) + ":");
            String racingName = scanner.nextLine();
            int speedCar;
            while (true) {
                System.out.println("- Введите скорость машины №" + (i + 1) + ":");
                if (scanner.hasNextInt()) {
                    speedCar = scanner.nextInt();
                    if (speedCar >= minSpeed && speedCar <= maxSpeed) {
                        break;
                    } else {
                        System.out.println("- Неправильная скорость");
                    }
                } else {
                    System.out.println(" - Введите целое число!");
                    scanner.next();
                }
            }
            scanner.nextLine();
           race.addRaceCar(new RacingCar(racingName, speedCar));
        }
        System.out.println("Самая быстрая машина: " + race.getWinner().getRacingName());

        scanner.close();
    }
}
