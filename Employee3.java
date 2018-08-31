import java.io.*;
import java.util.*;
public class Employee3{
    private String nama;
    private int umur;
    private String loker;
    private double gaji;
    
public void setNama(String nama){
	this.nama = nama;
}	
public String getNama(){
	return nama;
}
public void setUsia(int umur){
    this.umur = umur;
}
public int getUsia(){
	return usia;
}
public void setLoker(String loker){
    this.loker = loker;
}
public String getLoker(){
	return loker;
}
public void setGaji(double gaji){
    this.gaji = gaji;
}
public double getGaji(){
	return gaji;
}
public void tampilkanEmployee(){
    System.out.println ("Nama Pegawai : "+nama);
    System.out.println ("Umur   : "+umur);
    System.out.println ("Jenis Pekerjaan : "+loker);
    System.out.println ("Jumlah Gaji : "+gaji);
}

public static void main (String args[])throws IOException{
	//pake input stream
	//try {
	//InputStreamReader input = new InputStreamReader(System.in);
	//OutputStream output = new FileOutputStream();
	
	Scanner sc = new Scanner(System.in);	
	System.out.print ("Masukan nama pegawai : ");
	String name = sc.nextLine();
	
	System.out.print ("Masukan umur pegawai : ");
	int usia = sc.nextInt();
	
	System.out.print ("Masukan Gaji pegawai : ");
	Float gaji = sc.nextFloat();
	
	System.out.print ("Masukan Jenis Pekerjaan : ");
	String pekerjaan = sc.nextLine();
	
	System.out.println ("");		
	System.out.println ("==========");	
	System.out.println ("Data Pegawai : ");
	System.out.println ("==========");	
	
	Employee3 pegawai = new Employee3();
	pegawai.setNama(name);
	pegawai.setUsia(sc.nextInt);
	pegawai.setLoker(pekerjaan);
	pegawai.setGaji(gaji);
	
	//pegawai.tampilkanEmployee();
	
	System.out.println ("Nama pegawai: "+pegawai.getNama());
	System.out.println ("Umur pegawai: "+pegawai.getUsia());
	System.out.println ("Jenis Pekerjaan: "+pegawai.getLoker());
	System.out.println ("Gaji: "+pegawai.getGaji());
	
	//pegawai.tampilkanEmployee();
    // } catch (IOException e){
		//System.out.println("Exception Error");
	//}
	
}
}
