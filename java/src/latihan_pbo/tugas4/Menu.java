package latihan_pbo.tugas4;

public class Menu extends MenuItem {
    int jumlah;

    public Menu(String nama, double harga, int jumlah) {
        super(nama, harga); // Manggil constructor MenuItem
        this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return this.harga * this.jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama + " | " + jumlah + " pcs | Total: Rp" + hitungTotal());
    }
}