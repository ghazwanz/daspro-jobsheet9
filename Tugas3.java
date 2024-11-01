import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice", "Matcha Latte" };
        int hasil = 0;
        System.out.println("====================== Kafe ======================");

        System.out.println("List Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Menu ke-" + (i+1) + ": " + menu[i]);
            System.out.println();
        }
        
        System.out.println("==================================================");
        System.out.print("Silahkan cari menu: ");
        String searchKey = input.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchKey)) {
                hasil = i+1;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println(searchKey + " tersedia pada list menu ke-" + hasil);
        } else{
            System.out.println(searchKey + " tidak ada pada list menu");
        }
    }
}