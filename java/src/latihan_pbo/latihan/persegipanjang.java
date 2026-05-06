package latihan_pbo.latihan;

public class persegipanjang extends bangundatar {

    public persegipanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }
}
