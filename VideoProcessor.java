package exercices.mytube;

public class VideoProcessor {
    private final VideoEncoder encoder;
    private final VideoDatabase database;
    private final EmailService emailService;

    // On passe en paramètre les interfaces implémentées plutôt que les objets concrets
    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }
    // Méthode pour traiter une vidéo
    public void process(Video video) {
        // Encoder la vidéo
        encoder.encode(video);

        // Stocker les métadonnées de la vidéo
        database.store(video);

        // Envoyer un courriel à l'utilisateur
        emailService.sendEmail(video.getUser());
    }
}
