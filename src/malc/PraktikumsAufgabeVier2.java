package malc;

import Prog1Tools.IOTools;

public class PraktikumsAufgabeVier2
{
  
  public static class StudentenDaten
  {
    
    public String Name;
    public String Vorname;
    public int Matrnummer;
    public String Studiengang;
    public String Email;
    public int Semester;
    
  }
  
  public static void main(String[] args)
  {
    
    StudentenDaten[] speicher = new StudentenDaten[10];
    StudentenDaten dat = new StudentenDaten();
    
    
    boolean ende = false;
    int fertig = 0;
    int a      = 1;
    int anzeigen;
    int loeschen;
    int indexPosition;
    String antwortIndex;
    System.out.println("Studenten Daten");
    System.out.println("----------------");
    
    
    
    
    while (ende == false) 
    {
      
      //Menue
      
      System.out.println("");
      System.out.println("1 = Neue Daten anlegen");
      System.out.println("2 = Gespeicherte Daten Anzeigen");
      System.out.println("3 = Gespeicherte Daten loeschen");
      System.out.println("4 = Daten an bestimmter Indexposition speichern");
      System.out.println("5 = Programm beenden");
      System.out.println("");
      int wahl = IOTools.readInteger("Ihre Wahl: ");
      System.out.println("");
      System.out.println("");
      
      switch (wahl)
      {
        case 1: // Neue Daten anlegen
        
        dat.Name         = IOTools.readLine     ("Name          : ");
        dat.Vorname      = IOTools.readLine     ("Vorname       : ");
        dat.Matrnummer   = IOTools.readInteger  ("Matr.Nr.      : ");
        dat.Studiengang  = IOTools.readLine     ("Studiengang   : ");
        dat.Email        = IOTools.readLine     ("Email         : ");
        dat.Semester     = IOTools.readInteger  ("Semeseter     : ");
        
        speicher[fertig] = dat;
        
        
        
        // Ausgabe soll sofort erfolgen!!
        System.out.println("");
        System.out.println("");
        System.out.println("Student "+a);
        System.out.println("------------------------------------------------------");
        
        
        
        System.out.println("Name                : "+dat.Name);
        System.out.println("Vorname             : "+dat.Vorname);
        System.out.println("Matr.Nr.            : "+dat.Matrnummer);
        System.out.println("Studiengang         : "+dat.Studiengang);
        System.out.println("Email               : "+dat.Email);
        System.out.println("Semester            : "+dat.Semester);
        System.out.println("------------------------------------------------------");
        
        
        
        
        
        
        
        a++;
        fertig++;
        
        
        break;
        
        
        case 2: // Gespeicherte Daten Anzeigen
        
        System.out.println("Welche Studenten Daten sollen Angezeigt werden? (1-10)");
        anzeigen = IOTools.readInteger("");
        System.out.println("");
        System.out.println("Gew�nschte Daten: ");
        System.out.println(speicher[anzeigen-1]);
        
        
        break;
        
        
        
        case 3: // Gespeicherte Daten loeschen!
        
        System.out.println("Welche Studenten Daten sollen gel�scht werden? (1-10)");
        loeschen = IOTools.readInteger("");
        speicher[loeschen-1] = null;
        System.out.println("");
        System.out.println("gel�schte Daten: ");
        System.out.println(speicher[loeschen-1]);
        
        
        
        
        
        break;
        
        case 4: // Daten an bestimmter Indexposition speichern !
        
        System.out.println("Auf Welche Index Position sollen Ihre Daten gespeichert werden (1-10)?");
        indexPosition = IOTools.readInteger("Ihre Wahl = ");
        
        
        if (speicher[indexPosition-1]!=null) 
        {
          System.out.println("");
          System.out.println("WARNUNG!!! An dieser Indexposition befinden sich bereits gespeicherte Daten die beim Fortfahren von ihnen �berschrieben werden. Trotzdem Fortfahren?");
          System.out.println("");
          antwortIndex = IOTools.readLine("Ihre Wahl (Ja/Nein) = ");
          System.out.println("");
          
          
          if (antwortIndex.equals("Ja")) 
          {
            
            dat.Name         = IOTools.readLine     ("Name          : ");
            dat.Vorname      = IOTools.readLine     ("Vorname       : ");
            dat.Matrnummer   = IOTools.readInteger  ("Matr.Nr.      : ");
            dat.Studiengang  = IOTools.readLine     ("Studiengang   : ");
            dat.Email        = IOTools.readLine     ("Email         : ");
            dat.Semester     = IOTools.readInteger  ("Semeseter     : ");
            
            speicher[indexPosition-1] = dat;
            System.out.println("");
            System.out.println("Ihre Daten sind an der gew�nschten Position gespeichert worden");
            
            if (antwortIndex.equals("Nein"))
            
            
            {
              
              
              // Springt zum Menue zur�ck
              
              
            } 
          }
        }
        
        else // Falls keine Daten bereits gespeichert!
        {
          
          System.out.println("");
          
          dat.Name         = IOTools.readLine     ("Name          : ");
          dat.Vorname      = IOTools.readLine     ("Vorname       : ");
          dat.Matrnummer   = IOTools.readInteger  ("Matr.Nr.      : ");
          dat.Studiengang  = IOTools.readLine     ("Studiengang   : ");
          dat.Email        = IOTools.readLine     ("Email         : ");
          dat.Semester     = IOTools.readInteger  ("Semeseter     : ");
          
          speicher[indexPosition-1] = dat;
          System.out.println("");
          System.out.println("Ihre Daten sind an der gew�nschten Position gespeichert worden");
          
          
        } // end of if-else
        
        break;   
        
        
        case 5: // Programm beenden!!
        
        ende = true;
        System.out.println("Zum beenden beliebige Taste dr�cken");
        
        
        
        
        
        
      } // end of switch
      
      
      
      
      
      
    } // end of while
    
  } // Ende Hauptprogramm(main)
} // Ende Programm(Gesammt)    
      
      
      
      
    