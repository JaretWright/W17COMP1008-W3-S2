package w17jan25;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class PayCheque {
    private LocalDate dateIssued;
    private String employeeName;
    private double amount;
    private String memo;
    private int chequeNumber;
    private static int nextChequeNumber = 10001;

    public PayCheque(String employeeName, double amount, String memo) {
        this.dateIssued = LocalDate.now();
        this.employeeName = employeeName;
        this.amount = amount;
        this.memo = memo;
        this.chequeNumber = nextChequeNumber;
        
        nextChequeNumber++;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getAmount() {
        return amount;
    }

    public String getMemo() {
        return memo;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }
    
    /**
     * This will show who the cheque is made out to, the date, the cheque #
     * and the amount
     */
    public String toString()
    {
        return String.format("Cheque #%d, issued to %s, for the amount of $%.2f",getChequeNumber(),
                                           getEmployeeName(), getAmount() );
    }
    
    
    


    
}
