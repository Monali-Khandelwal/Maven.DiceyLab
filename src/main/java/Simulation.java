public class Simulation {

    private int numberOfDies;
        private int numberOfTosses;
        private Bins result;
        private Dice dice;

        public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.result = new Bins(numberOfDies, numberOfDies * 6);
        this.dice = new Dice(numberOfDies);
         }

         public void runSimulation() {

            for(int i = 0; i < numberOfTosses; i++) {
                int sum = dice.tossAndSum();
                result.incrementBin(sum);
            }
    }

    public void printResults() {
            System.out.println("***");
            System.out.println("Simulation " + numberOfDies + " dice tossed for " + numberOfTosses + " times.");
            System.out.println("***");
            System.out.println();
            for(int i = numberOfDies; i <= numberOfDies * 6; i++) {
                double average = (double) result.getBin(i)/numberOfTosses;
                String stars = "";
            if (average >= 0 && average < 0.025) {
                stars = "*";
    }

    if(average  > 0.025 && average < 0.05) {
            stars = "**";
        }

    if(average > 0.050 && average < 0.075) {
        stars = "*****";
    }

    if(average > 0.075 && average < 0.10) {
            stars = "********";
    }
    if(average > 0.10 && average < 0.125) {
                 stars = "***********";
    }
    if(average > 0.125 && average < 0.15) {
              stars = "*************";
    }
    if(average > 0.15 && average < 0.175) {
               stars = "****************";
    }
    System.out.println(String.format("%2d :",i) + String.format("%10d:  ", result.getBin(i)) +
            String.format("%.2f  ",(double) result.getBin(i)/numberOfTosses) + stars);
    }
    }
}
