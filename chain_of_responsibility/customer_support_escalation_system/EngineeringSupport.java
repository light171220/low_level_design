package chain_of_responsibility.customer_support_escalation_system;

public class EngineeringSupport extends SupportHandler {
    public EngineeringSupport() {
        this.level = 4;
    }
    
    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Engineering team resolved complex ticket #" + ticket.getId() + ": " + ticket.getDescription());
        ticket.setResolved(true);
    }
}
