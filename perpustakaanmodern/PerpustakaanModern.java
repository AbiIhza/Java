/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaanmodern;

import java.time.LocalDate;
import java.util.Date;

public class PerpustakaanModern {

    public static void main(String[] args) {
        Admin admin = new Admin();
        
        // Membuat objek AnggotaPerpustakaan
        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(1, "erin", "teluk");

        // Membuat objek Notifikasi dengan objek AnggotaPerpustakaan
        Notifikasi notifikasi = new Notifikasi(1, "Pesan Notifikasi", new Date(), anggota);

        // Memanggil metode kirimNotifikasi dengan objek AnggotaPerpustakaan
        notifikasi.kirimNotifikasi("erin");
        
        Buku bukuBaru = new Buku(1, "Harry Poah", "JK ROWLING", "8289282480");
           
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(301, LocalDate.now(), LocalDate.now().plusDays(7), bukuBaru, anggota);

        
        admin.tambahBuku(bukuBaru);
        anggota.pinjamBuku(bukuBaru);
        anggota.kembalikanBuku(transaksi1);
        transaksi1.hitungDenda();
        admin.hapusBuku("Harry Poah");
 
    }
}
