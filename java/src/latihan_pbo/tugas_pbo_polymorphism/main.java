package latihan_pbo.tugas_pbo_polymorphism;

public class main {
    public static void main(String[] args) {
        // Menggunakan satu tipe variabel bangundatar untuk berbagai objek
        bangundatar[] daftarBangun = new bangundatar[4];

        daftarBangun[0] = new bangundatar(3.0, 4.0);
        daftarBangun[1] = new persegi(5.0);
        daftarBangun[2] = new persegipanjang(6.0, 4.0); // Sesuaikan jika nama filenya persegipanjang
        daftarBangun[3] = new segitiga(10.0, 5.0);

        for (bangundatar bd : daftarBangun) {
            bd.tampilkan();
            System.out.println();
        }
    }
}