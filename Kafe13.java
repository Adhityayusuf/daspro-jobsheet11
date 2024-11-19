import java.util.Scanner;
public class Kafe13 {
    
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("Anda mendapatkan diskon 50% !");
        } else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("Anda mendapatkan diskon 30% !");
        } else {
            System.out.println("kode promo tidak valid !");
        }


        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode promo : ");
        String promo = sc.nextLine();
        Menu("Andi", true, promo);
    }
    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000,20000,22000,12000,10000,18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}