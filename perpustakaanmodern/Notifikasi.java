/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Notifikasi {
    private int idNotifikasi;
    private String isiNotifikasi;
    private Date tanggalNotifikasi;
    private AnggotaPerpustakaan anggotaTujuan;

    public Notifikasi(int idNotifikasi, String isiNotifikasi, Date tanggalNotifikasi, AnggotaPerpustakaan anggotaTujuan) {
        this.idNotifikasi = idNotifikasi;
        this.isiNotifikasi = isiNotifikasi;
        this.tanggalNotifikasi = tanggalNotifikasi;
        this.anggotaTujuan = anggotaTujuan;
    }

    public int getIdNotifikasi() {
        return idNotifikasi;
    }

    public String getIsiNotifikasi() {
        return isiNotifikasi;
    }

    public Date getTanggalNotifikasi() {
        return tanggalNotifikasi;
    }

    public AnggotaPerpustakaan getAnggotaTujuan() {
        return anggotaTujuan;
    }

    public void setIdNotifikasi(int idNotifikasi) {
        this.idNotifikasi = idNotifikasi;
    }

    public void setIsiNotifikasi(String isiNotifikasi) {
        this.isiNotifikasi = isiNotifikasi;
    }

    public void setTanggalNotifikasi(Date tanggalNotifikasi) {
        this.tanggalNotifikasi = tanggalNotifikasi;
    }

    public void setAnggotaTujuan(AnggotaPerpustakaan anggotaTujuan) {
        this.anggotaTujuan = anggotaTujuan;
    }
    
    public void kirimNotifikasi(String anggotaTujuan){
        System.out.println("***Notifikasi baru***");
        System.out.println(tanggalNotifikasi);
        System.out.println("Hai " + anggotaTujuan + ", " + isiNotifikasi);
        System.out.println();
    }
}
