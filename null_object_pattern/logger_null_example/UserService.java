package null_object_pattern.logger_null_example;

public class UserService {
    private Logger logger;
    
    // Constructor accepts any Logger implementation
    public UserService(Logger logger) {
        // If null is passed, use NullLogger instead
        this.logger = (logger != null) ? logger : new NullLogger();
    }
    
    public void createUser(String username) {
        // Business logic
        System.out.println("Creating user: " + username);
        
        // Log without worrying about null checks
        logger.log("User created: " + username);
    }
}
