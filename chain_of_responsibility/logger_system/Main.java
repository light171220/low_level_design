package chain_of_responsibility.logger_system;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = LogManager.getLoggerChain();
        
        // Log messages at different levels
        System.out.println("--- Logging INFO Message ---");
        loggerChain.logMessage(Logger.INFO, "This is an information message.");
        
        System.out.println("\n--- Logging DEBUG Message ---");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");
        
        System.out.println("\n--- Logging ERROR Message ---");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
        
        // Test with more specific scenarios
        System.out.println("\n--- Testing Application Scenarios ---");
        loggerChain.logMessage(Logger.INFO, "User login successful: user123");
        loggerChain.logMessage(Logger.DEBUG, "Processing payment transaction #12345");
        loggerChain.logMessage(Logger.ERROR, "Database connection failed: timeout after 30s");
    }
}
