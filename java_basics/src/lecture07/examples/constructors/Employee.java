package lecture07.examples.constructors;

public class Employee {
     public String firstName;
     public String lastName;
     public int birthYear;

    public Employee(String fName, String lName, int bYear) {
        firstName = fName;
        lastName = lName;
        birthYear = bYear;
    }

    public Employee(String firstName, int birthYear) {
       this(firstName, "Default", birthYear);
    }

    public Employee(String fName, String lName) {
        this(fName, lName, 2000);
    }
}
