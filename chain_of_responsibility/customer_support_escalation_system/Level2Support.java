package chain_of_responsibility.customer_support_escalation_system;

public class Level2Support extends SupportHandler {
    public Level2Support() {
        this.level = 2;
    }
    
    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Level 2 Support resolved ticket #" + ticket.getId() + ": " + ticket.getDescription());
        ticket.setResolved(true);
    }
}
