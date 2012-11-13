/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ubung1311;
/**
 *
 * @author petrovd
 */
public class Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car auto1 = new Car();
       //Car auto2 = new Car("Hans", "WM", 20.0);
       //auto2.setName("Susu");
       auto1.setName("ddv");
       auto1.setTanken(90);
       auto1.setPs(50);
       auto1.setSauber(); // bei zweiten ist das true
       
       auto1.getPs();
       //System.out.println(auto1.getNeuerTanken);
       System.out.println(auto1.getNeuerTanken());
       System.out.println(auto1.getName());
       System.out.println(auto1.getPs());
        System.out.println(auto1.getSauber());
       //System.out.println(auto1);
       
       //50fahren
       //100 fahren
       // tanken
       //auto1.
               
//       auto1.getTankStatus();
       
        
    }
}
