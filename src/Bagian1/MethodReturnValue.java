package Bagian1;

public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sum(100,200));

        System.out.println(hitung(10,19,"/"));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return  total;
    }

    static int hitung(int value1, int value2, String operasi){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
