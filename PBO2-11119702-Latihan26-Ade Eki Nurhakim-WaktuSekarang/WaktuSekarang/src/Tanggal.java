/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekiw
 */
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

public class Tanggal{  
   
    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
       
    public static void main(String Args[]){  
        Tanggal tgl = new Tanggal();  
        System.out.println("Sekarang tanggal : "+tgl.getTanggal()); 
        System.out.println("Waktu sekarang : "+tgl.getWaktu());
    }  
}

