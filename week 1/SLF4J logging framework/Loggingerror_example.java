import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

   
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        int age = 15;

        if (age < 18) {
            logger.warn("User is under 18 years old.");
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Exception occurred: Cannot divide by zero.");
        }

        logger.info("Application finished.");
    }
}
