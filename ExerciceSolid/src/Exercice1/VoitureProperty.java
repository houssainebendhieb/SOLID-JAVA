package Exercice1;

public class VoitureProperty {

    private double kilometrage;
    private double litres;
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
    public double  calculerConsommation(double distance){
        return this.litres*distance/100;
    }

    public void validate(){
        this.kilometrage=Math.abs(this.kilometrage);
        this.litres=Math.abs(this.litres);
    }

    public VoitureProperty(double kilometrage, double litres) {
        validate();
    }
}
