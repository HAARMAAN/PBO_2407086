package latihan_pbo.tugas3;

public class Menu {
    private String nama;
    private double harga;

    // Overloaded Constructors
    public Menu() {
        this.nama = "Belum ada nama";
        this.harga = 0;
    }

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Setters & Getters
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void detailMenu() {
        System.out.println("Nama Menu : " + nama);
        System.out.println("Harga     : Rp " + harga);
    }
}
