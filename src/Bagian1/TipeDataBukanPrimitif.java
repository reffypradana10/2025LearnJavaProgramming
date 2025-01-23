package Bagian1;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int Iniint = 100;

        Integer Iinteger = Iniint;

        System.out.println(Iinteger);

        short inishort = Iinteger.shortValue();
        long inilong = Iinteger.longValue();
        float inifloat = Iinteger.floatValue();

        System.out.println(inishort);
        System.out.println(inilong);
        System.out.println(inifloat);
    }
}
