package chain_of_responsibility.customer_support_escalation_system;

public class SupportTicket {
    private int id;
    private String description;
    private int complexityLevel;
    private boolean resolved;
    
    public SupportTicket(int id, String description, int complexityLevel) {
        this.id = id;
        this.description = description;
        this.complexityLevel = complexityLevel;
        this.resolved = false;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getComplexityLevel() {
        return complexityLevel;
    }
    
    public boolean isResolved() {
        return resolved;
    }
    
    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
