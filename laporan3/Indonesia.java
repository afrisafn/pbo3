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
public class Indonesia extends Manusia implements Chef, Penari, Programmer {

    public void setAsalDaerah() {
        super.setAsalDaerah("Surabaya");

    }

    public Indonesia() {
        this.setAsalDaerah();
    }

    public void memasak() {
        System.out.println("Saya sedang memasak");
    }
    
    @Override
    public void menari() {
        System.out.println("Saya sedang menari");
    }

    @Override
    public void mengoding() {
        System.out.println("Saya sedang membuat aplikasi");
    }
    
    public String makan (String menuMakanan){
        return "i am makan " + menuMakanan;
        
    }

}
