public class ForEach {
    public static void main(String[] args) {


        String[] names ={
                "Refi", "Yusuf","Pradana",
                "Doraemon","Nobita"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);

        }

        for(var name: names){
            System.out.println(name);
        }
    }
}
