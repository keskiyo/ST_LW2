import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testFrequencyOfTreatment() {
        assertEquals(0.5, calculator.frequencyOfTreatment(2));
        assertEquals(1.0 / 3.0, calculator.frequencyOfTreatment(3));
    }

    @Test
    public void testPeriodOfTreatmentCorner() {
        assertEquals(3.14, calculator.periodOfTreatmentCorner(2), 0.01);
        assertEquals(2.09, calculator.periodOfTreatmentCorner(3), 0.01);
    }

    @Test
    public void testPeriodOfTreatmentTime() {
        assertEquals(1, calculator.periodOfTreatmentTime(2, 2));
        assertEquals(1, calculator.periodOfTreatmentTime(3, 3));
    }

    @Test
    public void testLinearSkewness() {
        assertEquals(1, calculator.linearSkewness(2, 2));
        assertEquals(1, calculator.linearSkewness(3, 3));
    }

    @Test
    public void testLinearSkewnessPeriod() {
        assertEquals(6.28, calculator.linearSkewnessPeriod(2, 2), 0.01);
        assertEquals(6.28, calculator.linearSkewnessPeriod(3, 3), 0.01);
    }

    @Test
    public void testAngularVelocity() {
        assertEquals(1, calculator.angularVelocity(2, 2));
        assertEquals(1, calculator.angularVelocity(3, 3));
    }

    @Test
    public void testAngularVelocityPeriod() {
        assertEquals(3.14, calculator.angularVelocityPeriod(2), 0.01);
        assertEquals(2.09, calculator.angularVelocityPeriod(3), 0.01);
    }
    @Test
    public void testAngularVelocityToLinearVelocity() {
        assertEquals(4, calculator.angularVelocityToLinearVelocity(2, 2));
        assertEquals(9, calculator.angularVelocityToLinearVelocity(3, 3));
    }

    @Test
    public void testCentripetalAcceleration() {
        assertEquals(2.0, calculator.centripetalAcceleration(2, 2), 0.01);
        assertEquals(3.0, calculator.centripetalAcceleration(3, 3), 0.01);
    }

    @Test
    public void testCentripetalAccelerationCorner() {
        assertEquals(8.0, calculator.centripetalAccelerationCorner(2, 2), 0.01);
        assertEquals(27.0, calculator.centripetalAccelerationCorner(3, 3), 0.01);
    }
}
