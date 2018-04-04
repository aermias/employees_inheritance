package employee;

public class BasePlusCommissionEmployee extends CommissionedEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;

        this.earnings = this.baseSalary + this.grossSales * (this.commissionRate / 100);
    }

    @Override
    public String toString() {
        return super.toString() +
                "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
