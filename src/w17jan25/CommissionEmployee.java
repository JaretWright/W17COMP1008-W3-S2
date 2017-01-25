
package w17jan25;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class CommissionEmployee extends Employee {

    private double monthlySales, commissionRate;
    
    public CommissionEmployee(String first, String last, int sin, LocalDate dob,
                                double comRate) {
        super(first, last, sin, dob);
        
        monthlySales = 0;
        
        setComRate(comRate);
    }
    
    
    /**
     * This method sets the commission rate
     */
    public void setComRate(double comRate)
    {
        if (comRate > 0 && comRate < 60)
            commissionRate = comRate;
        else
            throw new IllegalArgumentException("Commissions must be greater than 0 "
                                                + "& less than or equal to 60");
    }

    /**
     * This method will record sales
     * @return 
     */
    public void addSales(double newSalesAmount)
    {
        if (newSalesAmount > 0)
            this.monthlySales += newSalesAmount;
        else
            throw new IllegalArgumentException("Sales must be > 0");
    }
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = commissionRate/100 * monthlySales;
        
        PayCheque newPay = new PayCheque(super.toString(), payAmount, "Commission pay");
        monthlySales = 0; // zero out sales for the next month
        return newPay;
    }
    
}
