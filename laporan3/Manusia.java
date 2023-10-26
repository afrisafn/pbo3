/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan3;

/**
 *
 * @author fauziah
 */
public class Manusia {

    private String asalDaerah;
    private String makananKesukaan;

    /**
     * @return the asalDaerah
     */
    public String getAsalDaerah() {
        return asalDaerah;
    }

    /**
     * @return the makananKesukaan
     */
    public String getMakananKesukaan() {
        return makananKesukaan;
    }

    /**
     * @param asalDaerah the asalDaerah to set
     */
    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }

    /**
     * @param makananKesukaan the makananKesukaan to set
     */
    public void setMakananKesukaan(String makananKesukaan) {
        this.makananKesukaan = makananKesukaan;
    }

    public String makan (String menuMakanan){
        return "Saya makan " + menuMakanan;
        
    }
    
    public String makan (int waktu) {
        return "Saya makan pada pukul " + waktu;
        
    }
         
}
