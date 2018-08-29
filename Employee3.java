import java.io.*;
public class Employee3{
    String nama;
    int usia;
    String loker;
    double gaji;
    
public Employee3(String nama){
    this.nama = nama;
}

public void setUsia(int age){
    usia = age;
}

public void setLoker(String pekerjaan){
    loker = pekerjaan;
}

public void setGaji(double salary){
    gaji = salary;
}

public void tampilkanEmployee(){
    System.out.println ("Nama Pegawai : "+nama);
    System.out.println ("Umur   : "+usia);
    System.out.println ("Jenis Pekerjaan : "+loker);
    System.out.println ("Jumlah Gaji : "+gaji);
}

public static void main (String args[])throws IOException{
	//pake input stream
	try {
	InputStreamReader input = new InputStreamReader(System.in);
	//OutputStream output = new FileOutputStream();
	
	System.out.print ("Masukan nama pegawai : ");
	String nama = new String(input.read());
	
	System.out.print ("Masukan umur pegawai : ");
	int umur = input.read();
	
	System.out.print ("Masukan Jenis Pekerjaan : ");
	String pekerjaan = new String(input.read());
	
	System.out.print ("Masukan Gaji pegawai : ");
	Float gaji = new Float(input.read());
	
	Employee3 pegawai = new Employee3("");
	pegawai.tampilkanEmployee();
    } catch (IOException e){
		System.out.println("Exception Error");
	}
	
}
}
