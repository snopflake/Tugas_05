import java.util.Scanner;

//Nama  : Nofa Nisrina Salsabila
//NIM   : 235150700111005
//Prodi : Teknologi Informasi (A)

//Tugas 05 Praktikum Pemrograman Lanjutan

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        //Input nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();
        System.out.println();

        //Input tahap pembelian
        System.out.println("Pilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();
        scanner.nextLine(); //transisi ea
        System.out.println();

        //Logic Presale dan Reguler
        String tahap;
        boolean isPresale;
        if (tahapPembelian == 1) {
            tahap = "Presale";
            isPresale = true;
        } else if (tahapPembelian == 2) {
            tahap = "Reguler";
            isPresale = false;
        } else {
            System.out.println("Input tidak valid!");
            System.out.println();
            return;
        }

        //Nilai awal tiket = kosong
        Tiket tiket = null;

        //Input jenis tiket (Presale)
        if (tahapPembelian == 1) {
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int jenisTiket = scanner.nextInt();
            scanner.nextLine(); //transisi ea
            System.out.println();

            if (jenisTiket == 1) {
                tiket = new VIP();
            } else if (jenisTiket == 2) {
                tiket = new VVIP();
            } else {
                System.out.println("Input tidak valid!");
                System.out.println();
                return;
            }
        
        //Input jenis tiket (Reguler)
        } else if (tahapPembelian == 2) {
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();
            scanner.nextLine(); //transisi ea
            System.out.println();

            if (jenisTiket == 1) {
                tiket = new Festival();
            } else if (jenisTiket == 2) {
                tiket = new VIP();
            } else if (jenisTiket == 3) {
                tiket = new VVIP();
            } else {
                System.out.println("Input tidak valid!");
                System.out.println();
                return;
            }
        }

        //Input jumlah tiket
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();
        System.out.println();

        //Output cetak nota
        Pemesanan pemesanan = new Pemesanan(nama, tahap, tiket, jumlahTiket);
        pemesanan.cetakNota(isPresale);
    }
}