package Bagian3;

class VicePresident extends Manager {

    VicePresident(String name){
        super(name, null);
    }

    // method overriding
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is Vice President " + this.name);
    }
}
