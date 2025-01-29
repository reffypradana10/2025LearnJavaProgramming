package Bagian3;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Refi", "Blitar");

        System.out.println(person1.country);

        person1.sayHello("Budi");


        Person person2 = new Person("Budi","Blitar");
        Person person3;

        person2.sayHello("Sisca");


    }
}
