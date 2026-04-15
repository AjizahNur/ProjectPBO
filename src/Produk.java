public class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga Dasar: Rp" + harga);
    }
}