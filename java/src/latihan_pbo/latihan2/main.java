package latihan_pbo.latihan2;

class Cafe {
    String nama;
    String alamat;

    // constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    void buka() {
        System.out.println(nama + " Sudah Buka di " + alamat);
    }
    void tutup() {
        System.out.println(nama + " Sudah Tutup di " + alamat);
    }
}

public class main {
    public static void Main(String[] args) {

        Cafe cafe1 = new Cafe("Halaman", "Indramayu");
        cafe1.buka();

        Cafe cafe2 = new Cafe("Teringat", "Indramayu");
        cafe2.tutup();

        Cafe cafe3 = new Cafe("Kopken", "Indramayu");
        cafe3.buka();
    }
}