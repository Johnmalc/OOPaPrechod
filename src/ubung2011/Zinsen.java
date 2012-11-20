/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung2011;

/**
 *
 * @author petrovd
 */
public class Zinsen {

    /**
     * @param args the command line arguments
     */
//    public static int kapital = 10000;
//    public static double rate = 0.02;
//    public static int jahr = 10;
    //public static double vys = jahr * ((rate+1) * kapital);
    
   
    public static void main(String[] args) {
        System.out.println(zinesenRekursiv(10, 0.02, 10000));
        System.out.println(neKapital);
    }

    public static double zinesenRekursiv(double jahr, double rate, double kapital) {
        //double vys = jahr * ((rate+1) * kapital);
//        if(jahr > 0){
//            System.out.println("0");
//        }
//        else { 
        if(jahr > 0){
            double a = (rate * kapital);
            double neKapital = a + kapital;
            jahr--;
            neKapital = zinesenRekursiv(jahr, rate, kapital);
        }
        neKapital = zinesenRekursiv(jahr, rate, kapital);     //}
        zinesenRekursiv(jahr, rate, kapital);
        //zinesenRekursiv();
     
     return neKapital;
    }
}
