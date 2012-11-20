/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung2011;

/**
 *
 * @author petrovd
 */
public class Tiger {
    
    String name;
    int alter;
    int food;
    boolean Schlafen;
    
    public Tiger() {

    }
    public void setFressen(int foodx) {
       food = foodx*5;
    }
    public int getFressen() {
        return food;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setSchlafen (boolean Schlafen) {
        this.Schlafen = Schlafen;
    }
    public boolean getSchlafen() {
        return Schlafen;
    }
    
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }
    public String brullt() {
       String a = "meine tiger brullt";
       return a;
    }
}
