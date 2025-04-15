/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author suciantari 2301010425
 * Tanggal 15 April 2025
 */
public class VolumeBalok {
    private int panjang,lebar,tinggi;
    private int hasil;
    
    public int volume (){
        this.hasil = panjang*lebar*tinggi;
        return hasil;
    }
    public void  setPanjang (int pj){
        this.panjang = pj;
    }
    public void  setLebar (int lb){
        this.lebar = lb;
    }
    public void  setTinggi (int tg){
        this.tinggi = tg;
    }
    public int getPanjang (){
        return this.panjang;
    }
    public int getLebar (){
        return this.lebar;
    }
    public int getTinggi (){
        return this.tinggi;
    }
}
