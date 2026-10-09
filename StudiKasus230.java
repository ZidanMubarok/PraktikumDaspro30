package H7.PraktikumDaspro30;

import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, statusDanaPKM;
        System.out.print("Nama mahasiswa                                       : ");
        namaMahasiswa = sc.next();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenisKegiatan = sc.next();
        if (jenisKegiatan.equalsIgnoreCase("belmawa")
                || jenisKegiatan.equalsIgnoreCase("bakorma")
                || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Peringkat juara (1,2,3 jika tidak juara isi dengan 0): ");
            peringkat = sc.nextInt();
            if (peringkat >= 1 && peringkat <= 3) {
                System.out.print("jumlah dokumen                                       : ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen >= 4) {
                    System.out.println("Berhak memperoleh dana penghargaan\n(PKM lolos pendanaan Dan Dokumen Lengkap "
                            + jumlahDokumen + " dokumen)");
                } else {
                    int dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap (Kurang " + dokumenKurang
                            + " dokumen).\nDana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Tidak memperoleh dana penghargaan(Hanya untuk juara 1/2/3)");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("Status pendanaan PKM (jika lolos ketik = 1, jika tidak ketik = 0) : ");
            statusDanaPKM = sc.nextInt();
            if (statusDanaPKM == 1) {
                System.out.print("jumlah dokumen                                                    : ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen >= 4) {
                    System.out.println("Berhak memperoleh dana penghargaan\n(PKM lolos pendanaan Dan Dokumen Lengkap "
                            + jumlahDokumen + " dokumen)");
                } else {
                    int dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap(Kurang " + dokumenKurang
                            + " dokumen).\n Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Tidak memperoleh dana penghargaan(PKM tidak lolos pendanaan)");
            }
        } else {
            System.out.println("Tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan)");
        }
    }
}
