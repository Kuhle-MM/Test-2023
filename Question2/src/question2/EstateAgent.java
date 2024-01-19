package question2;
// estate agent class which implements the iestateAgent interface
public abstract class EstateAgent implements iEstateAgent {

    private String agentName;
    private double propertyPrice;

    // a constructor accepting the estate agent's name and property price as parameters. 
    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;

    }

    //get to get the estate agent name, property price and estate agent commission.
    @Override
    public String getAgentName() {
        return agentName;
    }

    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    @Override
    public double getAgentCommission() {
        double agentCommission = propertyPrice * 0.2;
        return agentCommission;
    }

}
