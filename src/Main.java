import packag1.*;
import packag2.ChildEmployee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        // Encapsulation
        Employee employee1 = Employee.createEmployee("sds","123",67.9, "srfgvesr");
        Employee employee2 = Employee.createEmployee("sdfs","123",67.9, "srfgvesr");
        Employee employee3 = Employee.createEmployee("sdrrs","123",67.9, "srfgvesr");

        //ChildEmployee childEmployee = new ChildEmployee();
        //childEmployee.contactNo
        //System.out.println(ChildEmployee.xyz.multiply(2,3));
        // Shape --> Square
        // A --> B --> C ---> D
        Shape shape = new Square(45.00F, 6.0);
        System.out.println(shape.calculateArea());
        System.out.println(shape.getPrice());
        //shape.sideLength = 123;*/
        //CalculatorImplementation calculator = new CalculatorImplementation();
       // if( calculator instanceof CalculatorImplementation){}
       // CalculatorImplementation calculatorImplementation = (CalculatorImplementation) calculator;
       // System.out.println(calculator.add(1,2));

    }


}