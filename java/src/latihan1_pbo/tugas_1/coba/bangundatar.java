package latihan1_pbo.tugas_1.coba;

public class bangundatar {
    private double panjang;
    private double lebar;
    private double sisi;
    private double alas;
    private double tinggi;
    
    //method
    // setter
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }


    public void setAlas(double alas) {
        this.alas = alas;
    }


    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setlebar(double lebar) {
        this.lebar = lebar;
    }


    //getter
    public double getPanjang(){
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getSisi() {
        return sisi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }
}