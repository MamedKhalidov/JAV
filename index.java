import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = scanner.nextLine().trim();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine().trim();

        System.out.print("Podaj email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Podaj haslo: ");
        String haslo = scanner.nextLine().trim();

        if (imie.isEmpty() || nazwisko.isEmpty() || email.isEmpty() || haslo.isEmpty()) {
            System.out.println("Uzupelnij wszystkie pola");

        } else if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Podaj poprawny adres email");

        } else if (haslo.length() < 8
                || !haslo.matches(".*[A-Z].*")
                || !haslo.matches(".*[a-z].*")
                || !haslo.matches(".*[^a-zA-Z0-9].*")) {

            System.out.println("Haslo musi miec co najmniej 8 znakow, duza i mala litere oraz znak specjalny");

        } else {
            System.out.println("Dane sa poprawne");
        }

        scanner.close();
    }
}
