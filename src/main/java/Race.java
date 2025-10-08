
    public class Race {
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

