package Assignment8;

/**
 * @author Weichen Wang
 * @date 2018/11/14 - 11:34 AM
 */
public class SalesPerson extends SalesEmployee {
    // Default Constructor
    public SalesPerson() {
        super();
    }

    // Override Constructor
    public SalesPerson(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }

    // Implement calculateCommission() method from superclass SalesEmployee
    @Override
    public void calculateCommission() {
        // sale of each bicycle is to be paid to sales person at a rate of 15%
        // 销售每辆自行车的费用应以15％的比例支付给销售人员
        super.commission = super.sales * 0.15;
    }
}
