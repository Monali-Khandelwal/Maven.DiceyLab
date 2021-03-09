import java.util.TreeMap;

public class Bins {

    private int min;
    private int max;
    private TreeMap<Integer, Integer> results;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        results = new TreeMap<Integer, Integer>();
        for(int i = min; i <= max; i++) {
            results.put(i, 0);
       }
    }
    public int getBin(int number) {
        return results.get(number);
    }
    public void incrementBin(int number) {
        int value = results.get(number);
        value++;
        results.put(number, value);
    }
}

