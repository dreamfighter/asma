import java.io.*;
import java.util.*;
public class Employee3{
    String nama;
    int umur;
    String loker;
    double gaji;
    
public Employee3(String nama){
    this.nama = nama;
}

public void setUsia(int age){
    umur = age;
}

public void setLoker(String pekerjaan){
    loker = pekerjaan;
}

public void setGaji(double salary){
    gaji = salary;
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
	String nama = sc.nextLine();
	
	System.out.print ("Masukan umur pegawai : ");
	int umur = sc.nextInt();
	
	System.out.print ("Masukan Gaji pegawai : ");
	Float gaji = sc.nextFloat();
	
	System.out.print ("Masukan Jenis Pekerjaan : ");
	String pekerjaan = sc.nextLine();
	
	System.out.println ("");		
	System.out.println ("==========");	
	System.out.println ("Data Pegawai : ");
	System.out.println ("==========");	
	
	//Employee3 pegawai = new Employee3("");
	System.out.println ("Nama pegawai: "+nama);
	System.out.println ("Umur pegawai: "+umur);
	System.out.println ("Jenis Pekerjaan: "+pekerjaan);
	System.out.println ("Gaji: "+gaji);
	
	//pegawai.tampilkanEmployee();
    // } catch (IOException e){
		//System.out.println("Exception Error");
	//}
	
}
}
