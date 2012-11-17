/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung1311;

/**
 *
 * @author petrovd
 */
public class Car {
    // variablen
       String name;
       String marke;
       double tank;
       int ps;
       // false standartmasig  
       boolean Sauber;
    
    // kontruktor 
    public Car() {
       name = "NoN";    
       marke = "sdf"; 
       tank = 20.0; 
       ps = 0;
       Sauber = false; 
    }
    // methoden
    public Car(String NN, String MM, double TT) {
        name = NN;
        marke = MM;
        tank = TT;
    }
       
    public void setName(String NeuerName) {
        name = NeuerName;
          
    }
    public String getName() {
        return name;
    }
    
    public void setTanken(double NeuerTanken) {
        tank = NeuerTanken + tank;
    }
    public double getNeuerTanken() {
        return tank;
    }
    public void setPs(int neuePs) {
        ps = ps;
    }
    public int getPs() {
        return ps;
    }
//    public void setSauber(boolean SauberX) {
//      Sauber = SauberX;
//    }
//    public boolean getSauber() {
//        return Sauber;
//    }
    public void setSauber() {
      Sauber = true;
    }
    public boolean getSauber() {
        return Sauber;
    }
//    public String getTankStatus() {
//        Tank = neuerTank + 50;
//    }
}
