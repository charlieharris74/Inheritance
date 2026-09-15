public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID,
                        String title, int YOB, double annualSalary) {

        super(firstName, lastName, ID, title, YOB, 0);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);

        System.out.printf("Annual Salary: $%.2f%n", annualSalary);
        System.out.printf("Weekly Pay (Annual Salary / 52): $%.2f%n", weeklyPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + annualSalary;
    }

    @Override
    public String toJSON() {
        String workerJSON = super.toJSON();

        return workerJSON.substring(0, workerJSON.length() - 1)
                + ",\"annualSalary\":" + annualSalary + "}";
    }

    @Override
    public String toXML() {
        return "<SalaryWorker>"
                + "<ID>" + getID() + "</ID>"
                + "<firstName>" + getFirstName() + "</firstName>"
                + "<lastName>" + getLastName() + "</lastName>"
                + "<title>" + getTitle() + "</title>"
                + "<YOB>" + getYOB() + "</YOB>"
                + "<annualSalary>" + annualSalary + "</annualSalary>"
                + "</SalaryWorker>";
    }

    @Override
    public String toString() {
        return super.toString() + " Salary: $" + annualSalary;
    }
}