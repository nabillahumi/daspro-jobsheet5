import java.util.Scanner;

public class kafe18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu :");
        menu = sc.nextLine();
        System.out.print("MAsukkan ukuran cup :");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah :");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double harga = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                harga = 12000;
                break;
            case "teh":
                harga = 7000;
                break;
            case "coklat":
                harga = 20000;
                break;
            default:
                System.out.println("Menu yang dipilih tidak tersedia.");
                return;
        }

        double total = harga * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                total += 0.25 * total;
                break;
            case 'L':
                total += 0.4 * total;
                break;
            default:
                System.out.println("Ukuran cup yang dipilih tidak tersedia.");
                return;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double bayar = total - (diskon * total);

        System.out.println("");
        System.out.println("========================================");
        System.out.println("Item Pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal Bayar : Rp. " + bayar);
    }
}
