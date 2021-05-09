package lasProjekt;

public class Roslina extends Jadalne{

    private static int ileZyje = 0;

    public Roslina (double energiaAdd, int posX, int posY) {
        ileZyje ++;
        this.energiaAdd = energiaAdd;
        pozycja = new Pozycja(posX, posY);
        czyZyje = true;
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
