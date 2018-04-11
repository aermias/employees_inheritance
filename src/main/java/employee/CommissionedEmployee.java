package employee;

public class CommissionedEmployee extends Employee {
    protected double grossSales;
    protected double commissionRate;

    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, HireDate dateHired, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, dateHired);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

        this.earnings = this.grossSales * (this.commissionRate / 100);
    }

    @Override
    public String toString() {
        return super.toString(
                "grossSales=" + grossSales +
                        ",\n  commissionRate=" + commissionRate
        );
    }
}
