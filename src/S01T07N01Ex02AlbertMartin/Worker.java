package S01T07N01Ex02AlbertMartin;

public abstract class Worker {

    private String name;
    private String surname;
   // private int seniority;

    public static final int PRICE_PER_HOUR = 150;
    public static final int BONUS_PER_YEAR = 25;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
       // this.seniority= seniority;
    }


    public String getName() {
        return name;
    }

    @Deprecated
    public String enviarNombre() {return  name;}
    @Deprecated
    public String enviarApellido() {
        return surname;
    }
    public String getSurname() {
        return surname;
    }

   // public int getSeniority() {return seniority;}

   /* public int calculateSeniorityBonus() {
        Period period = Period.between(incorporationDate, LocalDate.now());
        int seniorityBonus= period.getYears()*BONUS_PER_YEAR;
        return seniorityBonus;
    }*/

    @Deprecated
    public abstract double calculateSalary(double numberOfHours);


    public abstract double calculateSalary(double numberOfHours, int seniority);


}
