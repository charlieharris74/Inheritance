import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @Test
    void calculateWeeklyPay() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        assertEquals(1000.00, worker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void calculateWeeklyPayIgnoresHours() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        assertEquals(1000.00, worker.calculateWeeklyPay(50), 0.01);
    }

    @Test
    void getAnnualSalary() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        assertEquals(52000.00, worker.getAnnualSalary(), 0.01);
    }

    @Test
    void setAnnualSalary() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        worker.setAnnualSalary(62400.00);

        assertEquals(62400.00, worker.getAnnualSalary(), 0.01);
    }

    @Test
    void toCSVTest() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        assertTrue(worker.toCSV().contains("52000.0"));
    }

    @Test
    void toJSONTest() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        assertTrue(worker.toJSON().contains("\"annualSalary\":52000.0"));
    }

    @Test
    void toXMLTest() {
        SalaryWorker worker = new SalaryWorker(
                "Jane", "Doe", "002", "Ms.", 1992, 52000.00);

        assertTrue(worker.toXML().contains(
                "<annualSalary>52000.0</annualSalary>"));
    }
}