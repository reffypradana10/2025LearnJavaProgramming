package Bagian2;

public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length;i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no+". "+todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi kasus Java Dasar: membuat todolist";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for(int i = 0; i < model.length;i++){
            if(model[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, kita resize ukuran array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length *2];

            for (int i = 0; i < temp.length;i++){
                model[i] = temp[i];
            }
        }


        // tambahkan ke posisi yang data arraynya NULL
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addTodoList("Contoh Todo ke. "+i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer numer){
        if((numer - 1) >= model.length){
            return false;
        }else if (model[numer - 1] == null){
            return false;
        }else{
            for (int i = (numer-1); i < model.length;i++){
                if(i == model.length -1){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7   );
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        addTodoList("Dua");
        System.out.println(result);

        showTodoList();

    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while(true){
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");


            var input  = input("Pilih");
            if(input.equals("1")){
                viewAddTodoList();
            }else if(input.equals("2")){
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else{
                System.out.println("Pilihan Salah");
            }
        }
    }

    public static void testviewshowtodolist(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();

    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("Menambah TODOLIST");

        var todo = input("Todo (x jika Batal)");
        if (todo.equals("x")){
            //batal
        }else{
            addTodoList(todo);
        }
    }

    public static void testviewaddtodolist(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();
        showTodoList();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("Menghapus TODOLIST");

        var number = input("Nomor yang dihapus (x jika Batal)");

        if(number.equals("x")){
            //batal
        }else{
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : "+number);
            }
        }
    }

    public static void testremovetodolist(){
        addTodoList("Satu");
        addTodoList("Dua");

        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }
}
