public class Test {
    public static void main(String[] args) {
        Uc u1 = new Uc(4, 3, 5);
        Clavier clv = new Clavier(102, 5, 1, "azerty");
        Moniteur mon = new Moniteur(2, "dell", 2, 18, 1700);

        Pc pc0 = new Pc(u1, new Périphériques[] { clv, mon });
        try {
            double consommation = pc0.calConsoElec(5);
            System.out.println("Consommation électrique de PC0 pendant 5 heures: " + consommation + " Wh");

        } catch (ConsoException e) {
            System.out.println("Erreur: " + e.getMessage());
        } finally {
            System.out.println("Fin .");
        }
    }
}
