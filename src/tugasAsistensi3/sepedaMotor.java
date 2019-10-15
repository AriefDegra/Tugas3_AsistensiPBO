/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasAsistensi3;

/**
 *
 * @author Arief Anugrah
 */
public class sepedaMotor extends Kendaraan{
    private String namaKendaraan;
    private String tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;
    
    public sepedaMotor(){
        this.namaKendaraan = "Default Original";
        this.tipeKendaraan = "Default Tipe Original";
        this.kapasitasMesin = 1;
        this.bahanBakar = 1;
    }
    public sepedaMotor(String nK, String tK, int kM, float bB){
        super(bB);
        this.namaKendaraan = nK;
        this.tipeKendaraan = tK;
        this.kapasitasMesin = kM;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public void infoKendaraan(){
        System.out.println("Nama kendaraan          : "+getNamaKendaraan());
        System.out.println("Tipe Kendaraan          : "+getTipeKendaraan());
        System.out.println("Kapasitas mesin         : "+getKapasitasMesin());
    }
}
