package latihan_pbo.latihan;

public class main {
    public static void main(String[] args) {
        
        persegi s1 = new persegi(5); 
        segitiga s2 = new segitiga(6, 8); 

        bangundatar[] daftarBangun = {s1, s2};

        for (bangundatar bd : daftarBangun) {
            bd.Display();
            System.out.println();
        }
    }
}
