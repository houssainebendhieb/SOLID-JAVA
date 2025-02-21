package Exercice1;

import java.util.ArrayList;
import java.util.List;

public class ParcAutomobile {
    private List<Voiture>listVoitures;
    public ParcAutomobile() {
        listVoitures = new ArrayList<Voiture>();
    }

    public  void addVoiture(Voiture voiture) {
        listVoitures.add(voiture);
    }
    double calculeConsommationMoyenne(double distance){
        return listVoitures.stream()
                .mapToDouble(voiture -> voiture.calculerConsommation(distance))
                .sum();
    }
}
