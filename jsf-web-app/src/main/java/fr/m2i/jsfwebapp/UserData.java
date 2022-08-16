package fr.m2i.jsfwebapp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "userData", eager = true)
public class UserData {

    private static final List<Employee> employees = new ArrayList(){
        { 
            add(new Employee("anthony","IT",28,3000.00));
            add(new Employee("bob","RH",25,1234.00));
            add(new Employee("pedro","dev",95,5630.00));
        }
    };
    private String name;
    private String departement;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    
    public String addEmployee(){
        Employee employee = new Employee(name, departement, age, salary);
        employees.add(employee);
        name = null;
        departement = null;
        age = 0;
        salary = 0d;
        return null;
    }
    
    


}
