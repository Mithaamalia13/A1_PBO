package posttest6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    //variabel global array
    static ArrayList<Long> data_nik = new ArrayList<>();
    static ArrayList<String> data_nama = new ArrayList<>();
    static ArrayList<String> data_tempat = new ArrayList<>();
    static ArrayList<String> data_tanggal = new ArrayList<>();
    static ArrayList<String> data_sex = new ArrayList<>();
    static ArrayList<String> data_agama = new ArrayList<>();
    static ArrayList<String> data_status = new ArrayList<>();
    static ArrayList<String> data_pekerjaan = new ArrayList<>();
    static ArrayList<String> data_alamat = new ArrayList<>();
    
    static Scanner input = new Scanner(System.in);
    
    public static void clearScreen() {
        try  
            {  
            final String os = System.getProperty("os.name");  
            if (os.contains("Windows"))  
            {  
            Runtime.getRuntime().exec("cls");  
            }  
            else  
            {  
            Runtime.getRuntime().exec("clear");  
            }  
            }  
            catch (final IOException e)  
            {  
            }   
    }
    
    static void tampil(){
        clearScreen();
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t========================================");
        System.out.println("\t\t\t=  PROGRAM DATA PENDUDUK KAB.SUMEDANG  =");
        System.out.println("\t\t\t=                oleh :                =");
        System.out.println("\t\t\t=        2009106028-MITHA AMALIA       =");
        System.out.println("\t\t\t========================================");
        
        System.out.print("\n\t\t\ttekan [ENTER] untuk melanjutkan....");
        input.nextLine();
    }
    
    static void back_to_menu() {
    System.out.println("");
    System.out.print("Tekan [Enter] untuk kembali..");
    input.nextLine();
    clearScreen();
    }
    
    static void tambahData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    =============================");
        System.out.println("\t\t\t    =  MENGINPUT DATA PENDUDUK  =");
        System.out.println("\t\t\t    =============================");
        System.out.print("Masukan banyak data       : ");
        int banyak = input.nextInt();
        for(int y = 0 ; y < banyak; y++){
            System.out.print("Masukkan NIK              : ");
            long nik = input.nextLong();
            input.nextLine();
            data_nik.add(nik);
            System.out.print("Masukkan Nama             : ");
            String nama = input.nextLine();
            data_nama.add(nama);
            System.out.print("Masukkan Tempat Lahir     : ");
            String tempatLahir = input.nextLine();
            data_tempat.add(tempatLahir);
            System.out.print("Masukkan Tanggal Lahir    : ");
            String tanggalLahir = input.nextLine();
            data_tanggal.add(tanggalLahir);
            System.out.print("Masukkan Jenis Kelamin    : ");
            String sex = input.nextLine();
            data_sex.add(sex);
            System.out.print("Masukkan Agama            : ");
            String agama = input.nextLine();
            data_agama.add(agama);
            System.out.print("Masukkan Status           : ");
            String status = input.nextLine();
            data_status.add(status);
            System.out.print("Masukkan Pekerjaan        : ");
            String pekerjaan = input.nextLine();
            data_pekerjaan.add(pekerjaan);
            System.out.print("Masukkan Alamat           : ");
            String alamat = input.nextLine();
            data_alamat.add(alamat);

            penduduk Data = new penduduk(nik, nama, tempatLahir, tanggalLahir, sex, agama, status, pekerjaan, alamat);
            System.out.println("\n");
            Data.dataDitambah();
            Data.getNik();
            Data.getNama();
            Data.getTempatLahir();
            Data.getTanggalLahir();
            Data.getSex();
            Data.getAgama();
            Data.getStatus();
            Data.getPekerjaan();
            Data.getAlamat();
            System.out.println("DITAMBAHKAN DENGAN GETTER");
            System.out.println("NIK             : " + Data.getNik());
            System.out.println("NAMA            : " + Data.getNama());
            System.out.println("TEMPAT LAHIR    : " + Data.getTempatLahir());
            System.out.println("TANGGAL LAHIR   : " + Data.getTanggalLahir());
            System.out.println("JENIS KELAMIN   : " + Data.getSex());
            System.out.println("AGAMA           : " + Data.getAgama());
            System.out.println("STATUS          : " + Data.getStatus());
            System.out.println("PEKERJAAN       : " + Data.getPekerjaan());
            System.out.println("ALAMAT          : " + Data.getAlamat() + "\n\n");
        }
        back_to_menu();
    }
    
    static void lihatData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
        System.out.println("\t\t\t    ===============================");
        if(data_nik.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_nik.size(); y++){
            System.out.println("PENDUDUK KE-" + (y+1));
            System.out.println("NIK            : "+data_nik.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("Tempat lahir   : "+data_tempat.get(y));
            System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
            System.out.println("Jenis kelamin  : "+data_sex.get(y));
            System.out.println("Agama          : "+data_agama.get(y));
            System.out.println("Status         : "+data_status.get(y));
            System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
            System.out.println("Alamat         : "+data_alamat.get(y));
            System.out.println("=====================");
             }
        }
        back_to_menu();
    }
    
    
    static void editData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
        System.out.println("\t\t\t    ===============================");
        if(data_nik.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_nik.size(); y++){
            System.out.println("PENDUDUK KE-" + (y+1));
            System.out.println("NIK            : "+data_nik.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("Tempat lahir   : "+data_tempat.get(y));
            System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
            System.out.println("Jenis kelamin  : "+data_sex.get(y));
            System.out.println("Agama          : "+data_agama.get(y));
            System.out.println("Status         : "+data_status.get(y));
            System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
            System.out.println("Alamat         : "+data_alamat.get(y));
            System.out.println("=====================");
             }
        }
        
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =    MENGUBAH DATA PENDUDUK   =");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data penduduk yang diubah : ");
        int edit = input.nextInt();
        System.out.println("SILAHKAN UBAH DATA!");
        System.out.print("Masukan nik           : ");
        long nik2 = input.nextLong();
        data_nik.set((edit-1), nik2);
        input.nextLine(); //biar ga lompat 
        System.out.print("Masukan nama          : ");
        String nama2 = input.nextLine();
        data_nama.set((edit-1), nama2);
        System.out.print("Masukan tempat        : ");
        String tempat2 = input.nextLine();
        data_tempat.set((edit-1),tempat2);
        System.out.print("Masukan tanggal lahir : ");
        String tanggal2 = input.nextLine();
        data_tanggal.set((edit-1),tanggal2);
        System.out.print("Masukan jenis kelamin : ");
        String sex2 = input.nextLine();
        data_sex.set((edit-1),sex2);
        System.out.print("Masukan agama         : ");
        String agama2 = input.nextLine();
        data_agama.set((edit-1),agama2);
        System.out.print("Masukan status        : ");
        String status2 = input.nextLine();
        data_status.set((edit-1),status2);
        System.out.print("Masukan pekerjaan     : ");
        String pekerjaan2 = input.nextLine();
        data_pekerjaan.set((edit-1),pekerjaan2);
        System.out.print("Masukan alamat        : ");
        String alamat2 = input.nextLine();
        data_alamat.set((edit-1),alamat2);
        
        penduduk data = new penduduk (nik2, nama2, tempat2, tanggal2, sex2,agama2, status2, pekerjaan2, alamat2);
        System.out.println(" ");
        data.dataDiubah();
        data.setNik(nik2);
        data.setNama(nama2);
        data.setTempatLahir(tempat2);
        data.setTanggalLahir(tanggal2);
        data.setSex(sex2);
        data.setAgama(agama2);
        data.setStatus(status2);
        data.setPekerjaan(pekerjaan2);
        data.setAlamat(alamat2);
        System.out.println("DIUBAH DENGAN SETTER");
        System.out.println("NIK             : " + data.getNik());
        System.out.println("NAMA            : " + data.getNama());
        System.out.println("TEMPAT LAHIR    : " + data.getTempatLahir());
        System.out.println("TANGGAL LAHIR   : " + data.getTanggalLahir());
        System.out.println("JENIS KELAMIN   : " + data.getSex());
        System.out.println("AGAMA           : " + data.getAgama());
        System.out.println("STATUS          : " + data.getStatus());
        System.out.println("PEKERJAAN       : " + data.getPekerjaan());
        System.out.println("ALAMAT          : " + data.getAlamat() + "\n\n");
        back_to_menu();
    }
   
    
    static void hapusData(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA PENDUDUK KAB. SUMEDANG =");
        System.out.println("\t\t\t    ===============================");
        if(data_nik.isEmpty()) System.out.println("Data Kosong!");
        else{
            for(int y = 0; y < data_nik.size(); y++){
            System.out.println("PENDUDUK KE-" + (y+1));
            System.out.println("NIK            : "+data_nik.get(y));
            System.out.println("Nama           : "+data_nama.get(y));
            System.out.println("Tempat lahir   : "+data_tempat.get(y));
            System.out.println("Tanggal lahir  : "+data_tanggal.get(y));
            System.out.println("Jenis kelamin  : "+data_sex.get(y));
            System.out.println("Agama          : "+data_agama.get(y));
            System.out.println("Status         : "+data_status.get(y));
            System.out.println("Pekerjaan      : "+data_pekerjaan.get(y));
            System.out.println("Alamat         : "+data_alamat.get(y));
            System.out.println("=====================");
             }
        }
        
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =   MENGHAPUS DATA PENDUDUK   =");
        System.out.println("\t\t\t    ===============================");
        System.out.print("Data penduduk yang dihapus : ");
        int hapus = input.nextInt();
        data_nik.remove((hapus-1));
        data_nama.remove((hapus-1));
        data_tempat.remove((hapus-1));
        data_tanggal.remove((hapus-1));
        data_sex.remove((hapus-1));
        data_agama.remove((hapus-1));
        data_status.remove((hapus-1));
        data_pekerjaan.remove((hapus-1));
        data_alamat.remove((hapus-1));
        
        System.out.println("DATA BERHASIL DIHAPUS!");
        back_to_menu();
    }
    
    static void dataKelahiran(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =     INPUT DATA KELAHIRAN    =");
        System.out.println("\t\t\t    ===============================\n");
        System.out.print("Masukkan NIK                  : ");
        long nik4 = input.nextLong();
        System.out.print("Masukkan No Kelahiran         : ");
        long no_kelahiran = input.nextLong();
        input.nextLine();
        System.out.print("Masukkan Nama                 : ");
        String nama4 = input.nextLine();
        System.out.print("Masukkan Tempat Lahir         : ");
        String tl4 = input.nextLine();
        System.out.print("Masukkan Hari Lahir           : ");
        String hr = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir        : ");
        String tgll4 = input.nextLine();
        System.out.print("Keterangan                    : ");
        String ket = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin        : ");
        String jk4 = input.nextLine();
        System.out.print("Masukkan Agama                : ");
        String agm4 = input.nextLine();
        System.out.print("Masukkan Status               : ");
        String st4 = input.nextLine();
        System.out.print("Masukkan Pekerjaan            : ");
        String pk4 = input.nextLine();
        System.out.print("Masukkan Alamat               : ");
        String al4 = input.nextLine();
        kelahiran lahir = new kelahiran(nik4,no_kelahiran,nama4,tl4,hr,tgll4,ket,jk4,agm4,st4,pk4,al4);
        
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =         DATA KELAHIRAN      =");
        System.out.println("\t\t\t    ===============================");
        kelahiran mitha = new kelahiran(327702530, 1222, "Mitha Amalia", "Bandung", "Rabu", "13 Februari 2002", "WNI","Wanita","Islam","Belum Kawin","IRT","Buahdua");
        lahir.LihatData();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA YANG SUDAH TERVALIDASI =");
        System.out.println("\t\t\t    ===============================");
        mitha.LihatData("Data Kelahiran Sudah Terdaftar");
        
        
        back_to_menu();
    }
    
    static void dataKematian(){
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =      INPUT DATA KEMATIAN    =");
        System.out.println("\t\t\t    ===============================\n");
        System.out.print("Masukkan NIK                  : ");
        long nik3 = input.nextLong();
        System.out.print("Masukkan No Kematian          : ");
        long no_kematian = input.nextLong();
        input.nextLine();
        System.out.print("Masukkan Nama                 : ");
        String nama3 = input.nextLine();
        System.out.print("Masukkan Tempat Lahir         : ");
        String tl = input.nextLine();
        System.out.print("Masukkan Tempat Kematian      : ");
        String tk = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir        : ");
        String tgll = input.nextLine();
        System.out.print("Masukkan Tanggal Kematian     : ");
        String tglk = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin        : ");
        String jk = input.nextLine();
        System.out.print("Masukkan Agama                : ");
        String agm = input.nextLine();
        System.out.print("Masukkan Status               : ");
        String st = input.nextLine();
        System.out.print("Masukkan Pekerjaan            : ");
        String pk = input.nextLine();
        System.out.print("Masukkan Alamat               : ");
        String al = input.nextLine();
        System.out.print("Masukkan Sebab                : ");
        String sb = input.nextLine();
        kematian Mati = new kematian (nik3,no_kematian,nama3,tl,tk,tgll,tglk,jk,agm,st,pk,al,sb);
        
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    =         DATA KEMATIAN       =");
        System.out.println("\t\t\t    ===============================");
        kematian Mati1 = new kematian(32423420,33223,"Tasih","Sumedang","Sumedang","19 September 1960","31 Desember 2015","Wanita","Islam","kawin","IRT","Dusun Pangkalan","Sakit");
        Mati.LihatData();
        System.out.println("==================================================================");
        Mati1.LihatData();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t    ===============================");
        System.out.println("\t\t\t    = DATA YANG SUDAH TERVALIDASI =");
        System.out.println("\t\t\t    ===============================");
        Mati.LihatData("Data Kematian Sudah Terdaftar");
        back_to_menu();
    }
    
    static void Wilayah(){
        Scanner input = new Scanner(System.in);
        clearScreen();
        System.out.println("\t\t\t==========================");
        System.out.println("\t\t\t=      DATA WILAYAH      =");
        System.out.println("\t\t\t==========================");
        System.out.println("\t\t\t=[1] WILAYAH I           =");
        System.out.println("\t\t\t=[2] WILAYAH II          =");
        System.out.println("\t\t\t=[3] WILAYAH III         =");
        System.out.println("\t\t\t=[4] WILAYAH IV          =");
        System.out.println("\t\t\t=[5] WILAYAH V           =");
        System.out.println("\t\t\t=[6] WILAYAH VI          =");
        System.out.println("\t\t\t=[0] BACK TO MENU        =");
        System.out.println("\t\t\t==========================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihWilayah = input.nextInt();
        if(pilihWilayah == 1){
            clearScreen();
            System.out.println("\n\t\t\t=   DATA WILAYAH I SUMEDANG    =");
            kecamatan wilayah1 = new kecamatan(1,"Sumedang Utara",2000);
            wilayah1.wilayah1();
            
            kecamatan wilayah2 = new kecamatan(2,"Sumedang Selatan",5000);
            wilayah2.wilayah1();
            
            kecamatan wilayah3 = new kecamatan(3,"Ganeas",1000);
            wilayah3.wilayah1();
            
            back_to_menu();
        }
        else if(pilihWilayah == 2){
            clearScreen();
            System.out.println("\n\t\t\t=   DATA WILAYAH II SUMEDANG    =");
            kecamatan wilayah1 = new kecamatan(4,"Cisarua",2500);
            wilayah1.wilayah2();
            
            kecamatan wilayah2 = new kecamatan(5,"Cimalaka",3000);
            wilayah2.wilayah2();
            
            kecamatan wilayah3 = new kecamatan(6,"Tanjungkerta",4000);
            wilayah3.wilayah2();
            
            kecamatan wilayah4 = new kecamatan(7,"Tanjungmedar",1000);
            wilayah4.wilayah2();
            
            kecamatan wilayah5 = new kecamatan(8,"Surian",900);
            wilayah5.wilayah2();
            
            kecamatan wilayah6 = new kecamatan(9,"Buahdua",6000);
            wilayah6.wilayah2();
            
            back_to_menu();
        }
        else if(pilihWilayah == 3){
            clearScreen();
            System.out.println("\n\t\t\t=   DATA WILAYAH III SUMEDANG    =");
            kecamatan wilayah1 = new kecamatan(10,"Conggeang",2500);
            wilayah1.wilayah3();
            
            kecamatan wilayah2 = new kecamatan(11,"Ujung Jaya",3000);
            wilayah2.wilayah3();
            
            kecamatan wilayah3 = new kecamatan(12,"Paseh",4000);
            wilayah3.wilayah3();
            
            kecamatan wilayah4 = new kecamatan(13,"Tomo",1000);
            wilayah4.wilayah3();
            
            kecamatan wilayah5 = new kecamatan(14,"Jatigede",900);
            wilayah5.wilayah3();
            
            kecamatan wilayah6 = new kecamatan(15,"Jatinunggal",6000);
            wilayah6.wilayah3();
            
            back_to_menu();
        }
        else if(pilihWilayah == 4){
            clearScreen();
            System.out.println("\n\t\t\t=   DATA WILAYAH IV SUMEDANG    =");
            kecamatan wilayah1 = new kecamatan(16,"Situraja",2500);
            wilayah1.wilayah4();
            
            kecamatan wilayah2 = new kecamatan(17,"Cisitu",3000);
            wilayah2.wilayah4();
            
            kecamatan wilayah3 = new kecamatan(18,"Darmaraja",4000);
            wilayah3.wilayah4();
            
            kecamatan wilayah4 = new kecamatan(19,"Wado",1000);
            wilayah4.wilayah4();
            
            kecamatan wilayah5 = new kecamatan(20,"Cibugel",900);
            wilayah5.wilayah4();
            
            back_to_menu();
        }
        else if(pilihWilayah == 5){
            clearScreen();
            System.out.println("\n\t\t\t=   DATA WILAYAH V SUMEDANG    =");
            kecamatan wilayah1 = new kecamatan(21,"Cimanggung",2500);
            wilayah1.wilayah5();
            
            kecamatan wilayah2 = new kecamatan(22,"Jatinangor",3000);
            wilayah2.wilayah5();
            
            back_to_menu();
        }
        else if(pilihWilayah == 6){
            clearScreen();
            System.out.println("\n\t\t\t=   DATA WILAYAH VI SUMEDANG    =");
            kecamatan wilayah1 = new kecamatan(23,"Rancakalong",2500);
            wilayah1.wilayah6();
            
            kecamatan wilayah2 = new kecamatan(24,"Pamulihan",3000);
            wilayah2.wilayah6();
            
            kecamatan wilayah3 = new kecamatan(25,"Tanjungsari",4000);
            wilayah3.wilayah6();
            
            kecamatan wilayah4 = new kecamatan(26,"Sukasari",1000);
            wilayah4.wilayah6();
            
            back_to_menu();
        }
        else if(pilihWilayah == 0){
            menu();
        }
        
        else{
            System.out.println("PILIHAN TIDAK ADA DI MENU!");
            input.nextLine();
        }
    }
    
    static void menu(){
        Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t======================================");
        System.out.println("\t\t\t= PROGRAM DATA PENDUDUK KAB.SUMEDANG =");
        System.out.println("\t\t\t= [1] Create data Penduduk           =");
        System.out.println("\t\t\t= [2] Read Data Penduduk             =");
        System.out.println("\t\t\t= [3] Update Data Penduduk           =");
        System.out.println("\t\t\t= [4] Delete Data Penduduk           =");
        System.out.println("\t\t\t= [5] Data Kelahiran                 =");
        System.out.println("\t\t\t= [6] Data Kematian                  =");
        System.out.println("\t\t\t= [7] Data Wilayah                   =");
        System.out.println("\t\t\t= [0] Exit                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        
        switch(pilihMenu){
            case 0 :
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.out.println("\t\t\t=                                                =");
                System.out.println("\t\t\t===    PROGRAM DATA PENDUDUK KAB. SUMEDANG     ===");
                System.exit(0);
                
            case 1 :
                tambahData();
                break;
                
            case 2 :
                lihatData();
                break;
                
            case 3 :
                editData();
                break;
            
            case 4 :
                hapusData();
                break;
             
            case 5 :
                dataKelahiran();
                break;
                
            case 6 :
                dataKematian();
                break;
                
            case 7 :
                Wilayah();
                break;
                
            default :
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                back_to_menu();
        }
    }
    
    public static void main(String[] args) {
        tampil();
        while(true){
            menu();
        }
    }
    
}


