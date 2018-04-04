package employee;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    protected double earnings;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        count++;

        System.out.printf("Constructed employee %s %s |  count=%d%n", firstName, lastName, count);
    }

    public double earnings() {
        return this.earnings;
    }

    public static int getCount() { return count; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
