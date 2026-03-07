package latihan1_pbo.tugas_1.coba;

public class persegipanjang extends bangundatar{
    public double kelilingpersegipanjang() {
        return 2 * getPanjang() + getLebar();
    }
    public double luaspersegipanjang() {
        return 2 * getPanjang() * getLebar();
    }
}
