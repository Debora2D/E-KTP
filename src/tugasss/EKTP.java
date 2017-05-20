
package tugasss;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TugasEKTP {

    public static void main(String[] args) {
        
        //penduduk pdk = new penduduk();

        
        ArrayList<penduduk> RT1 = new ArrayList<>();
        RT1.add(new penduduk("Debora Rizky", "Islam", "Perempuan", "Mahasiswa", "A", "Kartika", "01", "Madiun", "10-03-1998", "indonesia"));
        RT1.add(new penduduk("Royhan Ramadhan", "Islam", "Laki-laki", "wiraswasta", "O", "Kartika", "01", "Surabaya", "11-010-1998", "indonesia"));       
        
        
        ArrayList<penduduk> RT2 = new ArrayList<>();
        RT2.add(new penduduk("Vallerian Ariel", "Hindu", "Perempuan", "Mahasiswa", "B", "Kartika", "02", "Bali", "23-03-1998", "Indonesia"));
        RT2.add(new penduduk("Albertos Janah", "Hindu", "Perempuan", "Mahasiswa", "B", "Kartika", "02", "Bali", "23-03-1998", "Indonesia"));

        ArrayList<penduduk> RT3 = new ArrayList<>();
        RT3.add(new penduduk("Jumaidah Subhi", "kristen", "perempuan", "Wiraswasta", "AB", "kartika", "03", "makasar", "18-06-1993", "Indonesia"));
        RT3.add(new penduduk("Yaani Hita", "kristen", "perempuan", "Wiraswasta", "AB", "kartika", "03", "makasar", "18-06-1993", "Indonesia"));

        ArrayList<penduduk> RT4 = new ArrayList<>();
        RT4.add(new penduduk("Hajar Dewanta", "kristen", "perempuan", "Wiraswasta", "AB", "kartika", "03", "makasar", "18-06-1993", "Indonesia"));
        RT4.add(new penduduk("Nulman yeasim", "kristen", "perempuan", "Wiraswasta", "AB", "kartika", "03", "makasar", "18-06-1993", "Indonesia"));

        
        //DESA2
        ArrayList<penduduk> RT5 = new ArrayList<>();
        RT5.add(new penduduk("Tirta Anugrah", "Islam", "Laki-laki", "Tentara", "O", "Subur makmur", "05", "jogjakarta", "11-02-1995", "indonesia"));
        RT5.add(new penduduk("Stella Cristiani", "Kristen", "Perempuan", "pedagang", "O","Subur makmu", "05", "Papua", "06-05-1993", "indonesia"));       
        
        
        ArrayList<penduduk> RT6 = new ArrayList<>();
        RT6.add(new penduduk("Nina Antari", "Islam", "PerempuDan", "Mahasiswa", "B", "Subur Makmur", "06", "sumatra", "01-12-1997", "Indonesia"));
        RT6.add(new penduduk("Valin Furin", "Islam", "Perempuan", "Guru", "A", "Subur makmur", "06", "banyuwangi", "09-06-1995", "Indonesia"));

        ArrayList<penduduk> RT7 = new ArrayList<>();
        RT7.add(new penduduk("Turin Karti", "kristen", "perempuan", "Wiraswasta", "AB", "subur makmur", "07", "malang", "19-05-1993", "Indonesia"));
        RT7.add(new penduduk("Titania Asifa", "Islam", "perempuan", "pedagang", "AB", "subur makmur", "07", "pandaan", "07-06-1996", "Indonesia"));

        ArrayList<penduduk> RT8 = new ArrayList<>();
        RT8.add(new penduduk("Denis Rananda", "hindu", "laki-laki", "polisi", "O", "Subur makmur", "08", "makasar", "18-10-1998", "Indonesia"));
        RT8.add(new penduduk("Toni Tikno", "Islam", "laki-laki", "polisi", "A", "Subur makmur", "08", "tuban", "10-06-1993", "Indonesia"));


        HashMap<String, penduduk> Sukorame = new HashMap<>();
        Sukorame.put("Debora", RT1.get(0));
        Sukorame.put("Royhan", RT1.get(1));
        Sukorame.put("Valleran", RT2.get(0));
        Sukorame.put("Albertos", RT2.get(1));
        Sukorame.put("Jumaidah", RT3.get(0));
        Sukorame.put("Yaani", RT3.get(1));
        Sukorame.put("Nulman", RT4.get(0));
        Sukorame.put("Hajar", RT4.get(1));
        Sukorame.put("Tirta", RT5.get(0));
        Sukorame.put("Stella", RT5.get(1));
        Sukorame.put("Nina", RT6.get(0));
        Sukorame.put("Valin", RT6.get(1));
        Sukorame.put("Turin", RT7.get(0));
        Sukorame.put("Titania", RT7.get(1));
        Sukorame.put("Denis", RT8.get(0));
        Sukorame.put("Toni", RT8.get(1));
        
        
        Collections.sort(RT1);
        Collections.sort(RT2);
       Collections.sort(RT3);
       Collections.sort(RT4);
       Collections.sort(RT5);
       Collections.sort(RT6);
       Collections.sort(RT7);
       Collections.sort(RT8);
       
        
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Nama penduduk yang hilang : ");
        String input = scn.nextLine();
        
        if(Sukorame.containsKey(input)==true){

             System.out.println(Sukorame.get(input).getnama()+"\t"+Sukorame.get(input).getagama()+"\t"+Sukorame.get(input).getJeniskelamin()+"\t"+Sukorame.get(input).getpekerjaan()+"\t"+Sukorame.get(input).getgoldar()+"\t"+Sukorame.get(input).getkelurahan()+"\t"+Sukorame.get(input).getRt()+"\t"+Sukorame.get(input).gettempatLahir()+"\t"+Sukorame.get(input).gettanggalLahir()+"\t"+Sukorame.get(input).getkewarganegaraan());
        }
        else
            System.out.println("Data Tidak ada");
        
    }

}
