/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan50.energikinetik;

/**
 *
 * @author
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * NIM      : 10118085
 * Deskripsi Program : Membuat program berbasis object untuk menghitung
 * energi kinetik dan usaha
 */
public class PBO210118085Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik energi = new EnergiKinetik();
        energi.setMassa(145);
        energi.setKecepatan(25);
        System.out.println("====Program Penghitung Energi Kinetik====");
        System.out.println("Massa Baseball = " + energi.getMassa() + " gram");
        System.out.println("Kecepatan = " + energi.getKecepatan() + " m/s");
        System.out.println("Energi Kinetik = " + energi.hitungEnergiKinetik() + " Joule");
        System.out.println("Usaha = " + energi.hitungUsaha()+ " Joule");
    }
    
}