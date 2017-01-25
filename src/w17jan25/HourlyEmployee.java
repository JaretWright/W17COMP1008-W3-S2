
package w17jan25;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class HourlyEmployee extends Employee{
    private  final double MINIMUMWAGE = 11.40;
    
    private double hourlyRate, hoursWorked;
    
    public HourlyEmployee(String first, String last, int sin, LocalDate dob, double payRate) {
        super(first, last, sin, dob);
        
        hoursWorked = 0;
        
        setPayRate(payRate);
    }
    
    /**
     * This method will validate that the pay rate is above minimum wage and set the
     * instance variable
     * @return 
     */
    public void setPayRate(double payRate)
    {
        if (payRate >= MINIMUMWAGE)
            this.hourlyRate = payRate;
        else
            throw new IllegalArgumentException("Hey cheapo - minimum wage is " + MINIMUMWAGE);
    }

    /**
     * This method will add hours worked to the employee's history
     * @return 
     */
    public void addHoursWorked(double hoursWorked)
    {
        if (hoursWorked > 0)
            this.hoursWorked += hoursWorked;
        else
            throw new IllegalArgumentException("new hours worked must be greater than 0");
    }
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * hourlyRate;
        PayCheque newPayCheque = new PayCheque(super.toString(), payAmount, "Your pay cheque");
        
        hoursWorked = 0;
        
        return newPayCheque;
    }
    
}
