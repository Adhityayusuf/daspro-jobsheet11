import java.util.Scanner;
public class Kafe13 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("0. BERHENTI");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        int i = 0;
        int jumlah = 0;
        int[]pilihanMenu = new int[100]; int[]banyakItem = new int[100];

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihanMenu[i] = sc.nextInt();
            if (pilihanMenu[i] == 0) {
                System.out.println("==== BERHENTI ! ====");
                break;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                banyakItem[i] = sc.nextInt();
            i++;
            jumlah = i;
        }while (pilihanMenu[i] != 0);

        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String promo = sc.nextLine();
        double diskon = 0;
        if (promo.equalsIgnoreCase("diskon50")) {
            System.out.println("Anda mendapatkan diskon 50% !");
            diskon = 0.5;
        } else if (promo.equalsIgnoreCase("diskon30")) {
            System.out.println("Anda mendapatkan diskon 30% !");
            diskon = 0.3;
        } else {
            System.out.println("Kode promo tidak valid !");
        }
        int totalHarga = hitungTotalHarga13(pilihanMenu, banyakItem, i, diskon);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
    public static int hitungTotalHarga13(int []pilihanMenu, int []banyakItem, int jumlah,double diskon) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = 0;

        for (int i = 0; i < jumlah; i++){
            int Index = pilihanMenu[i] - 1;
            if
        }
        hargaTotal *= (1 - diskon);
        return hargaTotal;
    }
}
