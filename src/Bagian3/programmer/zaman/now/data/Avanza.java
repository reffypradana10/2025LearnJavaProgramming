package Bagian3.programmer.zaman.now.data;

public class Avanza implements Car, IsMaintenance{

    public void drive(){
        System.out.println("Avanza Drive");
    }

    public int getTire(){
        return 4;
    }

    public String getBrand(){
        return "Honda";
    }

    public boolean IsMaintenance() {
        return false;
    }


}
