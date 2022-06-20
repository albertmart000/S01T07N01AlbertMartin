package S01T07N01Ex02AlbertMartin;

public class App {
    public static void main(String[] args) {

        //Construïm dos objectes Worker i afegim per paràmetres el nombre d'hores treballades
        //i un concepte nou, l'antiguitat a l'empresa.

        Worker worker1 = new FaceToFaceWorker("Herbie", "Mann", 150);
        int numberOfHoursWorker1 = 300;
        int seniorityWorker1= 15;

        Worker worker2 = new OnlineWorker("Frank", "Wess");
        int numberOfHoursWorker2 = 200;
        int seniorityWorker2= 20;

        //Invoquem dues funcions per calcular el sou, una amb el nou concepte i un altre sense aquest concepte.
        //Però com hem afegit l'annotació @SuppressWarnings no apareix cap avís a la pantalla.

        @SuppressWarnings("deprecation")
        double salaryWorker1 = worker1.calculateSalary(numberOfHoursWorker1);
        @SuppressWarnings("deprecation")
        double salaryWorker2 = worker2.calculateSalary(numberOfHoursWorker2);

        double newSalaryWorker1 = worker1.calculateSalary(numberOfHoursWorker1, seniorityWorker1);
        double newSalaryWorker2 = worker1.calculateSalary(numberOfHoursWorker2, seniorityWorker2);

        //Mostrem els resultats.
        shownResultsWorker(worker1,newSalaryWorker1);
        shownResultsWorker(worker2, newSalaryWorker2);
    }

    //Els mètodes enviarNombre i enviarApellido són obsolets, però com hem afegit l'annotació
    //@SuppressWarnings no apareix cap avís a la pantalla.
    @SuppressWarnings("deprecation")
    private static void shownResultsWorker(Worker worker, double newSalaryWorker) {
        System.out.println("El sou de " + worker.enviarNombre() + " " + worker.enviarApellido() +
                " amb tots el seus complements es: " + newSalaryWorker + ".");
    }

}

