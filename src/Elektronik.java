public abstract class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    // Method ini tidak punya isi, wajib diisi oleh kelas anak
    public abstract void cekGaransi();
}