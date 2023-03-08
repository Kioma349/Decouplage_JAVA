package exercices.mytube;

// Interface pour stocker les informations d'une vidéo dans notre base de données
// On a définit une interface pour la base de données de vidéos
public interface VideoDatabase {
    void store(Video video); // Méthode pour stocker une vidéo
}
