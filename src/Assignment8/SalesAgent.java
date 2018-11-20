package Assignment8;

/**
 * @author Weichen Wang
 * @date 2018/11/14 - 11:34 AM
 */
public class SalesAgent extends SalesEmployee {
    // Default Constructor
    public SalesAgent() {
        super();
    }

    // Override Constructor
    public SalesAgent(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }

    // Implement calculateCommission() method from superclass SalesEmployee
    @Override
    public void calculateCommission() {
        // to the sale agents at a rate of 10%
        super.commission = super.sales * 0.1;
    }
}
