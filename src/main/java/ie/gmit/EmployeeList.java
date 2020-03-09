package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    public ArrayList<String> list;

    public EmployeeList(){
        list = new ArrayList<>();


    }

    public void addEmployee(String newEmployee){
        list.add(newEmployee);
    }

    public int getSize(){
        list.size();
        return list.size();
    }
}
