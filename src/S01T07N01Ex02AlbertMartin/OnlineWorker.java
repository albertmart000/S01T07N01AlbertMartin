package S01T07N01Ex02AlbertMartin;

public class OnlineWorker extends Worker {

    private static final double INTERNET_RATE = 50;

    public OnlineWorker(String name, String surname) {
        super(name, surname);

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
    public String getSurname() {
        return super.getSurname();
    }

    /**
     * @param numberOFHours
     * @return
     */
  //  @Override
    @Deprecated
    public double calculateSalary (double numberOFHours){
        return numberOFHours*PRICE_PER_HOUR + INTERNET_RATE;
    }


    //@Override
    public double calculateSalary (double numberOFHours, int seniority) { return numberOFHours*PRICE_PER_HOUR +
            seniority*BONUS_PER_YEAR + INTERNET_RATE;
    }

}
