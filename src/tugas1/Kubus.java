/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Dell
 */
public class Kubus extends BangunRuang {
    private int sisi;
    int panjang, lebar, tinggi;
    
    public Kubus(int sisi) {
        this.sisi = sisi;
        super.setWarna("Hitam");
    }
    
    public Kubus(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        super.setWarna("Merah");
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double volume(){
        return sisi*sisi*sisi;
    }
    
    double volume(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }
            
    @Override
    double luasPermukaan(){
        return sisi*sisi*6;
    }
    double luasPermukaan(int panjang){
        return panjang*panjang*6;
    }
    void tampilkan(){
        System.out.println("Volume Kubus : " + volume());
        System.out.println("Luas Permukaan Kubus : " + luasPermukaan());
        System.out.println("Warna Kubus : " + super.getWarna());
    }
}
