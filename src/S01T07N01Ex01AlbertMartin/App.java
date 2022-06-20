package S01T07N01Ex01AlbertMartin;

public class App {
    public static void main(String[] args) {

        Worker worker1 = new FaceToFaceWorker("Herbie", "Mann", 150);
        int numberOfhoursWorker1 = 300;
        double salaryWorker1= worker1.calculateSalary(numberOfhoursWorker1);
        shownResultsWorker(worker1, salaryWorker1);

        Worker worker2 = new OnlineWorker("Frank", "Wess");
        int numberOfhoursWorker2 = 200;
        double salaryWorker2= worker2.calculateSalary(numberOfhoursWorker2);
        shownResultsWorker(worker2, salaryWorker2);

    }

    private static void shownResultsWorker(Worker worker, double salaryWorker) {
        System.out.println("El sou de " +worker.getName() + " " + worker.getSurname() +
                " amb tots el seus complements es: " + salaryWorker + ".");
    }

}