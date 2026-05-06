package latihan_pbo.tugas3;

public class Minuman extends Menu {
    private String ukuran; // contoh: Small, Medium, Large

    // Overloading constructor
    public Minuman(String nama, double harga) {
        super(nama, harga);
        this.ukuran = "Medium";
    }

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public void detailMenu() {
        System.out.println("[Minuman]");
        super.detailMenu();
        System.out.println("Ukuran    : " + ukuran);
    }
}
