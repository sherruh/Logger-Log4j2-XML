import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        new User();
        logger.info("Сообщение!");
        logger.fatal("Фатальная ошибка!");
        logger.error("Ошибка!");
        logger.warn("Предупреждение!");
    }
}
