// Menggabungkan Inheritance (extends) dan Interface (implements)
public class Smartphone extends Elektronik implements Diskonable {
    private int kapasitasBaterai;

    public Smartphone(String nama, double harga, int baterai) {
        super(nama, harga);
        this.kapasitasBaterai = baterai;
    }

    @Override
    public void cekGaransi() {
        System.out.println("Garansi Smartphone '" + nama + "' berlaku selama 12 bulan.");
    }

    @Override
    public double hitungDiskon(double persentase) {
        return harga * (persentase / 100);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}