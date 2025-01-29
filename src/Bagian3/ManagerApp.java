package Bagian3;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("refi");
        manager.sayHello("Budi");

        var vp = new VicePresident("Joko");
        vp.sayHello(manager.name);

        System.out.println(manager);
        System.out.println(manager.toString());
    }
}
