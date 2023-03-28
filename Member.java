
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IDEAPAD GAMING
 */
public class Member implements User{
    ArrayList<String> namaMember = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    
    public Member(){
        this.namaMember.add("Fahmi");
        this.alamat.add("Slorok"+"\t");
        this.telepon.add("012345678910");
        this.saldo.add(200000);
        
        this.namaMember.add("Faisal");
        this.alamat.add("Blimbing");
        this.telepon.add("098765432190");
        this.saldo.add(500000);
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    
    public int getJmlmember(){
        return this.saldo.size();
    }
    
    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
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
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }
}