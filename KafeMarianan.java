import java.util.Scanner;
public class KafeMarianan {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7];
    static Scanner sc = new Scanner(System.in);
    public static void inputDataPenjualan() {
        System.out.println("Masukkan data penjualan untuk setiap menu (dalam 7 hari): ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void tampilkanDataPenjualan() {
        System.out.println("Data Penjualan: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void tampilkanTotalHari() {
        int totalKeseluruhan = 0;
        System.out.println("Total Penjualan per Hari: ");
        for (int i = 0; i < 7; i++) {
            int totalHari = 0;
            for (int j = 0; j < menu.length; j++) {
                totalHari += penjualan[j][i];
                totalKeseluruhan += penjualan[j][i];
            }
            System.out.println("Hari ke-" + (i + 1) + ": " + totalHari);
        }
        System.out.println("Total penjualan seluruhnya: " + totalKeseluruhan);
    }
    public static void menuPenjualanTertinggi() {
        int indexMenuTertinggi = -1;
        int penjualanTertinggi = 0;
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan;
                indexMenuTertinggi = i;
            }
        }
        System.out.println("Menu dengan Penjualan Tertinggi: " + menu[indexMenuTertinggi] + " (" + penjualanTertinggi + ")");
    }
    public static void rataRataPenjualan() {
        System.out.println("Rata-rata Penjualan per Menu: ");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.printf("%s: %.2f\n", menu[i], rataRata);
        }
    }
    public static void main(String[] args) {
        int pilihan;
        inputDataPenjualan();
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tampilkan Data Penjualan");
            System.out.println("2. Tampilkan Total Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-rata Penjualan per Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanDataPenjualan();
                    break;
                case 2:
                    tampilkanTotalHari();
                    break;
                case 3:
                    menuPenjualanTertinggi();
                    break;
                case 4:
                    rataRataPenjualan();
                    break;
                case 5:
                    System.out.println("BERHENTI !");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);
        sc.close();
    }
}
