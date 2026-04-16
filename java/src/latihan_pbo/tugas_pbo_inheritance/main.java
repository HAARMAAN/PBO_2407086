package latihan_pbo.tugas_pbo_inheritance;

public class main {
    public static void main(String[] args) {
        double p = 10, l = 5, t = 4;

        bangun_datar persegi = new bangun_datar(p, l);
        
        bangun_ruang balok = new bangun_ruang(p, l, t);

        System.out.println("--- HASIL DARI PENGUJIAN ---");
        System.out.println("Panjang: " + p);
        System.out.println("Lebar: " + l);
        System.out.println("Tinggi: " + t);

        System.out.println("--- HASIL DARI CLASS PARENT ---");
        System.out.println("Luas Parent: " + persegi.hitungLuas()); 

        System.out.println("\n--- HASIL DARI CLASS CHILD ---");
        System.out.println("Luas Child: " + balok.hitungLuas());
        System.out.println("Volume Child: " + balok.hitungVolume());
    }
}
