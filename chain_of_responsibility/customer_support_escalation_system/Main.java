package chain_of_responsibility.customer_support_escalation_system;

public class Main {
    public static void main(String[] args) {
        // Create the support center
        SupportCenter supportCenter = new SupportCenter();
        
        // Create tickets with different complexity levels
        SupportTicket passwordReset = new SupportTicket(1001, "Password reset request", 1);
        SupportTicket accountConfiguration = new SupportTicket(1002, "Help with account settings", 2);
        SupportTicket dataImportIssue = new SupportTicket(1003, "Data not importing correctly", 3);
        SupportTicket systemOutage = new SupportTicket(1004, "Application crashes during peak hours", 4);
        SupportTicket securityVulnerability = new SupportTicket(1005, "Potential security vulnerability", 5);
        
        // Process the tickets
        supportCenter.receiveTicket(passwordReset);
        supportCenter.receiveTicket(accountConfiguration);
        supportCenter.receiveTicket(dataImportIssue);
        supportCenter.receiveTicket(systemOutage);
        supportCenter.receiveTicket(securityVulnerability);
    }
}
