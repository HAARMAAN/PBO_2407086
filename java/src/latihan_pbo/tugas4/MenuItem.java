package latihan_pbo.tugas4;

public class MenuItem {
    protected String nama;
    protected double harga;

    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // WAJIB ADA INI BIAR BISA DI-OVERRIDE
    public void tampilkan() {
    }
}