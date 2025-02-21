package Exercice1;


public class Voiture {

    private String Id;
    private String marque;
    private String modele;
    private VoitureProperty property;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public VoitureProperty getProperty() {
        return property;
    }

    public void setProperty(VoitureProperty property) {
        this.property = property;
    }
}