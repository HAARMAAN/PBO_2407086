package latihan1_pbo.latihan4.coba;

public class persegipanjang extends bangundatar{
    public double kelilingpersegipanjang() {
        return 2 * getPanjang() + getLebar();
    }
    public double luaspersegipanjang() {
        return 2 * getPanjang() * getLebar();
    }
}
