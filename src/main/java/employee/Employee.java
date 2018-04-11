package employee;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private HireDate dateHired;

    protected double earnings;

    public Employee(String firstName, String lastName, String socialSecurityNumber, HireDate dateHired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateHired = dateHired;
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

    public HireDate getDateHired() { return dateHired; }

    // @Override
    public String toString(String extraKeys) {
        if (extraKeys.length() > 0) extraKeys = ",\n  " + extraKeys;
        return this.getClass().getSimpleName() + '{' +
                "\n  firstName='" + firstName + '\'' +
                ",\n  lastName='" + lastName + '\'' +
                ",\n  socialSecurityNumber='" + socialSecurityNumber + '\'' +
                extraKeys + '\n' +
                '}';
    }
}
