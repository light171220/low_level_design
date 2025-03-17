package chain_of_responsibility.customer_support_escalation_system;

public class Level3Support extends SupportHandler {
    public Level3Support() {
        this.level = 3;
    }
    
    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Level 3 Technical Specialist resolved ticket #" + ticket.getId() + ": " + ticket.getDescription());
        ticket.setResolved(true);
    }
}
