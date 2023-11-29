/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

/**
 *
 * @author ACER
 */
public class Buku {
    private int idBuku;
    private String judul;
    private String pengarang;
    private String isbn;
    
    public Buku(int idBuku, String judul, String pengarang, String isbn){
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void tambahKeKoleksi(){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("ISBN : " + isbn);
        System.out.println("Berhasil ditambahkan ke koleksi perpustakaan");
        System.out.println();
    }
    
    public void hapusDariKoleksi(){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("ISBN : " + isbn);
        System.out.println("Berhasil dihapus dari koleksi perpustakaan");
        System.out.println();
    }

}
