package lasProjekt;

/*
 * Klasa: Pozycja
 * wersja: 1
 * edytor: Arkadia Kowalczyk
 * data: 09.05.2021
 */

public class Pozycja {
    private int posX1;
    private int posX2;
    private int posY1;
    private int posY2;

    public Pozycja(int posX1, int posX2, int posY1, int posY2){
        if(posX1<=posX2){
            this.posX1=posX1;
            this.posX2=posX2;
        }
        else{
            this.posX1=posX2;
            this.posX2=posX1; 
        }

        if(posY1<=posY2){
            this.posY1=posY1;
            this.posY2=posY2;
        }
        else{
            this.posY1=posY2;
            this.posY2=posY1;
        }
    }

    public Pozycja(int posX, int posY){
        this(posX, posX, posY, posY);
    }

    public boolean Porownaj(Pozycja nowaPozycja){ 
        //true jesli this miesci sie w nowym lub jest rowne nowemu
        //wzdłóż osi x
        if(this.posX1<nowaPozycja.posX1){
            return false;
        }else{
            if(this.posX2>nowaPozycja.posX2){
                return false;
            }
        }

        //wzdłóż osi y
        if(this.posY1<nowaPozycja.posY1){
            return false;
        }else{
            if(this.posY2>nowaPozycja.posY2){
                return false;
            }
        }

        return true;
    }

}
