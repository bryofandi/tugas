package tb;
import java.util.Scanner;
import java.io.FileWriter;
public class Internet extends KelasUtama {
    Scanner input = new Scanner(System.in);
    private String SSID;
    private int Bandwidth;

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    @Override
    public void Input() {
/*      System.out.println("Masukkan SSID : ");
        setSSID(input.next());
        System.out.println("Masukkan Bandwidth : ");
        setBandwidth(input.nextInt());  
*/  }   

    @Override
    public void View() {
        System.out.println("SSID : "+getSSID());
        System.out.println("Besar Bandwidth : "+getBandwidth());
    }

    @Override
    public void Analisa() {
        if(getSSID().equals("UMM Hotspot")){
        	System.out.println("SESUAI!");
        }
            else{
            	System.out.println("TIDAK SESUAI!");
    	}        
        if(getBandwidth()>=25 && getBandwidth()<=150){
            System.out.print("SESUAI!");
	}
	else{
            System.out.print("TIDAK SESUAI!");
	}
    }

    public void Save(){
    try {
        FileWriter set = new FileWriter("Internet.txt");
            set.write("SSID : "+getSSID());
            set.write("Bandwidth : "+getBandwidth());
            set.close();
    }
    catch (Exception a){
        a.printStackTrace();
    }    
    
    } 
    
}
