/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class AnggotaPerpustakaan {
    private int idAnggota;
    private String nama;
    private String alamat;
    private List <TransaksiPeminjaman> sejarahPeminjaman;
    private boolean statusketersediaan;
 

    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat, List<TransaksiPeminjaman> sejarahPeminjaman, boolean statusketersediaan) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.sejarahPeminjaman = sejarahPeminjaman;
        this.statusketersediaan = statusketersediaan;
    }
    
    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.sejarahPeminjaman = new ArrayList<>();
    }
    

    public int getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public List<TransaksiPeminjaman> getSejarahPeminjaman() {
        return sejarahPeminjaman;
    }

    public boolean isStatusketersediaan() {
        return statusketersediaan;
    }

    public void setStatusketersediaan(boolean statusketersediaan) {
        this.statusketersediaan = statusketersediaan;
    }
    
    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setSejarahPeminjaman(List<TransaksiPeminjaman> sejarahPeminjaman) {
        this.sejarahPeminjaman = sejarahPeminjaman;
    }
    
    public void pinjamBuku (Buku buku){
        if(isStatusketersediaan()){
            statusketersediaan = false;
            System.out.println("Anda telah meminjam Buku " + buku.getJudul());
            System.out.println("");
        }else{
            System.out.println("Buku \"" + buku.getJudul() + "\" Sedang Tidak Tersedia.");
            System.out.println("");
        }
    }
    
    public void kembalikanBuku (TransaksiPeminjaman transaksi){
        statusketersediaan = true;
        System.out.println("Buku \"" + transaksi.getAnggotaPeminjam() + "\" Telah Dikembalikan.");
        System.out.println("");
    }  
}
