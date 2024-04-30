class Clavier extends Périphériques {
   int nbrTouches;
   int puissance;

   public Clavier(int nbrTouches, int puissance, int id, String modéle) {
      super(id, modéle);
      this.nbrTouches = nbrTouches;
      this.puissance = puissance;
   }

   @Override
   public double calculer_puissance() {
      return puissance;
   }

}
