/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import laporan3.Indonesia;
import laporan3.Korea;



public class Jalan {
    public static void main(String[] args) {
        
        Indonesia Budi = new Indonesia();
        System.out.println("Budi berasal dari " + Budi.getAsalDaerah());
        System.out.println(Budi.makan("Seblak"));
        Budi.memasak();
        Budi.menari();
        Budi.mengoding();
        System.out.println("~~~~~~~~~~~~~");

        Korea Agus = new Korea();
        System.out.println("Agus berasal dari" + Agus.getAsalDaerah());
        System.out.println(Agus.makan(12));
    }
}
