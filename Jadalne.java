package lasProjekt;

/*
 * Klasa: Jadalne
 * wersja: 1
 * edytor: Arkadia Kowalczyk
 * data: 09.05.2021
 */

public abstract class Jadalne {
    private double energiaAdd;
    private boolean czyZyje;
    private Pozycja pozycja;

    protected void Umiera(){
        czyZyje = false;
        pozycja = null;
    }

    public Pozycja GetPozycja(){
        return pozycja;
    }

    public double GetEnergiaAdd(){
        return energiaAdd;
    }

    public abstract void JestZjadane();
}
