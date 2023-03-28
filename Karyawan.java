
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IDEAPAD GAMING
 */
public class Karyawan implements User{
    ArrayList<String> namaKaryawan = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    ArrayList<Integer> jabatan = new ArrayList<Integer>();

    
    public Karyawan(){
        this.namaKaryawan.add("Tony");
        this.alamat.add("Los Santos");
        this.telepon.add("0325963293896");
        this.jabatan.add(0);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    
    public int getJmlKaryawan(){
        return this.jabatan.size();
    }
    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}
