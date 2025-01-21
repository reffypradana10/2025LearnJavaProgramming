public class Break {
    public static void main(String[] args) {
        var counter = 1;

        while (true){
            System.out.println("Perulangan "+counter);
            counter++;

            if(counter > 10){
                System.out.println("Perulangan berhenti");
                break;
            }
        }
    }
}
