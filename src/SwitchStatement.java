public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Nilai anda bagus");
                break;
            case "B":
                System.out.println("Nilai anda baik");
                break;
            case "C":
                System.out.println("Nilai anda cukup");
                break;
            default:
                System.out.println("Anda ikut remidi");
                break;
        }

        switch (nilai){
            case "A" -> System.out.println("Nilai anda bagus");
            case "B" -> System.out.println("Nilai anda baik");
            case "C" -> System.out.println("Nilai anda cukup");
            default -> {
                System.out.println("anda ikut remidi");
            }
        }

        String ucapan = switch (nilai){
            case "A" : yield "Nilai anda bagus";
            case "B" : yield "Nilai anda baik";
            case "C" : yield "Nilai anda cukup";
            default : yield "Anda ikut remidi";
        };
        System.out.println(ucapan);
    }

}
