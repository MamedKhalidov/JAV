public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Wysłano SMS: " + message);
    }
}
