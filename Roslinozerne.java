package lasProjekt;

 /*
  * Klasa: Roslinozerne
  * wersja: 1
  * edytor: Maciej Dziewisz
  * data: 19.05.2021
  */
  
  public class Roslinozerne extends Istota{


     public Roslinozerne (double energiaAdd, int posX, int posY, int socjalnosc, boolean czyTruje, double predkosc, double zuzycie) {
         ileZyje ++;
         this.energiaAdd = energiaAdd;
         pozycja = new Pozycja(posX, posY);
         czyZyje = true;
         
         this.socialnosc = socjalnosc;
         this.czyTruje = czyTruje;
         this.predkosc = predkosc;
         this.zuzycie = zuzycie;
     }

     public static int getIleZyje() {
         return ileZyje;
     }

     @Override
     private Jadalne Znalazl (){
     
     }

     @Override
     public void JestZjadane() {
         Umiera();   
     }

 }
  
