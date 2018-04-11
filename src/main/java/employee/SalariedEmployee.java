package employee;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, HireDate dateHired, double salary) {
        super(firstName, lastName, socialSecurityNumber, dateHired);
        this.salary = salary;

        this.earnings = this.salary;
    }

    @Override
    public String toString() {
        return super.toString("salary=" + salary);
    }
}
