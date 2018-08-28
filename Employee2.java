public class Employee2{
    String nama;
    int usia;
    String loker;
    double gaji;
    
public Employee2(String nama){
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

public static void main (String args[]){
	//coment hasma
	
    Employee2 pegawai1 = new Employee2 (args[0]);
    pegawai1.setUsia(Integer.parseInt(args[1]));
    pegawai1.setLoker(args[2]);
    pegawai1.setGaji(Float.parseFloat(args[3]));
    pegawai1.tampilkanEmployee();
    
}
}
