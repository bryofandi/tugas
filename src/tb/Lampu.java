/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

import java.io.FileWriter;
import java.util.Scanner;

public class Lampu implements JumlahKondisiSarana{
	Scanner input = new Scanner (System.in);
	private int Jumlah;
	private String Kondisi;
	private String Posisi;
	
	public int getJumlah() {
		return Jumlah;
	}
	public void setJumlah(int Jumlah) {
		this.Jumlah = Jumlah;
	}
	public String getKondisi() {
		return Kondisi;
	}
	public void setKondisi(String Kondisi) {
		this.Kondisi = Kondisi;
	}
	public String getPosisi() {
		return Posisi;
	}
	public void setPosisi(String Posisi) {
		this.Posisi = Posisi;
	}
	
	@Override
	public int analisisJumlah() {
		System.out.println("Masukkan Jumlah Lampu : ");
		Jumlah = input.nextInt();
		if(Jumlah >= 18){
			return 1;
		}
		else{
			return 0; 
		}
	}

	@Override
	public int analisisKondisi() {
		System.out.println("Masukkan Kondisi Lampu : ");
		Posisi = input.next();
		if(Kondisi.equals("Baik")&& Jumlah == 18){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisPosisi() {
		System.out.println("Masukkan Posisi Lampu : ");
		Posisi = input.next();
		if(Posisi.equals("Atas")){
			return 1; 
		}
		else{
			return 0; 
		}
	}

	public void tampil() {
		System.out.println("Jumlah Lampu : "+Jumlah);
		System.out.println("Kondisi Lampu : "+Kondisi);
		System.out.println("Posisi Lampu : "+Posisi);
	}
        
        public void simpan(){
          
                  try {
                FileWriter ketik = new FileWriter("Lampu.txt");
                ketik.write("Jumlah Lampu : "+Jumlah);
                ketik.write("Kondisi Lampu : "+Kondisi);
                ketik.write("Posisi Lampu : "+Posisi);
                 ketik.close();      
            }
            catch (Exception a){
                a.printStackTrace();
            }
}  
}
