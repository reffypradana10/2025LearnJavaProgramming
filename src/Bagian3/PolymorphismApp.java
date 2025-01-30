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

        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + employee.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + employee.name);
        }else{
            System.out.println("Hello " + employee.name);
        }

    }
}
