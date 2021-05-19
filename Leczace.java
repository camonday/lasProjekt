package lasProjekt;

 /*
  * Klasa: Leczace
  * wersja: 1
  * edytor: Maciej Dziewisz
  * data: 19.05.2021
  */
  
public class Leczace extends Roslina{

    private static int ileZyje = 0;
    private boolean czyMaLek;

    public Leczace (double energiaAdd, int posX, int posY) {
        ileZyje ++;
        this.energiaAdd = energiaAdd;
        pozycja = new Pozycja(posX, posY);
        czyZyje = true;
        czyMaLek = true;
    }
    
    public static int getIleZyje() {
        return ileZyje;
    }
    
    @Override
    public void JestZjadane(Istota killer) {
        Umiera();   
        //daje energie - to be done np killer.AddEnergia(energiaAdd) ale to trzeba w istocie dodac metode AddEnergia
    }
    
}
