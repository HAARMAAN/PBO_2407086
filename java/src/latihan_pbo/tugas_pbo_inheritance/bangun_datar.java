package latihan_pbo.tugas_pbo_inheritance;

public class bangun_datar {
    private double panjang;
    private double lebar;

    public bangun_datar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}