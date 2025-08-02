package packag2;

import packag1.Employee;

public class ChildEmployee  extends Employee {

    private static class xyz {
        public static int multiply(int x, int y){
            return x*y;
        }
    }
    private ChildEmployee() {
        super();
        super.contactNo = "123";
    }

    public  ChildEmployee getChildEmployee(String name, String salary, double bonus, String address) {
        ChildEmployee childEmployee = new ChildEmployee();
        childEmployee.contactNo = "sdvervfes";
        childEmployee.setBonus(ChildEmployee.xyz.multiply(2,3));
        return childEmployee;
    }
}
