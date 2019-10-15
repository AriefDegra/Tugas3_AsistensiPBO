/*
INPUT BERUPA HARD CODE
*/
package tugasAsistensi3;

/**
 *
 * @author Arief Anugrah
 */
public class kendaraanMain {
    public static void main(String[] args) {
        System.out.println("KENDARAAN MOBIL");
        System.out.println(" ");
        
       Mobil m1 = new Mobil();
       m1.setNamaKendaraan("Daihatsu");
       m1.setTipeKendaraan("Minibus");
       m1.setKapasitasMesin(1000);
       m1.infoKendaraan();
       
       Kendaraan k1 = new Kendaraan();
       k1.setidKendaraan(15101901);
       k1.setJarakTempuhAwal(100);
       k1.setJarakTempuh(100);
       k1.setBahanBakar(100);
       k1.infoKendaraan();
       
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");
        
        System.out.println("KENDARAAN MOTOR");
        System.out.println(" ");
        
       sepedaMotor sM1 = new sepedaMotor();
       sM1.setNamaKendaraan("Kawasaki");
       sM1.setTipeKendaraan("Non - Matic");
       sM1.setKapasitasMesin(250);
       sM1.infoKendaraan();
       
       Kendaraan k2 = new Kendaraan();
       k2.setidKendaraan(15101902);
       k2.setJarakTempuhAwal(25);
       k2.setJarakTempuh(50);
       k2.setBahanBakar(100);
       k2.infoKendaraan();
    }
}
