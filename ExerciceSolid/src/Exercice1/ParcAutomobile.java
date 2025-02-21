package Exercice1;

import java.util.ArrayList;
import java.util.List;

public class ParcAutomobile implements ParcAutomobileRepo {
    private List<Voiture>listVoitures;
    public ParcAutomobile() {
        listVoitures = new ArrayList<Voiture>();
    }

    @Override
    public List<Voiture> getAllVoitures() {
        return this.listVoitures;
    }

    @Override
    public  void addVoiture(Voiture voiture) {
        listVoitures.add(voiture);
    }

    @Override
    public double calculerConsommationMoyenne(double distance) {
        return listVoitures.stream()
                .mapToDouble(voiture -> voiture.getProperty().calculerConsommation(distance))
                .sum();
    }


}
