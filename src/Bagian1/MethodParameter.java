package Bagian1;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("rephi","pradana");
        sayHello("alex","xandar");
    }

    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
