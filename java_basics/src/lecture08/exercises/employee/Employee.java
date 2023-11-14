package lecture08.exercises.employee;

//Create class Employee with the following attributes – id, first name, last name , salary per month.
//        Id, first name , last name – must be set only once, salary – can be updated any time
//        Add the following methods – getName() / getAnnualSalary() / raiseSalary()
//        getName – combines firstname and last name
//        getAnnualSalary – return what is the annual salary for the employee
//        raiseSalary – modify current salary by X% and return the update salary
//        toString – should print all the information about the employee
public class Employee {
    private final int id;
    private double salaryPerMonth;
    private final String firstName;
    private final String lastName;

    public Employee(int id, double salaryPerMonth, String firstName, String lastName) {
        this.id = id;
        this.salaryPerMonth = salaryPerMonth;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public double raiseSalary(int percent) {
        double salaryRaiseAmount = ( this.salaryPerMonth * percent ) / 100;
        this.salaryPerMonth += salaryRaiseAmount;
        return this.salaryPerMonth;
    }

    public double getAnnualSalary() {
        return this.salaryPerMonth * 12;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee name: ").append(this.getName());
        sb.append("\n");
        sb.append("Employee annual salary ").append(this.getAnnualSalary());
        sb.append("\n");
        sb.append("Employee current salary ").append(this.salaryPerMonth);
        return sb.toString();
    }
}
