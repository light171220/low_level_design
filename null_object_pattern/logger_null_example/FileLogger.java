package null_object_pattern.logger_null_example;

public class FileLogger implements Logger {
    private String fileName;
    
    public FileLogger(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void log(String message) {
        System.out.println("Writing to file " + fileName + ": " + message);
        // Actual file writing code would go here
    }
}
