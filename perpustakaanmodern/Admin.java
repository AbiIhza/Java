/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Admin {
    private int idAdmin;
    private String namaAdmin;
    private List<Buku> koleksiBuku;
    
    public Admin(int idAdmin, String namaAdmin) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
    }
    
    public Admin() {
        this.koleksiBuku = new ArrayList<>();
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }
    
    public void tambahBuku (Buku buku){
        koleksiBuku.add(buku);
        buku.tambahKeKoleksi();
    }
    
     public void hapusBuku(String judul) {
        Iterator<Buku> iterator = koleksiBuku.iterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            if (buku.getJudul().equals(judul)) {
                iterator.remove();
                buku.hapusDariKoleksi();
                return;
            }
        }
        System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan dalam koleksi perpustakaan");
    }
   
    public void beriDenda (TransaksiPeminjaman transaksi){
        
    }
}
