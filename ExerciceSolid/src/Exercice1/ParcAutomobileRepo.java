package Exercice1;

import java.util.List;

public interface ParcAutomobileRepo {
    List<Voiture>getAllVoitures();

    void addVoiture(Voiture voiture);
    double calculerConsommationMoyenne(double distance);
}
