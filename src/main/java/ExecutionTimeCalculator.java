import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExecutionTimeCalculator {
    public static long functionToCall() {
        long returnValue = 0;
        for (long i = 1; i < 1000L * 1000 * 1000 * 10; i++) {
            returnValue += i;
        }
        return returnValue;
    }

    public static BigDecimal measureExecutionTime(Runnable function) {
        // TODO: Implement
        Long started_at = System.nanoTime();
        function.run();
        Long finished_at = System.nanoTime();

        long duration = finished_at - started_at;
        BigDecimal bigDecimalDuration = new BigDecimal(duration);

        return bigDecimalDuration.divide(new BigDecimal(1_000_000_000),5, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        System.out.println(measureExecutionTime(ExecutionTimeCalculator::functionToCall));
    }
}
