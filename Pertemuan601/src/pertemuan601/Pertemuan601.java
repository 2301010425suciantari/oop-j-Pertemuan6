/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan601;

import java.util.Scanner;

/**
 *
 * @author suciantari 2301010425
 * Tanggal 15 April 2025
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolumeBalok vb = new VolumeBalok ();
        Scanner inp = new Scanner(System.in);
        
        
       System.out.println("Hitung volume balok");
       System.out.print("Nilai Panjang: ");
       vb.setPanjang(inp.nextInt());
       System.out.print("Nilai Lebar: ");
       vb.setLebar(inp.nextInt());
       System.out.print("Nilai Tinggi: ");
       vb.setTinggi(inp.nextInt());
       System.out.println("Nilai Volumenya: ");
       System.out.println("V = P * L * T");
       System.out.printf(" = %d * %d * %d\n", vb.getPanjang(), vb.getLebar(), vb.getTinggi());
       System.out.printf(" = %d" ,vb.volume());
    }
    
}
