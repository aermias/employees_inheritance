package employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, HireDate dateHired, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber, dateHired);
        this.wage = wage;
        this.hours = hours;

        this.earnings = this.wage * this.hours;
    }

    @Override
    public String toString() {
        return super.toString(
                "wage=" + wage +
                         ",\n  hours=" + hours
        );
    }
}
