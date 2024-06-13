import java.util.Scanner;
public class OperasiPajak {

    // Kendaraan ken[] = new Kendaraan[5];
    // // String bulan[] =  ['Januari', 'Februari'];

    // int idxKen = 0, idxPj =0;

    // void tambahKendaraan(Kendaraan data){
    //     if(idxKen < ken.length){
    //         ken[idxKen] = data;
    //         idxKen++;
    //     } else {
    //         System.out.println("");
    //     }
    // }
    // public static void inputPajak(Scanner scanner) {
    //     System.out.print("\nMasukkan nomor TNKB: ");
    //     String tnkb = scanner.nextLine();
    //     System.out.print("Masukkan bulan bayar pajak: ");
    //     int bulan = scanner.nextInt();
    //     scanner.nextLine(); 


    //     Kendaraan kendaraan = AntrianPajak.cariKendaraan(tnkb);

    //     if (kendaraan != null) {
            
    //         // TransaksiPajak pajak = new TransaksiPajak(150000, 0, bulan); 
    //         // tambahPajak(pajak);

    //         System.out.println("Data pajak berhasil dimasukkan.");
    //     } else {
    //         System.out.println("Kendaraan dengan nomor TNKB " + tnkb + " tidak ditemukan.");
    //     }
    // }

   
    // public static void lihatPajak() {
        
    //     System.out.println("\n===== DATA PAJAK =====");
    //     System.out.println("Implementasi simpan data pajak yang lebih lengkap di sini...");
    // }

    
    // private static void tambahPajak(TransaksiPajak pajak) {
       
    //     System.out.println("Transaksi Pajak berhasil ditambahkan:");
    //     System.out.println("Kode: " + pajak.kode);
    //     System.out.println("Nominal Bayar: " + pajak.nominalBayar);
    //     System.out.println("Bulan Bayar: " + pajak.bulanBayar);
    // }




    public static void inputPajak(Scanner scanner) {
        System.out.print("\nMasukkan nomor TNKB: ");
        String tnkb = scanner.nextLine();
        System.out.print("Masukkan bulan bayar pajak: ");
        int bulan = scanner.nextInt();
        scanner.nextLine();  

        Kendaraan kendaraan = AntrianPajak.cariKendaraan(tnkb);

        if (kendaraan != null) {
            // Buat objek TransaksiPajak dan tambahkan ke linked list dataPajak
            TransaksiPajak pajak = new TransaksiPajak(150000, 0, bulan); // Contoh nominal pajak
            tambahPajak(pajak);

            System.out.println("Data pajak berhasil dimasukkan.");
        } else {
            System.out.println("Kendaraan dengan nomor TNKB " + tnkb + " tidak ditemukan.");
        }
    }

    // Method untuk menampilkan data pajak
    public static void lihatPajak() {
        // Untuk program ini sederhana, kita hanya menampilkan informasi tambahan
        System.out.println("\n===== DATA PAJAK =====");
        System.out.println("Implementasi simpan data pajak yang lebih lengkap di sini...");
    }

    // Method untuk menambahkan pajak ke linked list
    private static void tambahPajak(TransaksiPajak pajak) {
        pajak.kode = ++AntrianPajak.lastKode;
        // Simpan transaksi pajak ke dalam sistem (misalnya menyimpan ke database atau penyimpanan permanen lainnya)
        // Di sini kita hanya menampilkan informasi pajak sebagai contoh
        System.out.println("Transaksi Pajak berhasil ditambahkan:");
        System.out.println("Kode: " + pajak.kode);
        System.out.println("Nominal Bayar: " + pajak.nominalBayar);
        System.out.println("Bulan Bayar: " + pajak.bulanBayar);
    }
}

}

