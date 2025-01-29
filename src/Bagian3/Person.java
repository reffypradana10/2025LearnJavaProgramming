package Bagian3;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    // constructor overloading 1
    Person (String paramName){
        this(paramName, null);
    }

    // constructor overloading 1
    Person (){
        this(null);
    }


    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

