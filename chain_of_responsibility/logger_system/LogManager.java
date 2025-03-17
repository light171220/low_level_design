package chain_of_responsibility.logger_system;

public class LogManager {
    public static Logger getLoggerChain() {
        // Initialize all logger objects with their respective levels
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger databaseLogger = new DatabaseLogger(Logger.ERROR);
        Logger emailLogger = new EmailLogger(Logger.ERROR);
        
        // Build the chain
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(databaseLogger);
        databaseLogger.setNextLogger(emailLogger);
        
        // Return the starting point of the chain
        return consoleLogger;
    }
}
