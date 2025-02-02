package Bagian3;

public class ParentApp {

    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Refi";
        child.doIt();
        System.out.println("Child name is : "+ child.name);

        System.out.println("\n");

        Parent parent = child;
        parent.name = "Joko";
        parent.doIt();

        System.out.println("\n");

        Parent parent2 = new Parent();
        parent2.name = "anwar";
        parent2.doIt();
        System.out.println(parent.name);
    }

}
