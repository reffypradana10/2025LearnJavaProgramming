package Bagian1;

public class Array {
    public static void main(String[] args) {


        String[] stringarray;
        stringarray = new String[3];

        stringarray[0] = "Refi";
        stringarray[1] = "Yusuf";
        stringarray[2] = "Pradana";

        System.out.println(stringarray[0]);
        System.out.println(stringarray[1]);
        System.out.println(stringarray[2]);

        String[] stringarray2 = new String[3];


        String[] namanama = {
                "Refi", "Yusuf","Pradana"
        };


        int[] arrayInt = new int[]{
                1,2,3,4,5,6
        };

        long[] arrayLong = new long[]{
                10L,20L,30L
        };

        System.out.println(arrayLong.length);

        String[][] member ={
                {"refi", "yusuf"},
                {"Eko"}
        };

        System.out.println(member[1][0]);

    }
}
