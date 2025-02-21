package Exercice1;


public class Voiture {

    private String Id;
    private double kilometrage;
    private double litres;
    private Marque marque;
    private Modele modele;

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public double  calculerConsommation(double distance){
        return this.litres*distance/100;
    }

    public void validate(){
        this.kilometrage=Math.abs(this.kilometrage);
        this.litres=Math.abs(this.litres);
    }

}