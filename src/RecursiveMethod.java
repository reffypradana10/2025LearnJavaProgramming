public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialrecursive(5));
        loop(1000000); // error StackOverFlow
    }

    static int factorialLoop(int value){
        var result = 1;
        for(var counter = 1; counter <= value;counter++){
            result *= counter;
        }
        return result;
    }

    static int factorialrecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialrecursive(value-1);
        }
    }

    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        }else{
            System.out.println("Loop "+value);
            loop(value-1);
        }
    }
}
