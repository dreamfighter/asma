public class Employee2{
    String nama;
    int usia;
    String loker;
    double gaji;
    
public Employee(String nama){
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
	//com
    Employee pegawai1 = new Employee ("Hasma");
    pegawai1.setUsia(28);
    pegawai1.setLoker("Dosen");
    pegawai1.setGaji(5000000);
    pegawai1.tampilkanEmployee();
    
}
}