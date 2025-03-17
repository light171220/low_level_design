package chain_of_responsibility.logger_system;

public class DatabaseLogger extends Logger {
    public DatabaseLogger(int level) {
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("Database Logger: " + message);
    }
}
