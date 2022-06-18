package S01T07N01Ex02AlbertMartin;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Worker worker1 = new FaceToFaceWorker("Herbie", "Mann", 150);
        double numberOfHoursWorker1 = askForNumberOfHours(worker1);
        int seniorityWorker1= askForSeniority(worker1);
        double salaryWorker1 = calculateSalaryWorker1(worker1, numberOfHoursWorker1, seniorityWorker1);
        shownResultsWorker1(worker1,salaryWorker1);

        Worker worker2 = new OnlineWorker("Frank", "Wess");
        double numberOfHoursWorker2 = askForNumberOfHours(worker2);
        int seniorityWorker2= askForSeniority(worker2);
        Double salaryWorker2 = calculateSalaryWorker2(worker2, numberOfHoursWorker2, seniorityWorker2);
        shownResultsWorker2(worker2, salaryWorker2);

    }

    private static void shownResultsWorker1(Worker worker1, double salaryWorker1) {
        System.out.println("El sou de " +worker1.getName() + " " + worker1.getSurname() +
                " amb tots el seus complements es: " + salaryWorker1+ "."); }



    private static void shownResultsWorker2(Worker worker2, Double salaryWorker2) {
        System.out.println("El sou de " +worker2.getSurname() + " " + worker2.getSurname() +
                " amb tots el seus complements es: " + salaryWorker2+ ".");}

    private static Double calculateSalaryWorker1(Worker worker1, double numberOfHoursWorker1) {
       // worker1.calculateSeniorityBonus();
        return worker1.calculateSalary(numberOfHoursWorker1);
    }
    private static Double calculateSalaryWorker1(Worker worker1, double numberOfHoursWorker1, int seniorityWorker1) {
        // worker1.calculateSeniorityBonus();
        return worker1.calculateSalary(numberOfHoursWorker1, seniorityWorker1);
    }

    private static Double calculateSalaryWorker2(Worker worker2, double numberOfHoursWorker2, int seniorityWorker2) {
       // worker2.calculateSeniorityBonus();
       // return worker2.calculateSalary(numberOfHoursWorker2);
        return worker2.calculateSalary(numberOfHoursWorker2, seniorityWorker2);
    }

   // private static int askForSeniority(Worker worker1) {
  //  }

    private static int askForSeniority(Worker worker) {
        System.out.println("Quina antiguitat te " +
                worker.getName() + " " + worker.getSurname() + "?.");
        Scanner sc = new Scanner((System.in));
        return sc.nextInt();
    }

    private static double askForNumberOfHours(Worker worker) {
        System.out.println("Quantes hores ha treballat " +
                worker.enviarNombre() + " " + worker.enviarApellido() + "?.");
        Scanner sc = new Scanner((System.in));
        return sc.nextDouble();
    }


}