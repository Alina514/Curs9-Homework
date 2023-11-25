package persons;

import java.util.List;

public class Company extends Person {
    private Person manager;
    private List<Person> employees;
    private String profession;

    public Company(Person manager, List<Person> employees) {
        this.manager = manager;
        this.employees = employees;
    }

    public Person getManager() {
        return manager;
    }

    public List<Person> getEmployees() {
        return employees;
    }
    public List<Person> getPersonProfession(){
        return getPersonProfession();
    }
}