package posttest6;

public class kematian extends penduduk {
    private long noKematian;
    private String tanggalKematian;
    private String tempatKematian;
    private String sebab;
    
    kematian(long nik, long noKematian, String nama, String tempatLahir, String tempatKematian, String tanggalLahir, String tanggalKematian, String sex, String agama, String status, String pekerjaan, String alamat, String sebab) {
        super(nik, nama, tempatLahir, tanggalLahir, sex, agama, status, pekerjaan, alamat);
        this.noKematian = noKematian;
        this.tanggalKematian = tanggalKematian;
        this.tempatKematian = tempatKematian;
        this.sebab = sebab;
    }
    
    @Override
    public void LihatData(){
        System.out.println("NIK                 : "+getNik());
        System.out.println("No Kematian         : "+this.noKematian);
        System.out.println("Nama                : "+getNama());
        System.out.println("Tampat Lahir        : "+getTempatLahir());
        System.out.println("Tempat Kematian     : "+this.tempatKematian);
        System.out.println("Tanggal Lahir       : "+getTanggalLahir());
        System.out.println("Tanggal Kematian    : "+this.tanggalKematian);
        System.out.println("Jenis Kelamin       : "+getSex());
        System.out.println("Agama               : "+getAgama());
        System.out.println("Status              : "+getStatus());
        System.out.println("Pekerjaan           : "+getPekerjaan());
        System.out.println("Alamat              : "+getAlamat());
        System.out.println("Sebab Kematian      : "+this.sebab);
    }
    
    public void LihatData(String status){
        System.out.println("NIK                 : "+getNik());
        System.out.println("No Kematian         : "+this.noKematian);
        System.out.println("Nama                : "+getNama());
        System.out.println("Tampat Lahir        : "+getTempatLahir());
        System.out.println("Tempat Kematian     : "+this.tempatKematian);
        System.out.println("Tanggal Lahir       : "+getTanggalLahir());
        System.out.println("Tanggal Kematian    : "+this.tanggalKematian);
        System.out.println("Jenis Kelamin       : "+getSex());
        System.out.println("Agama               : "+getAgama());
        System.out.println("Status              : "+getStatus());
        System.out.println("Pekerjaan           : "+getPekerjaan());
        System.out.println("Alamat              : "+getAlamat());
        System.out.println("Sebab Kematian      : "+this.sebab);
        System.out.println("Status Data         : "+status);
    }
    
}

