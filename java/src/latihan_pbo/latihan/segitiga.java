package latihan_pbo.latihan;

public class segitiga extends bangundatar {

    public segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return (getVarA() * getVarB()) / 2;
    }
}
