public class Voiture {
    /**
     * Modèle de la voiture.
     */
    private String modele;
    /**
     * Couleur de la voiture.
     */
    private String couleur;
    /**
     * Vitesse de la voiture.
     */
    private int vitesse;

    /**
     * Constructeur de la classe.
     * @param model
     * @param color
     */
    public Voiture(final String model, final String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    /**
     * Retourne la vitesse de la voiture.
     * @return int
     */
    public int getVitesse() {
        return this.vitesse;
    }

    /**
     * Augmenter la vitesse de la voiture.
     */
    public void accelerer() {
        final int increaseSpeed = 10;
        final int speedLimit = 120;

        if (vitesse + increaseSpeed <= speedLimit) {
            vitesse += increaseSpeed;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * Diminue la vitess de la voiture.
     */
    public void ralentir() {
        final int decreaseSpeed = 10;
        final int speedLimit = 0;
        if (vitesse - decreaseSpeed >= speedLimit) {
            vitesse -= decreaseSpeed;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    /**
     * Vérifie si le driver est un adulte et démarre la voiture si vrai.
     *
     * @param driver
     */
    public void startCar(final Conducteur driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getNom() + " démarre la voiture.");
        } else {
            System.out.println("Conducteur pas assez âgé pour conduire.");
        }
    }

    /**
     * La méthode arrête la voiture.
     *
     * @param driver
     */
    public void stopCar(final Conducteur driver) {
        System.out.println(driver.getNom() + " arrête la voiture.");
    }

    /**
     * La méthode change la vitesse de la voiture.
     *
     * @param newVitesse
     * @param driver
     */
    public void changeSpeed(final int newVitesse, final Conducteur driver) {
        System.out.println(driver.getNom() + " change speed to " + newVitesse);
        int vitesseActuelle;
        if (getVitesse() >= newVitesse) {
            while (getVitesse() > newVitesse) {
                ralentir();
            }
        } else  {
            while (getVitesse() < newVitesse) {
                accelerer();
            }
        }
    }
}

