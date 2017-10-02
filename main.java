
public class main {


    public static void main(String[] args) {
        // TODO code application logic here
        manajer m = new manajer("Bobby", 7500000, 2);
        //m.setKinerja(87);
        
       
        karyawan k1 = new karyawan("Alex", 5000000);
        karyawan k2 = new karyawan("Ruby", 4500000);
        karyawan k3 = new karyawan("Suzy", 5250000);
        karyawan k4 = new karyawan("Ben", 4750000);
        karyawan k5 = new karyawan("Max", 5500000);
        //m.setKinerja(87);
        m.addStaff(k1);
        m.addStaff(k2);
        m.addStaff(k3);
        m.addStaff(k4);
        m.addStaff(k5);
        m.setKinerja(87);
        m.displayData();
        
    }
    
}
