/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class TransaksiPengembalian{
    private int idTransaksi;
    private LocalDate tanggalKembali;
    private double denda;
    private TransaksiPeminjaman transaksiPeminjaman;

    public TransaksiPengembalian(int idTransaksi, LocalDate tanggalKembali, double denda, TransaksiPeminjaman transaksiPeminjaman) {
        this.idTransaksi = idTransaksi;
        this.tanggalKembali = tanggalKembali;
        this.denda = denda;
        this.transaksiPeminjaman = transaksiPeminjaman;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public double getDenda() {
        return denda;
    }

    public TransaksiPeminjaman getTransaksiPeminjaman() {
        return transaksiPeminjaman;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public void setTransaksiPeminjaman(TransaksiPeminjaman transaksiPeminjaman) {
        this.transaksiPeminjaman = transaksiPeminjaman;
    }
    
    public void prosesPengembalian(){
        
    }
}
