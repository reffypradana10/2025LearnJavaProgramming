public class Scope {
    public static void main(String[] args) {
        SayHello("rephi");
    }

    static void SayHello(String name){
        String hello = "hello"+ name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
