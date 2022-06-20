package S01T07N01Ex01AlbertMartin;

public class FaceToFaceWorker extends Worker {

    private static double gasoline;

    public FaceToFaceWorker(String name, String surname, double gasoline) {
        super(name, surname);
        this.gasoline = gasoline;
    }

    @Override
    public double calculateSalary(int numberOfHours) {
        return (numberOfHours * PRICE_PER_HOUR) + gasoline;
    }

}
