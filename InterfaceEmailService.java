package exercices.mytube;

    // Implémentation du service d'envoi d'emails
    public class InterfaceEmailService implements EmailService {
        @Override
        public void sendEmail(User user) {
            System.out.println("Notifying " + user.getEmail() + "...");
            System.out.println("Done!\n");
        }
    }
