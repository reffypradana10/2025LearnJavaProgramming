package Bagian3;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.name = "Refi";
        person1.address = "Blitar";

        System.out.println(person1.country);

        person1.sayHello("Budi");


        Person person2 = new Person();
        person2.name = "Nugroho";
        Person person3;
        person3 = new Person();

        person2.sayHello("Sisca");


    }
}
