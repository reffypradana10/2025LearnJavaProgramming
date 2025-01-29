package Bagian3;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    Person (String paramName, String paramAdress){
        name = paramName;
        address = paramAdress;
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}

