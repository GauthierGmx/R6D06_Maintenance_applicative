public class Conducteur {
    /**
     * Nom du conducteur.
     */
    private String nom;
    /**
     * Age du conducteur.
     */
    private int age;

    /**
     * Constructeur du conducteur.
     * @param name
     * @param years
     */
    public Conducteur(final String name, final int years) {
        this.nom = name;
        this.age = years;
    }

    /**
     * Méthode qui retourne vrai si le conducteur est un adulte.
     * @return boolean
     */
    public boolean isAdult() {
        final int ageLimit = 10;
        return age >= ageLimit;
    }

    /**
     * Renvoie le nom du conducteur.
     * @return
     */
    public String getNom() {
        return nom;
    }
}
