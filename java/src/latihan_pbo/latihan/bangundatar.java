package latihan_pbo.latihan;

public abstract class bangundatar {
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

    public abstract double hitungLuas();

    public void Display() {
        System.out.println("ini adalah : " + varA);
        System.out.println("ini adalah: " + varB);
    }
}