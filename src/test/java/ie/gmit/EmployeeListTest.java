package ie.gmit;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeListTest {

    private EmployeeList myList;

    @BeforeEach
    void setup(){
        Employee employee = new Employee("mike");
        myList = new EmployeeList();
    }

    @Test
    public void testAddEmployee(){
        myList.addEmployee("mike");
        assertEquals(1,myList.getSize());
    }
}
