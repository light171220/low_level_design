package chain_of_responsibility.logger_system;

abstract class Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    
    protected int level;
    // Next element in chain of responsibility
    protected Logger nextLogger;
    
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        
        // Pass to next logger in the chain if it exists
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    
    // Method to be implemented by concrete loggers
    protected abstract void write(String message);
}