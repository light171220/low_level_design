package chain_of_responsibility.customer_support_escalation_system;

abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected int level;
    
    // Set the next handler in the chain
    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }
    
    // Handle the support ticket based on complexity
    public void handleTicket(SupportTicket ticket) {
        // If this handler can resolve the ticket
        if (ticket.getComplexityLevel() <= this.level) {
            resolve(ticket);
        } 
        // If there's another handler in the chain, pass the ticket along
        else if (nextHandler != null) {
            System.out.println("Ticket #" + ticket.getId() + " escalated to " + nextHandler.getClass().getSimpleName());
            nextHandler.handleTicket(ticket);
        } 
        // If this is the end of the chain and ticket still not resolved
        else {
            System.out.println("Ticket #" + ticket.getId() + " requires special attention! Escalating to management.");
        }
    }
    
    // Implementation will be provided by concrete handlers
    protected abstract void resolve(SupportTicket ticket);
}
