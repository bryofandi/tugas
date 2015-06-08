package tb;
import java.util.Scanner;
import java.io.FileWriter;

public class CCTV implements JumlahKondisiSarana{
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
    /*    System.out.println("Masukkan Jumlah CCTV : ");
		setJumlah(input.nextInt()); */
		if(getJumlah() == 2){
			return 1;
		}
		else{
			return 0;
		}   
    }

    @Override
    public int analisisKondisi() {
    /*    System.out.println("Masukkan Kondisi CCTV : ");
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
    /*    System.out.println("Masukkan Posisi CCTV : ");
		setPosisi(input.next());    */
		if(getPosisi().equals("Depan dan Belakang")){
			return 1;
		}
		else{
			return 0;
		}
		
      }
    
	public void tampil() {
		System.out.println("Jumlah CCTV : "+getJumlah());
		System.out.println("Kondisi CCTV : "+getKondisi());
		System.out.println("Posisi CCTV : "+getPosisi());	
	}
        
        public void simpan(){
            try {
                FileWriter ketik = new FileWriter("CCTV.txt");
                ketik.write("Jumlah CCTV : "+getJumlah());
                ketik.write("Kondisi CCTV : "+getKondisi());
                ketik.write("Posisi CCTV : "+getPosisi());
                ketik.close();
                
            }
            catch (Exception a){
                a.printStackTrace();
            }
        }
    
}
