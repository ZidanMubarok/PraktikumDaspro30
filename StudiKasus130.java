package H7.PraktikumDaspro30;

import java.util.Scanner;

// hargaPerCup=15000+(30 mod 6)×1000 = 15.000 → gantikan Rp18.000pada flowchart
// Syarat minimal belanja untuk diskon=80000+(30 mod 5)×10000 = 80.000 → gantikan Rp100.000pada flowchart
// Persentase diskon=5+(30 mod 6)% = 5% → gantikan 10%pada flowchart 
// Struktur logika(urutan langkah pada flowchart)tetap sama,hanya ketiga angka di atas yang diganti sesuai P Anda.
public class StudiKasus130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 15000; // sebelumnya 18.000 di ganti dengan nilai unik
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang anda beli   :  ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang anda bayar : Rp. ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) { // sesuai jobsheet
            diskon = totalHarga * 5 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga                             : Rp. " + totalHarga);
        System.out.println("Anda mendapat diskon sebesar            : Rp. " + diskon);
        System.out.println("Jadi total yang harus anda bayar adalah : Rp." + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Uang kembalian anda sebesar : Rp. " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda tidak cukup, kurang Rp. " + kurang);
        }
    }
}
