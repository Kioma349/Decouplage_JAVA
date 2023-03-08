package exercices.mytube;

// Implémentation par défaut de l'encodage de vidéos

public class InterfaceVideoEncoder implements VideoEncoder {
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}