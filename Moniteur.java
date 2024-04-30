public class Moniteur extends Périphériques {
    int class_consommation;
    int dimention;
    int resolution_max;

    public Moniteur(int id, String modéle, int class_consommation, int dimention, int resolution_max) {
        super(id, modéle);
        this.class_consommation = class_consommation;
        this.dimention = dimention;
        this.resolution_max = resolution_max;
    }

    @Override
    public double calculer_puissance() {
        return class_consommation * dimention + resolution_max * 0.015;
    }
}
