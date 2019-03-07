package 日志;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.*;

public class Test {
    public static void main(String[] args) {


        Logger logger = Logger.getGlobal();
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
//                if (record.getMessage().length()<6)
//                return false;
//                else
//                    return true;
                return record.getMessage().length() < 6 ? false : true;
            }
        };
        logger.setFilter(filter);

        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return LocalDateTime.now().toString() + ":" + record.getMessage() + "\n";
            }
        };
        handler.setFormatter(formatter);

        Logger.getGlobal().severe("severe");
        Logger.getGlobal().warning("warning");
        Logger.getGlobal().info("info");
        Logger.getGlobal().config("config");
        Logger.getGlobal().fine("fine");
        Logger.getGlobal().finer("finer");
        Logger.getGlobal().finest("finest");


        System.out.print(Logger.getGlobal() ==logger);
    }
}
