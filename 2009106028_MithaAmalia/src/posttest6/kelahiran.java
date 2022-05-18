package posttest6;

public class kelahiran extends penduduk {
    private long noLahir;
    private String hariLahir, keterangan;
    
    kelahiran(long nik, long noLahir, String nama, String tempatLahir, String hariLahir, String tanggalLahir, String keterangan, String sex, String agama, String status, String pekerjaan, String alamat) {
        super(nik, nama, tempatLahir, tanggalLahir, sex, agama, status, pekerjaan, alamat);
        this.noLahir = noLahir;
        this.hariLahir = hariLahir;
        this.keterangan = keterangan;
    }
    
    @Override //overreading
    public void LihatData(){
        System.out.println("NIK             : "+getNik());
        System.out.println("No Kelahiran    : "+this.noLahir);
        System.out.println("Nama            : "+getNama());
        System.out.println("Tampat Lahir    : "+getTempatLahir());
        System.out.println("Hari Lahir      : "+this.hariLahir);
        System.out.println("Tanggal Lahir   : "+getTanggalLahir());
        System.out.println("Keterangan      : "+this.keterangan);
        System.out.println("Jenis Kelamin   : "+getSex());
        System.out.println("Agama           : "+getAgama());
        System.out.println("Status          : "+getStatus());
        System.out.println("Pekerjaan       : "+getPekerjaan());
        System.out.println("Alamat          : "+getAlamat());
        
    }
    
    //Overloading
    public void LihatData(String status){
        System.out.println("NIK             : "+getNik());
        System.out.println("No Kelahiran    : "+this.noLahir);
        System.out.println("Nama            : "+getNama());
        System.out.println("Tampat Lahir    : "+getTempatLahir());
        System.out.println("Hari Lahir      : "+this.hariLahir);
        System.out.println("Tanggal Lahir   : "+getTanggalLahir());
        System.out.println("Keterangan      : "+this.keterangan);
        System.out.println("Jenis Kelamin   : "+getSex());
        System.out.println("Agama           : "+getAgama());
        System.out.println("Status          : "+getStatus());
        System.out.println("Pekerjaan       : "+getPekerjaan());
        System.out.println("Alamat          : "+getAlamat());
        System.out.println("Status Data     : "+status);
        
    }
}

