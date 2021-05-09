
package lasProjekt;

/*
 * Klasa: Mapa
 * wersja: 1
 * edytor: Arkadia Kowalczyk
 * data: 09.05.2021
 */

public class Mapa {
    private int wymiarX;
    private int wymiarY;
    private Object[][] tablica;
     
    public  Mapa(int wymiarX, int wymiarY) {
        this.wymiarX = wymiarX;
        this.wymiarY = wymiarY;
        this.tablica = new Object[wymiarX][wymiarY];
    }

    public void Rysuj(){
        //to be done
    }

    public Object TuJest(int posX, int posY){
        return tablica[posX][posY];
    }

    public int GetX(){
        return wymiarX;
    }

    public int GetY(){
        return wymiarY;
    }

}
