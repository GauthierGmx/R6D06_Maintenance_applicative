public class Application {
    /**.
     * Exécute le programme
     * @param args
     */
    public static void main(final String[] args) {
        final int age = 20;
        final int vitesse1 = 80;
        final int vitesse2 = 30;

        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", age);

        maVoiture.startCar(moi);
        maVoiture.accelerer();
        maVoiture.changeSpeed(vitesse1, moi);
        maVoiture.ralentir();
        maVoiture.changeSpeed(vitesse2, moi);
        maVoiture.stopCar(moi);
        System.out.println("fini");
    }
}
