package question2;

public class EstateAgentSales extends EstateAgent {

    //GETS CONTRUCTOR FROM THE SUPER(ABSTRACT) CLASS
    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    //PRINT PROPERTY REPORT METHOD
    public void printPropertyReport() {
        System.out.println("""
                           
                           ESTATE AGENT REPORT
                           *******************""");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());

    }
}
