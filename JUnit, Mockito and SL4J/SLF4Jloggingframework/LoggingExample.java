import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public void processUser(String username) {

        if (username == null || username.isEmpty()) {

            logger.warn("Username is null or empty.");

            return;
        }

        if (username.equalsIgnoreCase("admin")) {

            logger.error("Access denied for user: {}", username);

            return;
        }

        logger.info("User {} logged in successfully.", username);

    }

}