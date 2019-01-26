import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
    private static final Logger logger = LogManager.getLogger(User.class);
    public User() {
        logger.debug("Debug сообщение!");
        logger.error("Ошибка!");
        logger.trace("Трейс!");
        logger.info("Информация");
    }
}
