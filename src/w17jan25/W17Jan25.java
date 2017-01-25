/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jwright
 */
public class W17Jan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee employee1 = new Employee("Fred","Flintstone",1234,
                                          LocalDate.of(1998, Month.MARCH, 14));
       
       System.out.printf("Employee1 is %s%n", employee1);
       System.out.printf("The employee was born on %s, that was a %s%n",
                                            employee1.getDateOfBirth(), 
                                            employee1.getDateOfBirth().getDayOfWeek());
       
       Employee employee2 = new Employee("Jaret","Wright",2344,
                                            LocalDate.of(1954, Month.APRIL, 2));
       System.out.printf("Employee2 is %s%n", employee2);
       System.out.printf("The employee was born on %s, that was a %s%n",
                                            employee2.getDateOfBirth(), 
                                            employee2.getDateOfBirth().getDayOfWeek());
       
    }
    
}
