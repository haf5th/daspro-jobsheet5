import java.util.Scanner;
public class Siakad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nilaiHuruf = " ", kualifikasi = " ";
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
    
        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }
        else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }
        else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir > 0) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi" + kualifikasi);
        sc.close();

    }
}