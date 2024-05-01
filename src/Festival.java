// Kelas turunan untuk tiket Festival

class Festival extends Tiket {
    public Festival() {
        super("Festival", 100);
    }

    @Override
    public double hitungHarga(int jumlah, boolean isPresale) {
        return harga * jumlah;
    }
}
