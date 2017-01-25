package w17jan25;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jwright
 */
public class Employee {
    private String firstName, lastName;
    private int socialInsuranceNum;
    private LocalDate dateOfBirth;
    
    public Employee(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialInsuranceNum = sin;
        setBirthday(dob);
    }
    
    /**
     * This method will return the employee's first and last name
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    
    /**
     * This method will validate that the employee is 15-90 years old and set
     * the dateOfBirth instance variables
     */
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(dob, today).getYears();
        
        
    }
}
