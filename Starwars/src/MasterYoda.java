/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COZUM
 */
public class MasterYoda extends Karakter{
    private double can;
    public MasterYoda(String karakter_ad, String tur, Lokasyon lokasyon,double can) {
        super(karakter_ad, tur, lokasyon);
        this.can=3;
    }

    public double getCan() {
        return can;
    }

    public void setCan(double can) {
        this.can = can;
    }
    
    
    
}
