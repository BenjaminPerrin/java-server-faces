package fr.m2i.jsfwebapp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "userData", eager = true)
public class UserData {

    private final List<Employee> employees = new ArrayList(){
        { 
            add(new Employee("anthony","IT",28,3000.00));
            add(new Employee("bob","RH",25,1234.00));
            add(new Employee("pedro","dev",95,5630.00));
        }
    };

    public List<Employee> getEmployees() {
        return employees;
    }
    
    
    
    


}
