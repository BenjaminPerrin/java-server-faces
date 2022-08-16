package fr.m2i.jsfwebapp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData {

    private List<Member> members = new ArrayList<Member>();
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String city;
    private String hobby;
    private String sexe;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

   

    public List<Member> getEmployees() {
        return members;
    }
    
    public String addMember(){
        Member member = new Member(name, lastName, dateOfBirth, city, hobby, sexe);
        members.add(member);
        name = null;
        lastName = null;
        dateOfBirth = null;
        city = null;
        hobby = null;
        sexe = null;
        return "Validator.xhtml";
    }
    public String cancel(){
        name = null;
        lastName = null;
        dateOfBirth = null;
        city = null;
        hobby = null;
        sexe = null;
        return null;
    }
    
    


}
