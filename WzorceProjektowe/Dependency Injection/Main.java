public class Main {

    public static void main(String[] args) {

        NotificationService notificationService =
                new EmailNotificationService();

        UserService userService =
                new UserService(notificationService);

        userService.registerUser("Jan");
    }
}
