package Bagian3;

class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }


}


class Child extends Parent{
    String name;
     void doIt(){
        System.out.println("Do it in Child");
         System.out.println("Parent name is "+super.name);
    }
}
