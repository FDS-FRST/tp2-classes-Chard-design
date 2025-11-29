public class Quadrilatere {
    /**
     exercice java :
     Creer un classe modelisant un quadrilatere
     Creer deux constructeurs dont 1 qui met des valeurs par defauts sur les attributs et un autre qui accepte les proprieties en parametres
     Definir les comportements surface et perimetre
     Creer deux instances distincts de quadrilatere (dont 1 a partir du constructeur par defaut)
     Afficher les surfaces et perimetre de chaque quadrilatere.
      */
    // Attributs : longueur et largeur
        private double longueur;
        private double largeur;

        // Constructeur par défaut (valeurs fixes)
        public Quadrilatere() {
            this.longueur = 1.0;
            this.largeur = 1.0;
        }

        // Constructeur avec paramètres
        public Quadrilatere(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        // Méthode pour calculer le périmètre
        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        // Méthode pour calculer la surface
        public double surface() {
            return longueur * largeur;
        }

        // Méthode pour afficher
        public void afficher() {
            System.out.println("Quadrilatère [longueur = " + longueur + ", largeur = " + largeur + "]");
        }
}


