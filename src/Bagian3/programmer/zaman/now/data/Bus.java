package Bagian3.programmer.zaman.now.data;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTire() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    public boolean isBig(){
        return true;
    }
}
