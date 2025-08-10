import packag1.*;
import packag2.ChildEmployee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");

        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
       // arr.remove(new Integer(2));*/
        //arr.indexOf()
       /* LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        l.add(1,5);
        l.addFirst(10);

        System.out.println(l.get(3));

        Iterator<Integer> iter = l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }*/

        /*Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);*/

        /*Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }*/

        /*Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }*/

        /*Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        while (!deque.isEmpty()) {
            System.out.println(deque.removeLast());
        }*/

        /*PriorityQueue<Integer> pq = new PriorityQueue<>(new MaxHeapComparator());
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(2);
        pq.add(0);
        pq.add(1); // ---->
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }*/

        /*Set<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(20);
        st.add(13);
        st.add(4);
        st.add(20);

        System.out.println(st.contains(130));*/

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(3);

        System.out.println(treeSet.higher(7));


        Iterator<Integer> it2 = treeSet.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }





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

        /*Adder adder2 = (a,b)->{
            return 4.5;
        };*/

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