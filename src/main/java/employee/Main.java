package employee;

public class Main {
    public static void main(String[] args) {
        HireDate date1 = new HireDate(21, "Jan", 2013);
        HireDate date2 = new HireDate(22, "Jan", 2013);
        HireDate date3 = new HireDate(23, "Jan", 2013);
        HireDate date4 = new HireDate(24, "Jan", 2013);

        HourlyEmployee hourBoy = new HourlyEmployee("hr", "boy", "123", date1, 10, 40);
        SalariedEmployee salaryGirl = new SalariedEmployee("sal", "girl", "345", date2, 500);
        CommissionedEmployee commishGuy = new CommissionedEmployee("commish", "guy", "567", date3, 2400, 25);
        BasePlusCommissionEmployee commishGal = new BasePlusCommissionEmployee("commish", "gal", "789", date4, 3000, 20, 100);

        Employee[] employees = new Employee[]{hourBoy, salaryGirl, commishGuy, commishGal};
        for (Employee e : employees) System.out.println(e.getDateHired());
    }
}
