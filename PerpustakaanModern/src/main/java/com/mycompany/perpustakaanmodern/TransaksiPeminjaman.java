/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author ACER
 */
public class TransaksiPeminjaman {
    private int idTransaksi;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalHarusKembali;
    private Buku bukuDipinjam;
    private AnggotaPerpustakaan anggotaPeminjam;

    public TransaksiPeminjaman(int idTransaksi, LocalDate tanggalPinjam, LocalDate tanggalHarusKembali, Buku bukuDipinjam, AnggotaPerpustakaan anggotaPeminjam) {
        this.idTransaksi = idTransaksi;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalHarusKembali = tanggalHarusKembali;
        this.bukuDipinjam = bukuDipinjam;
        this.anggotaPeminjam = anggotaPeminjam;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public LocalDate getTanggalHarusKembali() {
        return tanggalHarusKembali;
    }

    public Buku getBukuDipinjam() {
        return bukuDipinjam;
    }

    public AnggotaPerpustakaan getAnggotaPeminjam() {
        return anggotaPeminjam;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setTanggalHarusKembali(LocalDate tanggalHarusKembali) {
        this.tanggalHarusKembali = tanggalHarusKembali;
    }

    public void setBukuDipinjam(Buku bukuDipinjam) {
        this.bukuDipinjam = bukuDipinjam;
    }

    public void setAnggotaPeminjam(AnggotaPerpustakaan anggotaPeminjam) {
        this.anggotaPeminjam = anggotaPeminjam;
    }
    
    public void hitungDenda(){
        LocalDate tanggalKembali = LocalDate.now();
        long selisihHari = ChronoUnit.DAYS.between(tanggalHarusKembali, tanggalKembali);  
        
        if(selisihHari > 0){
            double denda = (double) selisihHari * 1000;
            System.out.println("Denda yang harus dibayar: " + denda + " rupiah.");
            System.out.println("");
        }else{
             System.out.println("Tidak ada denda. Anda mengembalikan tepat waktu.");
             System.out.println("");
        }
    }
}
