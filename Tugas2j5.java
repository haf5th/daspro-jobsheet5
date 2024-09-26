import java.util.Scanner;

public class Tugas2j5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan usia anda: ");
        int usia = sc.nextInt();

        if (usia < 0) {
            System.out.println("Invalid number.");
        } else if (usia <= 12) {
            System.out.println("Usia anda tergolong Anak.");
        } else if (usia <= 19) {
            System.out.println("Usia anda tergolong Remaja.");
        } else if (usia <= 64) {
            System.out.println("Usia anda tergolong Dewasa.");
        } else {
            System.out.println("Usia anda tergolong Lansia");
        }

    }
}
