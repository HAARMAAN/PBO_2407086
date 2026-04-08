package latihan_pbo.tugas_pbo_inheritance;

public class main {
    public static void main(String[] args) {
        double p = 10;
        double l = 5;
        double t = 4;

        bangun_ruang balok = new bangun_ruang(p, l, t);

        System.out.println("Luas alas: " + balok.hitungLuas());
        System.out.println("Volume: " + balok.hitungVolume());
    }
}
