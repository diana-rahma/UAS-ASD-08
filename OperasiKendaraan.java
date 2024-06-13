import java.util.*;
public class OperasiKendaraan {
   
    public static void lihatKendaraan() {
        System.out.println("\n===== DATA KENDARAAN =====");
        AntrianPajak.Node current = AntrianPajak.head;
        while (current != null) {
            Kendaraan kendaraan = current.data;
            System.out.println("Nomor TNKB: " + kendaraan.noTNKB);
            System.out.println("Nama: " + kendaraan.nama);
            System.out.println("Jenis: " + kendaraan.jenis);
            System.out.println("CC: " + kendaraan.cc);
            System.out.println("Tahun: " + kendaraan.tahun);
            System.out.println("Bulan harus bayar: " + kendaraan.bulanHarusBayar);
            System.out.println("------------------------");
            current = current.next;
        }
    }
}