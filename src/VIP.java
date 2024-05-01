// Kelas turunan untuk tiket VIP

class VIP extends Tiket {
   public VIP() {
       super("VIP", 150);
   }

   @Override
   public double hitungHarga(int jumlah, boolean isPresale) {
       double hargaTotal = harga * jumlah;
       if (isPresale) {
           hargaTotal *= 0.8; // Diskon 20% kalau Presale
       }
       return hargaTotal;
   }
}
