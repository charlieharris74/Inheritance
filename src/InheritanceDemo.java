import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        // 3 hourly workers
        workers.add(new Worker(
                "John", "Smith", "W001", "Mr.", 1990, 20.00));

        workers.add(new Worker(
                "Emily", "Brown", "W002", "Ms.", 1995, 22.50));

        workers.add(new Worker(
                "Michael", "Jones", "W003", "Mr.", 1988, 25.00));

        // 3 salary workers
        workers.add(new SalaryWorker(
                "Sarah", "Davis", "S001", "Ms.", 1985, 52000.00));

        workers.add(new SalaryWorker(
                "David", "Wilson", "S002", "Mr.", 1980, 65000.00));

        workers.add(new SalaryWorker(
                "Jessica", "Miller", "S003", "Dr.", 1978, 78000.00));

        double[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {

            double hours = weeklyHours[week];

            System.out.println();
            System.out.println("==========================================");
            System.out.println("WEEK " + (week + 1) + " - " + hours + " HOURS");
            System.out.println("==========================================");

            System.out.printf("%-20s %-15s %12s%n",
                    "Employee", "Type", "Weekly Pay");

            System.out.println("------------------------------------------");

            for (Worker worker : workers) {

                String type;

                if (worker instanceof SalaryWorker) {
                    type = "Salary";
                } else {
                    type = "Hourly";
                }

                System.out.printf("%-20s %-15s $%11.2f%n",
                        worker.fullName(),
                        type,
                        worker.calculateWeeklyPay(hours));
            }
        }
    }
}