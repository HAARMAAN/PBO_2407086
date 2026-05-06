package latihan_pbo.latihan;

public class persegi extends bangundatar {

    public persegi(double sisi) {
        super(sisi, sisi); 
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }
}
