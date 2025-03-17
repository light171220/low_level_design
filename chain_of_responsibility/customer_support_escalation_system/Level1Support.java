package chain_of_responsibility.customer_support_escalation_system;

public class Level1Support extends SupportHandler {
    public Level1Support() {
        this.level = 1;
    }
    
    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Level 1 Support resolved ticket #" + ticket.getId() + ": " + ticket.getDescription());
        ticket.setResolved(true);
    }
}
