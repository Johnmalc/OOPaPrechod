package aufgabe8Znova;

public class Main {

  public static void main(String[] args) {
    /*
     * Name + Special ID + rate
     */
        
    SuperKlasse[] auf8 = new SuperKlasse[3];
    auf8[0] = new Aktien("Goldman Sachs", 154758);
    auf8[1] = new Aktienfonds("Microsoft", 254758);
    auf8[2] = new Rentefonds("Fiat AG", 354758);

    
    System.out.println(auf8[0].toString());
    System.out.println(auf8[1].toString());
    System.out.println(auf8[2].toString());

    System.out.println();

    
    auf8[0].setKursSetzen(65.954);
    auf8[1].setKursSetzen(54.8);
    auf8[2].setKursSetzen(1589.8);

    
    auf8[0].setKaufenStuckzahl(50);
    auf8[1].setKaufenStuckzahl(60);
    auf8[2].setKaufenStuckzahl(60);
    
    // andern
    auf8[0].setVerkaufenStuckzahl(10);
    
//    if(auf8[2].getVerkaufenStuckzahl() >= auf8[2].getKaufenStuckzahl()) {
//      System.out.println("Sie konnen nicht merh verkaufen als kaufen");
//    }
    
    System.out.println(auf8[0].getVerkaufenStuckzahl());

    System.out.printf("%.2f \n", auf8[0].getBerechneGebuhren());
    System.out.printf("%.2f \n", auf8[1].getBerechneGebuhren());
    System.out.printf("%.2f \n", auf8[2].getBerechneGebuhren());

    System.out.println();
    
    int gesamtgebuhr = 0;
    for (int i = 0;  i < auf8.length ;i++){ 
      gesamtgebuhr += auf8[i].getBerechneGebuhren();
    }
    System.out.println(gesamtgebuhr);
    
  }

}
