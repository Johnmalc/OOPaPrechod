/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class WuerfelSpiel {
  
  public static void main(String[] args) {
    
    byte tipp = 2;
    short durchlaeufe = 0;
    short siege = 0;
    short niederlagen = 0;
    byte wuerfelErgenis;
    short eins = 0;
    short zwei = 0;
    short drei = 0;
    short vier = 0;
    short fuenf = 0;
    short sechs = 0;
      
    
    do
    {
      wuerfelErgenis = (byte)((Math.random()*6)+1);
      
      if (wuerfelErgenis == tipp) {
        siege++;
      }
      else
      {
        niederlagen++;  
      }
      
      if (wuerfelErgenis == 1) {
        eins++;
      } else if(wuerfelErgenis == 2)
      {
        zwei++;
      }  else if(wuerfelErgenis == 3)
      {
        drei++;
      } else if(wuerfelErgenis == 4)
      {
        vier++;
      } else if(wuerfelErgenis == 5)
      {
        fuenf++;
      } else
      {
        sechs++;  
      }
      
      durchlaeufe++;
    } while(siege < 100);
    
    
    
    System.out.println("Durchläufe:\t" + durchlaeufe);
    
    System.out.println("Mein Tipp war:\t" + tipp);
    System.out.println("Siege:\t\t" + siege + "\t dies sind " + ((float)siege/(float)durchlaeufe)*100 + "%");
    System.out.println("Niederlagen:\t" + niederlagen + "\t dies sind " + ((float)niederlagen/durchlaeufe)*100 + "%");
    
    System.out.println("---------------------------------------------------------------");
    System.out.println("Vorkommen 1:\t" + eins + "\t dies sind " + ((float)eins/(float)durchlaeufe)*100 + "%");
    System.out.println("Vorkommen 2:\t" + zwei + "\t dies sind " + ((float)zwei/(float)durchlaeufe)*100 + "%");
    System.out.println("Vorkommen 3:\t" + drei + "\t dies sind " + ((float)drei/(float)durchlaeufe)*100 + "%");
    System.out.println("Vorkommen 4:\t" + vier + "\t dies sind " + ((float)vier/(float)durchlaeufe)*100 + "%");
    System.out.println("Vorkommen 5:\t" + fuenf + "\t dies sind " + ((float)fuenf/(float)durchlaeufe)*100 + "%");
    System.out.println("Vorkommen 6:\t" + sechs + "\t dies sind " + ((float)sechs/(float)durchlaeufe)*100 + "%");
    
    
    
    
  } // end of main
  
} // end of class WuerfelSpiel
