package latihan_pbo.tugas_1;

import java.util.Scanner;

import latihan_pbo.tugas_1.coba.jajargenjang;
import latihan_pbo.tugas_1.coba.persegi;
import latihan_pbo.tugas_1.coba.persegipanjang;
import latihan_pbo.tugas_1.coba.segitiga;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== MENU BANGUN DATAR =====");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Jajar Genjang");
        System.out.print("Pilih menu : ");

        int pilihan = input.nextInt();

        switch(pilihan){

            case 1:
                segitiga stg = new segitiga();

                System.out.print("Masukkan alas : ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();

                stg.setAlas(alas);
                stg.setTinggi(tinggi);

                System.out.println("Luas Segitiga : " + stg.luassegitiga());
                break;

            case 2:
                persegi p = new persegi();

                System.out.print("Masukkan sisi : ");
                double sisi = input.nextDouble();

                p.setSisi(sisi);

                System.out.println("Luas Persegi : " + p.luaspersegi());
                break;

            case 3:
                persegipanjang pp = new persegipanjang();

                System.out.print("Masukkan panjang : ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar : ");
                double lebar = input.nextDouble();

                pp.setPanjang(panjang);
                pp.setlebar(lebar);

                System.out.println("Keliling Persegi Panjang : " + pp.kelilingpersegipanjang());
                System.out.println("Luas Persegi Panjang : " + pp.luaspersegipanjang());
                break;

            case 4:
                jajargenjang jjg = new jajargenjang();

                System.out.print("Masukkan alas : ");
                double a = input.nextDouble();

                System.out.print("Masukkan tinggi : ");
                double t = input.nextDouble();

                jjg.setAlas(a);
                jjg.setTinggi(t);

                System.out.println("Luas Jajar Genjang : " + jjg.luasjajargenjang());
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}