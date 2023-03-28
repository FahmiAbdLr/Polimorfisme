
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IDEAPAD GAMING
 */
public class Barang {
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> stok = new ArrayList<Integer>();
    ArrayList<Integer> harga = new ArrayList<Integer>();
    
    
    public Barang(){
        this.namaBarang.add("Pisang Coklat\t");
        this.stok.add(10);
        this.harga.add(12000);
        
        this.namaBarang.add("Pisang Coklat Keju");
        this.stok.add(10);
        this.harga.add(13000);
        
        this.namaBarang.add("Pisang Coklat Matcha");
        this.stok.add(10);
        this.harga.add(14000);
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    
    public void editStok(int idBarang, int stok){
        this.stok.add(idBarang, stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}
