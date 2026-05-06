package latihan_pbo.tugas3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafe myCafe = new Cafe("Cafe Informatika");

        // Membuat beberapa objek Makanan dan Minuman (Memanfaatkan overloading constructor)
        Menu nasigoreng = new Makanan("Nasi Goreng Spesial", 25000, "Makanan Berat");
        Menu kentanggoreng = new Makanan("Kentang Goreng", 15000, "Snack");
        Menu kopisusu = new Minuman("Kopi Susu Gula Aren", 18000, "Medium");
        Menu esteh = new Minuman("Es Teh Manis", 8000, "Large");

        // Memasukkan menu ke dalam cafe (Polymorphism: Makanan dan Minuman disimpan dalam tipe Menu)
        myCafe.tambahMenu(nasigoreng);
        myCafe.tambahMenu(kentanggoreng);
        myCafe.tambahMenu(kopisusu);
        myCafe.tambahMenu(esteh);

        boolean isRunning = true;
        double totalHarga = 0;

        System.out.println("Selamat datang di " + myCafe.getNamaCafe());

        while (isRunning) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tampilkan Daftar Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("3. Lihat Total Pesanan & Keluar");
            System.out.print("Pilih aksi (1/2/3): ");
            
            String pilihan = scanner.nextLine();

            // Percabangan menggunakan switch
            switch (pilihan) {
                case "1":
                    myCafe.tampilkanMenu();
                    break;
                case "2":
                    myCafe.tampilkanMenu();
                    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                    try {
                        int nomorMenu = Integer.parseInt(scanner.nextLine());
                        
                        // Validasi input nomor menu menggunakan if
                        if (nomorMenu > 0 && nomorMenu <= myCafe.getDaftarMenu().size()) {
                            Menu menuDipilih = myCafe.getDaftarMenu().get(nomorMenu - 1);
                            
                            System.out.print("Masukkan jumlah pesanan untuk " + menuDipilih.getNama() + ": ");
                            int jumlah = Integer.parseInt(scanner.nextLine());
                            
                            if (jumlah > 0) {
                                double subtotal = menuDipilih.getHarga() * jumlah;
                                totalHarga += subtotal;
                                System.out.println("Berhasil menambahkan " + jumlah + "x " + menuDipilih.getNama() + " ke pesanan.");
                                System.out.println("Subtotal: Rp " + subtotal);
                            } else {
                                System.out.println("Jumlah pesanan harus lebih dari 0!");
                            }
                        } else {
                            System.out.println("Nomor menu tidak valid!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka!");
                    }
                    break;
                case "3":
                    System.out.println("\n=====================================");
                    System.out.println("Total tagihan Anda adalah: Rp " + totalHarga);
                    System.out.println("Terima kasih telah berkunjung ke " + myCafe.getNamaCafe() + "!");
                    System.out.println("=====================================");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
}
