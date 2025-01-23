package Bagian1;

public class IfStatement {
    public static void main(String[] args) {


        var nilai = 80;
        var absen = 80;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusAbsen && lulusNilai;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Selamat coba lagi tahun depan");
        }

        if(nilai >= 90 && absen >= 90){
            System.out.println("Nilai anda A");
        } else if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai anda B");
        }else if(nilai >= 70 && absen >= 70){
            System.out.println("Nilai anda C");
        }else{
            System.out.println("Belajar goblokk");
        }
    }
}
