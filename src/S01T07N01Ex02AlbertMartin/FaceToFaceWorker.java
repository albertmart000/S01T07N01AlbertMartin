package S01T07N01Ex02AlbertMartin;

public class FaceToFaceWorker extends Worker {

    private static double gasoline;

    public FaceToFaceWorker(String name, String surname, double gasoline) {
        super(name, surname);
        FaceToFaceWorker.gasoline = gasoline;
    }

    /**
     * @deprecated use of calculateSalary(double numberOfHours)
     * is discouraged because now there is a new plugin to add to the salary.
     * Use calculateSalary(double numberOfHours, int seniority);
     */
    @Deprecated
    public double calculateSalary(double numberOfHours) {
        return numberOfHours * PRICE_PER_HOUR + gasoline;
    }

    @Override
    public double calculateSalary (double numberOFHours, int seniority) {
        return numberOFHours * PRICE_PER_HOUR + seniority*BONUS_PER_YEAR + gasoline;
    }
}

