package latihan_pbo.tugas_pbo_inheritance;

public class bangun_ruang extends bangun_datar {
    private double tinggi; 

    public bangun_ruang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}