/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusekarang;

/**
 *
 * @author Ekiw
 */
import java.util.*;
public class WaktuSekarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    int detik, menit, jam, hari, bulan, tahun;
    GregorianCalendar date = new GregorianCalendar();
    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    detik = date.get(Calendar.SECOND);
    menit = date.get(Calendar.MINUTE);
    jam =  date.get(Calendar.HOUR_OF_DAY);
    hari = date.get(Calendar.DAY_OF_MONTH);
    bulan = date.get(Calendar.MONTH);
    tahun = date.get(Calendar.YEAR);
    System.out.println("Tanggal sekarang: "+hari+" "+namabulan[bulan]+" "+tahun);
    System.out.println("Waktu sekarang: "+jam+":"+menit+":"+detik);
  }
}

