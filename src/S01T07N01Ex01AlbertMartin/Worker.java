package S01T07N01Ex01AlbertMartin;

public abstract class Worker {

    private final String name;
    private final String surname;
    public static final int PRICE_PER_HOUR = 100;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract double calculateSalary(int numberOfHours);

}

