package latihan_pbo.tugas3;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    private ArrayList<Menu> daftarMenu;

    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("=====================================");
        System.out.println("        DAFTAR MENU " + namaCafe.toUpperCase());
        System.out.println("=====================================");
        if (daftarMenu.isEmpty()) {
            System.out.println("Belum ada menu yang tersedia.");
        } else {
            for (int i = 0; i < daftarMenu.size(); i++) {
                System.out.println((i + 1) + ". ");
                // Polymorphism in action: detailMenu() dipanggil dari object yg bisa berupa Makanan/Minuman
                daftarMenu.get(i).detailMenu();
                System.out.println("-------------------------------------");
            }
        }
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public String getNamaCafe() {
        return namaCafe;
    }
}
