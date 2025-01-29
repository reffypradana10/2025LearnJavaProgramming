package Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test {

    public static String[] data = new String[20];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testInput();
    }

    /**
     * tampilTodo
     */
    public static void tampilTodo(){
        System.out.println("TODOLIST");
        for (var i = 0; i < data.length; i++ ){
            var todo = data[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no+". "+todo);
            }

        }
    }

    /**
     * Unit Test tampilTodo
     */
    public static void testTampilTodo(){
        data[0] = "refi";
        data[3] = "yusuf";
        data[2] = "pradana";

        tampilTodo();
    }

    /**
     * tambahtodo
     * @param todo ref ke tampiltodo
     */
    public static void tambahTodo(String todo){
        // cek data, apakah ada yang kosong. Jika ada keluarkan dari program
        var isFull = true;
        for (var i = 0;i<data.length;i++){
            if(data[i] == null){
                isFull = false;
                break;
            }
        }

        // Jika datanya penuh, tampung data kedalam variabel temp. Ubah ukuran data menjadi 2x lipat ukuran aslinya.
        // Dan masukkan kembali data dari temp ke data.
        if (isFull){
            var temp = data;
            data = new String[data.length * 2];
            for (var i = 0; i<temp.length;i++){
                data[i] = temp[i];
            }
        }

        for (var i = 0; i< data.length;i++){
            if(data[i] == null){
                data[i] = todo;
                break;
            }
        }

    }

    /**
     * Unit Test tambahtodo
     */
    public static void testTambahTodo(){
        tambahTodo("Refi");
        tambahTodo("Yusuf");
        tambahTodo("Pradana");
        tampilTodo();
    }

    /**
     * Menghapus Todolist
     */

    public static boolean hapusTodoList(Integer nomor){
        if((nomor - 1) >= data.length){
            return false;
        } else if (data[nomor - 1] == null) {
            return false;
        }else {
            for(var i = (nomor-1); i< data.length;i++){
                if(i == data.length -1){
                    data[i] = null;
                }else{
                    data[i] = data[i + 1];
                }
            }

            return true;
        }
    }

    /**
     * Unit Test
     */
    public static void testHapusTodoLiist(){
        tambahTodo("Refi");
        tambahTodo("Yusuf");
        tambahTodo("Pradana");

        var res = hapusTodoList(9);
        System.out.println(res);
        hapusTodoList(5);
        tampilTodo();
    }

    /**
     * Input
     */
    public static String input(String info){
        System.out.print(info+" : ");
        String data = scanner.nextLine();
        return data;
    }
    /**
     * Test Input
     */
    public static void testInput(){
        var nama = input("Nama");
        System.out.println("Hi "+nama);
    }

}

