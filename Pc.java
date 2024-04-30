public class Pc {
    Uc uc;
    Périphériques[] périphérique;

    public Pc(Uc uc, Périphériques[] périphérique) {
        this.uc = uc;
        this.périphérique = périphérique;
    }

    public double calConsoElec(int durée) throws ConsoException {
        // puissance total
        float puissance_tot = uc.puissance;// puissance de uc tkoun initiale et ajouter fogha
        for (int i = 0; i < périphérique.length; i++) {
            puissance_tot += périphérique[i].calculer_puissance();
        }
        float conso = puissance_tot * durée;
        if (conso > 1000) {
            throw new ConsoException("consommation depasse 1000 watt");
        } else
            return conso;
    }
}
