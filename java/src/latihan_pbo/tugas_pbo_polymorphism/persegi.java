package latihan_pbo.tugas_pbo_polymorphism;

public class persegi extends bangundatar {
    public persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("============================");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("============================");
    }
}