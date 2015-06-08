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
    /*        System.out.println("Masukkan Jumlah Lampu : ");
		setJumlah(input.nextInt()); */
		if(getJumlah() >= 18){
			return 1;
		}
		else{
			return 0; 
		}
	}

	@Override
	public int analisisKondisi() {
    /*        System.out.println("Masukkan Kondisi Lampu : ");
		setPosisi(input.next());    */
		if(getKondisi().equals("Baik")&& getJumlah() == 18){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisPosisi() {
    /*        System.out.println("Masukkan Posisi Lampu : ");
		setPosisi(input.next());    */
		if(getPosisi().equals("Atas")){
			return 1; 
		}
		else{
			return 0; 
		}
	}

	public void tampil() {
		System.out.println("Jumlah Lampu : "+getJumlah());
		System.out.println("Kondisi Lampu : "+getKondisi());
		System.out.println("Posisi Lampu : "+getPosisi());
	}
        
        public void simpan(){
          
                  try {
                FileWriter ketik = new FileWriter("Lampu.txt");
                ketik.write("Jumlah Lampu : "+getJumlah());
                ketik.write("Kondisi Lampu : "+getKondisi());
                ketik.write("Posisi Lampu : "+getPosisi());
                 ketik.close();      
            }
            catch (Exception a){
                a.printStackTrace();
            }
}  
}
