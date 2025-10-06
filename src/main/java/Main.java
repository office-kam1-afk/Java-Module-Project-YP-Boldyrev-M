import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RacingCar[] racingCars = new RacingCar[3];
        Race race = new Race();
        int speedCar;
        for (int i = 0; i < 3; i++) {
        System.out.println("- Введите название машины №" + (i + 1) + ":");
        String racingName = scanner.nextLine();
          while (true) {
         System.out.println(" - Введите скорость машины №" + (i + 1) + ":");
         if (scanner.hasNextInt()) {
                    speedCar = scanner.nextInt();
                    if (speedCar >= 0 && speedCar <= 250) {
                        break;
                    } else {
                        System.out.println(" - Неправильная скорость ");
                    }
                } else {
                    scanner.next();
                }
            }
            scanner.nextLine();
            racingCars[i] = new RacingCar(racingName, speedCar);
            race.addRaceCar(racingCars[i]);
        }

        System.out.println("Самая быстрая машина: " + race.getWinner().getRacingName());
        scanner.close();
    }

    static class RacingCar {
        private String racingName;
        private int speedCar;

        RacingCar(String racingName, int speedCar) {
            this.racingName = racingName;
            this.speedCar = speedCar;
        }

        public String getRacingName() {
            return racingName;
        }

        public int getSpeedCar() {
            return speedCar;
        }
    }

    static class Race {
        private RacingCar currentRaceLeader = null;

        public void addRaceCar(RacingCar raceCar) {
            if (currentRaceLeader == null || raceCar.getSpeedCar() > currentRaceLeader.getSpeedCar()) {
                currentRaceLeader = raceCar;
            }
        }

        public RacingCar getWinner() {
            return currentRaceLeader;
        }
    }
}