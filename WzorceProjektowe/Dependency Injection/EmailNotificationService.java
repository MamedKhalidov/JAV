public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Wysłano e-mail: " + message);
    }
}
