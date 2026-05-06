package latihan_pbo.tugas3;

public class Makanan extends Menu {
    private String jenisMakanan; // contoh: Makanan Berat, Makanan Ringan
    
    // Overloading constructor
    public Makanan(String nama, double harga) {
        super(nama, harga);
        this.jenisMakanan = "Umum";
    }

    public Makanan(String nama, double harga, String jenisMakanan) {
        super(nama, harga);
        this.jenisMakanan = jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    @Override
    public void detailMenu() {
        System.out.println("[Makanan]");
        super.detailMenu();
        System.out.println("Jenis     : " + jenisMakanan);
    }
}
