package latihan_pbo.tugas4;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU CAFE ===");
        System.out.println("1. Kopi (Rp10000)\n2. Teh (Rp5000)");
        
        // Input Pesanan 1
        System.out.print("\nPilih Menu (1/2): ");
        int pil = sc.nextInt();
        System.out.print("Jumlah: ");
        int qty = sc.nextInt();

        // Logika pilih menu simpel
        String n = (pil == 1) ? "Kopi" : "Teh";
        double h = (pil == 1) ? 10000 : 5000;

        // Buat objek dari class Menu
        Menu pesanan = new Menu(n, h, qty);

        // Tampilkan hasil
        System.out.println("\n--- HASIL PESANAN ---");
        pesanan.tampilkan(); 
        System.out.println("TOTAL BAYAR: Rp" + pesanan.hitungTotal());
        
        sc.close();
    }
}