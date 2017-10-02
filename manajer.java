
public class manajer extends karyawan {

    private karyawan[] staff = new karyawan[10];
    private int jmlkaryawan;
    private int golongan;
    double kinerja;
    
    public manajer(String nama, double gaji, int golongan) {
        super(nama, gaji);
        this.golongan = golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    
    public void addStaff(karyawan k){
        staff[jmlkaryawan] = k;
        jmlkaryawan++;
    }
    
    public karyawan getStaff(int idx) {
        return staff[idx];
    }
    
    public void setKinerja(int kinerja) {
        if (kinerja>=85) {
            for(int i=0;i<jmlkaryawan;i++) {
                staff[i].setGaji(staff[i].getGaji() + (staff[i].getGaji()*0.1));
            //setGaji(super.getGaji()+(super.getGaji()*0.1)); 
            }
        } else if (kinerja<=40) {
            for(int i=0;i<jmlkaryawan;i++) {
                staff[i].setGaji(staff[i].getGaji() - (staff[i].getGaji()*0.15)); 
        }
    }
}
    
    @Override
    public double getGaji() {
            if(golongan==1) {
            return (super.getGaji()+1500000); //To change body of generated methods, choose Tools | Templates.   
            } else if(golongan==2) {
            return (super.getGaji()+2000000);
            } else if(golongan==3) {
            return (super.getGaji()+3000000);
            } else return super.getGaji();
    }
        
    public void displayData() {
        System.out.println("Nama manajer: "+getNama());
        System.out.println("Gaji manajer: "+getGaji());
        System.out.println("Golongan: "+getGolongan());
        System.out.println("Karyawan: "+jmlkaryawan);
        int j=0;
        for (j=0;j<jmlkaryawan;j++) {
            System.out.println("Karyawan: "+getStaff(j).getNama());
            System.out.println("Gaji Karyawan: "+getStaff(j).getGaji());
        }
    }
} 
