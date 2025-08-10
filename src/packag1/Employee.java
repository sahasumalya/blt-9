package packag1;

public class Employee {
    public String name;
    private int salary;
    private double bonus;
    String address;
    protected String contactNo;

    public static int employeeCount;

    public static int add(int a, int b) {
        return a + b;
    }

    private Employee(String name, int salary, double bonus, String address) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.address = address;
        employeeCount++;
    }

    public Employee() {
    }

    public static Employee createEmployee(String name, String salary, double bonus, String address) {
        return new Employee(name, Integer.parseInt(salary), bonus, address);
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }
}
