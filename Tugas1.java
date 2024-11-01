import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlNilai,i;
        double rata;
        int terendah=100;
        int tertinggi=0;
        double total =0;

        System.out.print("Masukkan jumlah nilai: ");
        jmlNilai = input.nextInt();

        int nilai[] = new int[jmlNilai];
        i=0;
        while (i < nilai.length) {
            System.out.print("Masukkan nilai ke-"+(i+1)+ ": ");
            nilai[i] = input.nextInt();

            if (nilai[i]<0 || nilai[i]>100) {
                System.out.println("Nilai tidak valid, input ulang nilai");
                continue;
            }
            
            total += nilai[i];
            i++;
        }

        rata = total/nilai.length;
        System.out.println();
        System.out.println("Nilai Mahasiswa");
        for (i = 0; i < nilai.length; i++) {
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            System.out.println("Nilai Mahasiswa ke-" + (i+1)+": " + nilai[i]);
        }
        System.out.println("Rata-rata nilai: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("NIlai Terendah: " + terendah);
    }   
}