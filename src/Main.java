public class Main {
    public static void main(String[] args) {
        // Instansiasi objek
        Smartphone hp = new Smartphone("iPhone 15", 18000000, 3349);

        System.out.println("--- Detail Transaksi ---");
        hp.tampilkanInfo();
        hp.cekGaransi();

        // Logika Diskon
        double potongHarga = hp.hitungDiskon(15); // Diskon 15%
        System.out.println("Diskon Didapat: Rp" + potongHarga);
        System.out.println("Harga Net: Rp" + (hp.harga - potongHarga));
    }
}