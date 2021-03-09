public class Dice {

    private int numberOfDie;

    public Dice(int numberOfDie) {
            this.numberOfDie = numberOfDie;
    }

    public int tossAndSum() {
    int sum1 = 0;
    for(int i = numberOfDie; i > 0; i--) {
        sum1 += (int) (Math.random() * 6 + 1);
    }
    return sum1;
    }

}
