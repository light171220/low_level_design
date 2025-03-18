package null_object_pattern.logger_null_example;

public class NullLogger implements Logger {
    @Override
    public void log(String message) {
        // Do nothing - this is the key to the pattern
    }
}
