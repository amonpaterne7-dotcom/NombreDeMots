import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Vérifier si l'utilisateur a fourni le nom du fichier en argument
        if (args.length == 0) {
            System.out.println("Veuillez spécifier un fichier.");
            System.out.println("Exemple : java NombreDeMots TestExercice3.txt");
            return;
        }

        // Récupérer le nom du fichier depuis les arguments
        String nomFichier = args[0];

        // Compteur total de mots
        int totalMots = 0;

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
            System.out.println("---");

            // Additionner au total
            totalMots += nombreMotsLigne;
        }

        // Fermer le lecteur
        lecteur.close();

        // Afficher le total
        System.out.println("\nTOTAL : " + totalMots + " mots");
    }
}