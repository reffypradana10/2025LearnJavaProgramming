package Bagian3;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee  = new Employee("refi");
        employee.sayHello("indro");

        employee = new Manager("refi");
        employee.sayHello("indro");

        employee = new VicePresident("refi");
        employee.sayHello("indro");

        sayHello(new Employee("refi"));
        sayHello(new Manager("yusuf"));
        sayHello(new VicePresident("pradana"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
