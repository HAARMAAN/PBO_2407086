package latihan1_pbo.latihan3;
import latihan1_pbo.latihan3.coba.coba;

public class Main {
    public static void main(String[] args) {
        coba tes = new coba();



        tes.setPanjang(5);
        System.out.println("Panjangnya adalah : "+ tes.getPanjang());
        tes.setLebar(2);
        tes.cetakluas();
        System.out.println("Luasnya adalah : "+ tes.hitungluas());
    }
}
