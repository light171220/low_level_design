package null_object_pattern.logger_null_example;


public class Main {
    public static void main(String[] args) {
        // Using real logger
        Logger consoleLogger = new ConsoleLogger();
        UserService service1 = new UserService(consoleLogger);
        service1.createUser("john_doe");
        
        // Using null object logger
        UserService service2 = new UserService(null);
        service2.createUser("jane_doe");
        
        // Using file logger
        Logger fileLogger = new FileLogger("users.log");
        UserService service3 = new UserService(fileLogger);
        service3.createUser("bob_smith");
    }
}
