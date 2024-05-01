// Kelas turunan untuk tiket VVIP

class VVIP extends Tiket {
    public VVIP() {
        super("VVIP", 200);
    }

    @Override
    public double hitungHarga(int jumlah, boolean isPresale) {
        double hargaTotal = harga * jumlah;
        if (isPresale) {
            hargaTotal *= 0.8; //Diskon 20% kalau Presale
        }
        return hargaTotal;
    }
}