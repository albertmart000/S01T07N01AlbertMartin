package S01T07N01Ex01AlbertMartin;

public class OnlineWorker extends Worker{

    private static final double INTERNET_RATE = 50;

    public OnlineWorker(String name, String surname) {
        super(name, surname);
    }

    @Override
    public double calculateSalary (int numberOfHours){
        return (numberOfHours * PRICE_PER_HOUR) + INTERNET_RATE;
    }

}
