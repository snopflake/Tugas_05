// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    protected String jenis;
    protected double harga;

    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga(int jumlah, boolean isPresale);
}