import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;
    LocalDateTime now = LocalDateTime.now();

    public void log(String msg) {
        System.out.println("[" + now + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

}
