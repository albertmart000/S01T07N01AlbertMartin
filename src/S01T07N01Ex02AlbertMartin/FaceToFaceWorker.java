public class FaceToFaceWorker extends Worker {

    private static double gasoline;

    public FaceToFaceWorker(String name, String surname, double gasoline) {
        super(name, surname);
        FaceToFaceWorker.gasoline = gasoline;
    }
    @Deprecated
    public String enviarNombre() {
        return getName();
    }

    @Deprecated
    public String enviarApellido() {
        return getSurname();
    }
    @Override
    @Deprecated
    public double calculateSalary(double numberOfHours) {
        double salary= numberOfHours * PRICE_PER_HOUR + gasoline;
        return salary;
    }

    @Override
    public double calculateSalary (double numberOFHours, int seniority) {
        double salary=numberOFHours * PRICE_PER_HOUR + seniority*BONUS_PER_YEAR + gasoline;
        return salary;
    }
}

