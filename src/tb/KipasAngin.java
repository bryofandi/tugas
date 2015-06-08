package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class KipasAngin implements JumlahKondisiSarana {
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
    /*        System.out.println("Masukkan Jumlah Kipas Angin : ");
		setJumlah(input.nextInt()); */
		if(getJumlah() >= 2){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisKondisi() {
    /*        System.out.println("Masukkan Kondisi Kipas Angin : ");
		setKondisi(input.next());   */
        	if(getKondisi().equals("Baik") && getJumlah() == 2){
			return 1;
		}
		else{
			return 0 ;
		}
	}

	@Override
	public int analisisPosisi() {
    /*        System.out.println("Masukkan Posisi Kipas Angin: ");
		setPosisi(input.next());    */
		if(getPosisi().equals("Atas")){
			return 1;
		}
		else{
			return 0;
		}
	}

	public void Tampil() {
		System.out.println("Jumlah Kipas Angin : "+getJumlah());
		System.out.println("Kondisi Kipas Angin : "+getKondisi());
		System.out.println("Posisi Kipas Angin : "+getPosisi());
                
                        
	}  
        public void simpan(){
          
                  try {
                FileWriter ketik = new FileWriter("KipasAngin.txt");
                ketik.write("Jumlah Kipas Angin : "+getJumlah());
                ketik.write("Kondisi Kipas Angin : "+getKondisi());
                ketik.write("Posisi Kipas Angin : "+getPosisi());
                 ketik.close();      
            }
            catch (Exception a){
                a.printStackTrace();
            }
}  
}
