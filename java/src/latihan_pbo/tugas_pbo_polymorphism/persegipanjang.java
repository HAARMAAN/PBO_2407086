package latihan_pbo.tugas_pbo_polymorphism;

public class persegipanjang extends bangundatar {
    // a. Constructor sesuai kebutuhan (2 parameter)
    public persegipanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    // b. Override method hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    // b. Override method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("============================");
        // d. Sesuaikan nama variabel untuk output
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar  : " + getVarB());
        System.out.println("Luas   : " + hitungLuas());
        System.out.println("============================");
    }
}