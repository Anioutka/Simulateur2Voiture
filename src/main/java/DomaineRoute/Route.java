package DomaineRoute;

/**
 * Created by 21106632 on 27/03/2015.
 */
public class Route {
    /**
     * @largeur largeur de la route.
     */
    private int largeur;

    /**
     * @longueur longueur de la route.
     */
    private int longueur;

    /**
     * Constructeur.
     * @param largeur
     * @param longueur
     */
    public Route(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    /**
     * Getter largeur.
     * @return largeur
     */

    public int getLargeur() {
        return largeur;
    }

    /**
     * Getter longueur.
     * @return longueur
     */
    public int getLongueur() {
        return longueur;
    }
}
