package tugasAsistensi3;

/**
 *
 * @author Arief Anugrah
 */
public class Kendaraan {
    private int idKendaraan;
    private float bahanBakar;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;

    public Kendaraan(){
        this.idKendaraan = 1;
        this.jarakTempuhAwal = 0;
        this.jarakTempuh = 0;
        this.bahanBakar = 1;
    }
    public Kendaraan(int idK, float bB, float jTA, float jT){
        this.idKendaraan = idK;
        this.jarakTempuhAwal = jTA;
        this.jarakTempuh = jT;
        this.bahanBakar = bB;
    }
    public Kendaraan(float bB){
        this.bahanBakar = bB;
    }

    public int getidKendaraan() {
        return idKendaraan;
    }
    public void setidKendaraan(int idK){
        this.idKendaraan = idK;
    }
    
    public float getBahanBakar(){
        return bahanBakar;
    }
    public void setBahanBakar(float bb){
        this.bahanBakar = bb;  
    }
    
    public float getJarakTempuhAwal(){
        return jarakTempuhAwal;
    }
    public void setJarakTempuhAwal(float jTA){
        this.jarakTempuhAwal = jTA;
    }
    
    public float getJarakTempuh(){
        return jarakTempuh;
    }
    public void setJarakTempuh(float jT){
        this.jarakTempuh = jT;
    }
    
    public float totalJarak(){
        float tJ;
        tJ = this.jarakTempuhAwal + this.jarakTempuh;
        return tJ;
    }
    
    public float cekJarakTempuh(){
        float jT;
        if(getJarakTempuh() > 0 && getJarakTempuh() <= 500){
            jT = jarakTempuh;
        }else{
            jT = 0;
        }
        return jT;
    }
    
    public float cekBahanBakar(){
        float bB;
        if(getBahanBakar() > 0 && getBahanBakar() <= 500){
            bB = bahanBakar;
        }else{
            bB = 0;
        }
        return bB;
    }
    public float efektifitas(){
        float e;
        e = (float)Math.pow(Math.E,(cekJarakTempuh()/cekBahanBakar()));
        float E;
        E = (float)(e*Math.log10(2));
        return E;
        
    }
    
    public String cekEfektifitas(){
        String cE;
        if(efektifitas() >= 0 && efektifitas() <= 0.5){
            cE = "Mesin Efektif";
        }else{
            cE = "Mesin tidak Efektif";
        }
        return cE;
        
    }
    
    public void infoKendaraan(){
        System.out.println("ID Kendaraan            : "+getidKendaraan());
        System.out.println("Total Jarak             : "+totalJarak());
        System.out.println("Bahan Bakar             : "+getBahanBakar());
        System.out.println("Nilai Efektifitas       : "+efektifitas());
        System.out.println("Keefektifitasan Mesin   : "+cekEfektifitas());

    }
}

