
import java.util.Scanner;

public class Main {
    static Node head;

    public static void main(String[] args) {
        tambahKendaraan(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        tambahKendaraan(new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        tambahKendaraan(new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        tambahKendaraan(new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi berdasarkan nama Pemiliki");
            System.out.println("5. Keluar");
            pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Kendaraan ");
                    System.out.println("+++++++++++++++++++++++++++++++");
                    // OperasiKendaraan.inputPajak(scanner);
                    break;
                case 2:
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Pembayaran");
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Nomer TNBK: ");
                    String tnbk = scanner.nextLine();
                    System.out.println("Bulan Bayar : ");
                    int bln = scanner.nextInt();
                    OperasiKendaraan.lihatKendaraan();
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println("+++++++++++++++++++++++++++++++");
                    OperasiPajak.lihatPajak();
                    break;
                case 4:
                    System.out.println("Daftar Trasaksi Pembayaran Pajak");
                    
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
        scanner.close();
    }

    public static void tambahKendaraan(Kendaraan kendaraan) {
        Node newNode = new Node(kendaraan);
        newNode.next = head;
        head = newNode;
    }
    //     public static void main(String[] args) {

    //     tambahKendaraan(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
    //     Scanner sc = new Scanner(System.in);
    //     Scanner input = new Scanner(System.in);
        
    //     int pilih;

    //     do{
    //         menu();
    //         pilih = sc.nextInt();
    //         switch (pilih) {
    //             case 1:
    //                 System.out.print("NIM   : ");
    //                 int nim = sc.nextInt();
    //                 System.out.print("Nama  : ");
    //                 String nama = input.nextLine();
                    
    //                 break;
                
    //             case 2:
    //                 System.out.println("Masukkan Data Pembayaran");
    //                 System.out.print("Masukkan Nomer TNBK : ");
    //                 String tnbk = sc.nextLine();
    //                 System.out.print("Bulan Bayar: ");
    //                 int bln = sc.nextInt();

    //                 break;

    //             case 3:
    //                 System.out.println("+++++++++++++++++++++++++++++++");
    //                 System.out.println("Daftar Transaksi Pembayaran Pajak");
    //                 System.out.println("+++++++++++++++++++++++++++++++");
                    
                    
    //                 break;
                
    //             case 4:
    //                 System.out.println("+++++++++++++++++++++++++++++++");
    //                 System.out.println("");
    //                 System.out.println("+++++++++++++++++++++++++++++++");
    //                 break;

    //             case 5:
    //                 System.out.println("Masukkan nim: ");
    //                 int carinim = sc.nextInt();
    //                 antri.peekPosition(carinim);
    //                 break;

    //         }
    //     } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    // }
        
    

    // public static void menu() {
    //     System.out.println("Menu");
    //     System.out.println("1. Daftar Kendaraan");
    //     System.out.println("2. Bayar Pajak");
    //     System.out.println("3. Tampilkan seluruh transaksi");
    //     System.out.println("Urutkan Transaksi berdasarkan nama Pemiliki");
    //     System.out.println("5. Keluar");
    // }

    // public static void tambahKendaraan(Kendaraan kendaraan) {
    //     Node newNode = new Node(kendaraan);
    //     newNode.next = head;
    //     head = newNode;
    // }



// Class AntrianPajak untuk mengatur antrian dan operasi-operasi pada data kendaraan
public class AntrianPajak {
    static Node head;
    static int lastKode = 0;

    public static void main(String[] args) {
        tambahKendaraan(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        tambahKendaraan(new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        tambahKendaraan(new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        tambahKendaraan(new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));
        OperasiPajak operasi = new OperasiPajak();

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("Urutkan Transaksi berdasarkan nama Pemiliki");
            System.out.println("5. Keluar");
            pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    operasi.inputPajak(scanner);
                    break;
                case 2:
                    OperasiKendaraan.lihatKendaraan();
                    break;
                case 3:
                    OperasiPajak.lihatPajak();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
        scanner.close();
    }

    public static void tambahKendaraan(Kendaraan kendaraan) {
        Node newNode = new Node(kendaraan);
        newNode.next = head;
        head = newNode;
    }
}

}


