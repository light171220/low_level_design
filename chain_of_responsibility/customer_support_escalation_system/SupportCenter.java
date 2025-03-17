package chain_of_responsibility.customer_support_escalation_system;

public class SupportCenter {
    private SupportHandler supportChain;
    
    public SupportCenter() {
        // Initialize the chain
        this.supportChain = createSupportChain();
    }
    
    private SupportHandler createSupportChain() {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();
        SupportHandler engineering = new EngineeringSupport();
        
        // Set up the chain
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);
        level3.setNextHandler(engineering);
        
        return level1; // Return the start of the chain
    }
    
    public void receiveTicket(SupportTicket ticket) {
        System.out.println("\nNew support ticket received: #" + ticket.getId());
        supportChain.handleTicket(ticket);
    }
}