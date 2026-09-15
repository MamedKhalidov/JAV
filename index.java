import java.util.Scanner

public class Main {
    public static void main (String[] args) {
    Scanner Scanner = new Scanner(System.in);

    System.out.print("Podaj imie: ");
    String imie = scanner.nextLine().trim();

    System.out.print("Podaj nazwisko: ");
    String nazwisko = scanner.nextLine().trim();

    System.out.print("Podaj email: ");
    String email = scanner.nextLine().trim();

    System.out.print("Podaj haslo: ");
    String haslo = scanner.nextLine().trim();

    if (imie.isEmpty() || nazwisko.isEmpty() nazwisko.isEmpty() || haslo.isEmpty()) {
        System.out.println("uzupelnij wszystkie pola");

    } else if (!emai.contains("@") || !email.contains(".")){
        System.out.println("Podaj poprawny adres email");
            } else if (haslo.length() < 8 || !haslo.matches(".*[A-Z].*") || !haslo.matches(".*[a-z].*") || !haslo.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("haslo musi miec co najmiej 8 znakow duza/mala litere znak specjalny");
            } else {
                System.out.println("dane sa poprawne");
            }
            Scanner.close();

}
}
