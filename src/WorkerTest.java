import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void calculateWeeklyPayRegularHours() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        assertEquals(800.00, worker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void calculateWeeklyPayOvertime() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        assertEquals(1100.00, worker.calculateWeeklyPay(50), 0.01);
    }

    @Test
    void getHourlyPayRate() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        assertEquals(20.00, worker.getHourlyPayRate(), 0.01);
    }

    @Test
    void setHourlyPayRate() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        worker.setHourlyPayRate(25.00);

        assertEquals(25.00, worker.getHourlyPayRate(), 0.01);
    }

    @Test
    void toCSVTest() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        assertTrue(worker.toCSV().contains("20.0"));
    }

    @Test
    void toJSONTest() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        assertTrue(worker.toJSON().contains("\"hourlyPayRate\":20.0"));
    }

    @Test
    void toXMLTest() {
        Worker worker = new Worker(
                "John", "Smith", "001", "Mr.", 1990, 20.00);

        assertTrue(worker.toXML().contains(
                "<hourlyPayRate>20.0</hourlyPayRate>"));
    }
}