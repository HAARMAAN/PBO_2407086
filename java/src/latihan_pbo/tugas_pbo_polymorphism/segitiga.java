package latihan_pbo.tugas_pbo_polymorphism;

public class segitiga extends bangundatar {
    // a. Constructor sesuai kebutuhan (2 parameter)
    public segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    // b. Override method hitungLuas (Alas * Tinggi / 2)
    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    // b. Override method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("============================");
        // d. Sesuaikan nama variabel untuk output
        System.out.println("Alas   : " + getVarA());
        System.out.println("Tinggi : " + getVarB());
        System.out.println("Luas   : " + hitungLuas());
        System.out.println("============================");
    }
}