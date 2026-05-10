public class NombreDeMots {

    public static void main(String[] args) {

        // Vérifier si l'utilisateur a fourni une phrase en argument
        if (args.length == 0) {
            System.out.println("Veuillez fournir une phrase en argument.");
            System.out.println("Exemple : java NombreDeMots Bonjour tout le monde");
            return;
        }

        // Compter le nombre de mots (chaque argument est un mot)
        int nombreDeMots = args.length;

        // Reconstituer la phrase complète
        String phrase = String.join(" ", args);

        // Afficher les résultats
        System.out.println("Phrase : " + phrase);
        System.out.println("Nombre de mots : " + nombreDeMots);
    }
}