public class Main {
    public static void main(String[] args) {
        // Instance avec constructeur par défaut
        Quadrilatere q1 = new Quadrilatere();

        // Instance avec constructeur paramétré
        Quadrilatere q2 = new Quadrilatere(5, 3);

        // Affichage des infos et calculs
        q1.afficher();
        System.out.println("Surface = " + q1.surface());
        System.out.println("Périmètre = " + q1.perimetre());

        System.out.println("----------------------");

        q2.afficher();
        System.out.println("Surface = " + q2.surface());
        System.out.println("Périmètre = " + q2.perimetre());
    }
}