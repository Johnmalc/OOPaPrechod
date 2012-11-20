/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung2011;

/**
 *
 * @author petrovd
 */
public class Start {

    /**
     * @param args the command line arguments
     * Zins 2 %, stratkapital 10000 und 10 Jahren
     */
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        
        System.out.println("Print tiger1");
        
        tiger1.setFressen(100);
        tiger1.setName("honza");
        tiger1.setSchlafen (true);
        tiger1.setAlter(10);
        
        System.out.println(tiger1.getFressen());
        System.out.println(tiger1.getName());
        System.out.println(tiger1.getSchlafen());
        System.out.println(tiger1.getAlter());
        System.out.println(tiger1.brullt());
        
        System.out.println("\n");
        
        System.out.println("Print tiger2");
        
        Tiger tiger2 = new Tiger();
        
        tiger2.setFressen(80);
        tiger2.setName(" disf ");
        tiger2.setSchlafen (false);
        tiger2.setAlter(20);
        
        System.out.println(tiger2.getFressen());
        System.out.println(tiger2.getName());
        System.out.println(tiger2.getSchlafen());
        System.out.println(tiger2.getAlter());
        
    }
}
