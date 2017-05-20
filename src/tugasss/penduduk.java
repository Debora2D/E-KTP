/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class penduduk implements Comparable <penduduk>{

    private String nama, agama, jeniskelamin, pekerjaan, golongandarah, desa, RT, tempatlahir, tanggallahir, asalnegara;

    public penduduk() {

    }

    public penduduk(String nama, String agama, String jeniskelamin, String pekerjaan, String golongandarah, String desa, String RT, String tempatlahir, String tanggallahir, String asalnegara) {
        this.nama = nama;
        this.agama = agama;
        this.jeniskelamin = jeniskelamin;
        this.pekerjaan = pekerjaan;
        this.golongandarah = golongandarah;
        this.desa = desa;
        this.RT = RT;
        this.tempatlahir = tempatlahir;
        this.tanggallahir = tanggallahir;
        this.asalnegara = asalnegara;
    }

    public String getnama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getagama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJenisKelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getpekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getgoldar() {
        return golongandarah;
    }

    public void setgolongandarah(String golongandarah) {
        this.golongandarah = golongandarah;
    }

    public String getkelurahan() {
        return desa;
    }

    public void setKelurahan(String kelurahan) {
        this.desa = kelurahan;
    }

    public String getRt() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String gettempatLahir() {
        return tempatlahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatlahir = tempatLahir;
    }

    public String gettanggalLahir() {
        return tanggallahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getkewarganegaraan() {
        return asalnegara;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.asalnegara = kewarganegaraan;
    }

    @Override
    public int compareTo(penduduk t) {
        if(nama.compareTo(t.getnama()) < 0 ) return -1;
        if(nama.compareTo(t.getnama()) == 0 ) return 0;
        return 1;}
}
