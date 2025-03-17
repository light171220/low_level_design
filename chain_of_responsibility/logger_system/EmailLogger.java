package chain_of_responsibility.logger_system;

public class EmailLogger extends Logger {
    public EmailLogger(int level) {
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("Email sent: " + message);
    }
}
