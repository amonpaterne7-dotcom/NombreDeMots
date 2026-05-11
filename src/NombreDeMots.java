import java.io.File;
import java.util.Scanner;

public class NombreDeMots {

    public static void main(String[] args) {

        // Nom du fichier à lire
        String nomFichier = "fichier.txt";

        // Compteur total de mots
        int totalMots = 0;

        try {
            // Ouvrir le fichier avec le lecteur de fichiers
            File fichier = new File(nomFichier);
            Scanner lecteur = new Scanner(fichier);

            System.out.println("Comptage de mots : " + nomFichier + "\n");

            // Boucle qui lit chaque ligne
            while (lecteur.hasNextLine()) {

                // Lire la ligne courante
                String ligne = lecteur.nextLine();

                // Séparer la ligne par les espaces
                String[] mots = ligne.split(" ");

                // Compter les mots de cette ligne
                int nombreMotsLigne = mots.length;

                // Afficher la ligne et son nombre de mots
                System.out.println("Ligne : \"" + ligne + "\"");
                System.out.println("Mots dans cette ligne : " + nombreMotsLigne);
                System.out.println("\n");

                // Additionner au total
                totalMots += nombreMotsLigne;
            }

            // Fermer le lecteur
            lecteur.close();

            // Afficher le total
            System.out.println("\n TOTAL : " + totalMots + " mots ");

        } catch (Exception e) {
            System.out.println("Fichier non trouvé : " + nomFichier);
        }
    }
}