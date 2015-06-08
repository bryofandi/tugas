package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class StopKontak implements JumlahKondisiSarana {
    Scanner input = new Scanner(System.in);
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
    /*    System.out.println("Masukkan Jumlah Stop Kontak : ");
		setJumlah(input.nextInt()); */
		if(getJumlah() == 4){
			return 1;
		}
		else{
			return 0;
		}   
    
    }

    @Override
    public int analisisKondisi() {
    /*    System.out.println("Masukkan Kondisi Stop Kontak : ");
		setKondisi(input.next());   */
		if(getKondisi().equals("Baik") && getJumlah() == 2){
			return 1;
		}
		else{
			return 0; 
		}
    }

    @Override
    public int analisisPosisi() {
    /*    System.out.println("Masukkan Posisi Stop Kontak : ");
		setPosisi(input.next());    */
		if(getPosisi().equals("Dekat Dosen")){
			return 1;
		}
		else{
			return 0;
		}
    }
    
    public void tampil() {
	System.out.println("Jumlah Stop Kontak : "+getJumlah());
	System.out.println("Kondisi Stop Kontak : "+getKondisi());
	System.out.println("Posisi Stop Kontak : "+getPosisi());	
    }
    
    public void simpan(){
        try {
            FileWriter ketik = new FileWriter("StopKontak.txt");
            ketik.write("Jumlah Stop Kontak : "+getJumlah());
            ketik.write("Kondisi Stop Kontak : "+getKondisi());
            ketik.write("Posisi Stop Kontak : "+getPosisi());
            ketik.close();
                
    }
        catch (Exception a){
                a.printStackTrace();
            }
        }
    
}
