/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IDEAPAD GAMING
 */
public class TokoOnline_run {
    public static void main(String[] args) {
        Member member_run = new Member();
        Karyawan karyawan_run = new Karyawan();
        Barang barang_run = new Barang ();
        Transaksi transaksi_run = new Transaksi();
        Laporan laporan_run = new Laporan();
        
        laporan_run.laporan(barang_run);
        laporan_run.laporan(member_run);
        laporan_run.laporan(transaksi_run, barang_run);
        
        System.out.println("\n\n\n");
        transaksi_run.prosesTransaksi(member_run, transaksi_run, barang_run);
        System.out.println("\n\n\n");
    }
}
