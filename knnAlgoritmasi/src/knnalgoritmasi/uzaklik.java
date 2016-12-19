/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knnalgoritmasi;

/**
 *
 * @author Günevi
 */
public class uzaklik implements Comparable<uzaklik>{
     double deger;
     String nesne;

    public double getDeger() {
        return deger;
    }

    public void setDeger(double deger) {
        this.deger = deger;
    }

    public String getNesne() {
        return nesne;
    }

    public void setNesne(String nesne) {
        this.nesne = nesne;
    }
     
      @Override
    public int compareTo(uzaklik o) {
        return new Double(this.deger).compareTo(o.deger);
    }
}
