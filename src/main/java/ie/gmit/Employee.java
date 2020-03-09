package ie.gmit;
/*
    Shane Higgins
    Software and test in class test
    09/03/2020
    G00339730@gmit.ie
 */
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Employee {
    private String name;
    private int EmployeeNum;

    public Employee(int EmployeeNum) {

        this.name = name;
        this.EmployeeNum = EmployeeNum;
    }

    public int getEmployeeNum() {
        EmployeeNum = 22541;
        return EmployeeNum;
    }

    public Employee(String invalid) {
    }

    public String getName() {

        name = "Shane";
        return name;
    }

    public void setName(String name) {

        if (name.length()>=5){
            assertThrows(IllegalArgumentException.class,() ->
                    new Employee("Invalid"));
        }else {
            this.name = name;
        }
    }

}

