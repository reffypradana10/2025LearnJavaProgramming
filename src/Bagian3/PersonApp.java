package Bagian3;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Refi", "Blitar");

        System.out.println(person1.country);

        person1.sayHello("Budi");


        Person person2 = new Person("Budi","Blitar");
        Person person3 = new Person();
        person3.name = "Bulan";
        person3.sayHello(person1.name);

        person2.sayHello("Sisca");


    }
}
