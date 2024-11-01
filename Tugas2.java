import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlPesanan,i,total=0;
        System.out.println("====================== Kafe ======================");
        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = input.nextInt();

        String menu[] = new String[jmlPesanan]; 
        int harga[] = new int[jmlPesanan];

        input.nextLine();
        i=0;
        while (i < harga.length && i < menu.length) {
            
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            menu[i] = input.nextLine();
            System.out.print("Masukkan harga menu ke-" + (i+1) + ": ");
            harga[i] = input.nextInt();
            input.nextLine();
            if (harga[i] < 0) {
                System.out.println("Harga tidak valid");
                continue;
            }
            total += harga[i];
            i++;
        }
        System.out.println("==================================================");
        System.out.println("Jumlah pemesanan: " + jmlPesanan);
        for ( i = 0; i < harga.length && i < menu.length; i++) {
            System.out.print("Menu ke-" + (i+1) +": " + menu[i] + "\tharga: " + harga[i]);
            System.out.println();
        }
        System.out.println("Total biaya: " + total);
        System.out.println("==================================================");
    }
}