package latihan_pbo.tugas_pbo_polymorphism;

public class bangundatar {
    private double varA;
    private double varB;

    public bangundatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public bangundatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    public double getVarA() { return varA; }
    public double getVarB() { return varB; }

    public double hitungLuas() { return 0; }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("============================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("============================");
    }
}