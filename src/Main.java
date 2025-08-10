import packag1.*;
import packag2.ChildEmployee;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Encapsulation
        //Employee employee1 = Employee.createEmployee("sds","123",67.9, "srfgvesr");
       // Employee employee2 = Employee.createEmployee("sdfs","123",67.9, "srfgvesr");
       // Employee employee3 = Employee.createEmployee("sdrrs","123",67.9, "srfgvesr");

        //ChildEmployee childEmployee = new ChildEmployee();
        //childEmployee.contactNo
        //System.out.println(ChildEmployee.xyz.multiply(2,3));
        // Shape --> Square
        // A --> B --> C ---> D
        //Shape shape = new Square(45.00F, 6.0);
        //System.out.println(shape.calculateArea());
        //System.out.println(shape.getPrice());
        //shape.sideLength = 123;*/
        //CalculatorImplementation calculator = new CalculatorImplementation();
       // if( calculator instanceof CalculatorImplementation){}
       // CalculatorImplementation calculatorImplementation = (CalculatorImplementation) calculator;
       // System.out.println(calculator.add(1,2));

        /*Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1==singleton2);*/



       /* try {
            throw new FileNotFoundException("test exception");
        } catch (NumberFormatException e) {
           System.out.println(e);

        } catch (RuntimeException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }*/
        /*try {
            throwCheckedExceptionWrapper();
        } catch (Exception err) {
            throw err;
        }*/

        CalculatorInterface calculatorInterface = new CalculatorInterface() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int subtract(int a, int b) {
                return a-b;
            }

            @Override
            public int multiply(int a, int b) {
                return a*b;
            }

            @Override
            public int divide(int a, int b) {
                return a/b;
            }
        };

        Adder adder = new Adder() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };

        Adder adder2 = (a,b)->{
            return 4.5;
        };

        Adder adder3 = Employee::add;

        System.out.println("exception digested");

    }
    public static void throwCheckedExceptionWrapper() throws CustomException {
        try {
            throwCheckedException();
        } catch (CustomException e) {
            throw e;
        }
    }

    public static void throwCheckedException() throws CustomException {
        try {
            throw new CustomException("sdcvs","400");
        } catch (CustomException e) {
            throw e;
        }
    }


}