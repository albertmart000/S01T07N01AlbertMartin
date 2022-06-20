package S01T07N01Ex02AlbertMartin;

public abstract class Worker {

    private String name;
    private String surname;

    public static final int PRICE_PER_HOUR = 150;
    public static final int BONUS_PER_YEAR = 25;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //Cada vegada que marquem un mètode com a @Deprecated, indiquem els motius.

    /**
     * @ deprecated use of enviarNombre
     * is discouraged because is better to use terms in english.
     * Use getName.
     */
    @Deprecated
    public String enviarNombre() {return name;}
    public String getName() {return name;}

    /**
     * @ deprecated use of enviarNombre
     * is discouraged because it is better to use terms in english.
     * Use getSurname
     */
    @Deprecated
    public String enviarApellido() { return surname;}
    public String getSurname() { return surname;}

    /**
     * @deprecated use of calculateSalary(double numberOfHours)
     * is discouraged because now there is a new plugin to add to the salary.
     * Use calculateSalary(double numberOfHours, int seniority);
     */
    @Deprecated
    public abstract double calculateSalary(double numberOfHours);

    public abstract double calculateSalary(double numberOfHours, int seniority);

}
