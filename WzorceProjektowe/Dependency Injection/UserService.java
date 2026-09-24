public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String username) {

        System.out.println("Rejestracja użytkownika: " + username);

        notificationService.send(
                "Użytkownik " + username + " został zarejestrowany."
        );
    }
}
