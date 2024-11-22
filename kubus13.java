import java.util.Scanner;
public class kubus13 {
    public static int hitungVolume(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }
    public static int hitungLuasPermukaan(int sisi) {
        int Luas =  6 * (sisi * sisi);
        return Luas;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt();
        System.out.println("Panjang sisi kubus  : " + sisi);
        System.out.println("Volume kubus        : " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
        scanner.close();
    }
}
