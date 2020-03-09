package ie.gmit;
/*
    Shane Higgins
    Software and test in class test
    09/03/2020
    G00339730@gmit.ie
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

   @Test
   public void nameCheck(){
       Employee employee = new Employee("Shane");
       assertEquals("Shane",employee.getName());
   }

   @Test
   public void EmployeeNumCheck(){
        Employee employee = new Employee(22541);
        assertEquals(22541,employee.getEmployeeNum());
   }

   @Test
   public void NameSizeTOBig(){
       assertThrows(IllegalArgumentException.class, () -> new Employee("shaneq"));

   }



   @Test
   public void EmployeeNumToBig(){
       assertThrows(IllegalArgumentException.class, () ->new Employee("Invalid Size of Employee number"));
   }
}
