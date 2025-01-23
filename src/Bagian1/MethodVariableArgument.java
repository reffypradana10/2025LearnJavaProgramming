package Bagian1;

public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {70,70,70,60,50,70,80};
        sayCongraats("Rephi",values);

        sayCongraats("Budi",80,70,100,100,100);
    }

    static void sayCongraats(String name, int... values){
        var total = 0;
        for(var value : values){
            total+=value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+name+", Anda Lulus");
        }else{
            System.out.println("Maaf "+name+", Anda Gagal");
        }
    }
}
