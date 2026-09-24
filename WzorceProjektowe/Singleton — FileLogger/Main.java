public class Main {

    public static void main(String[] args) {

        FileLogger logger1 = FileLogger.getInstance();
        FileLogger logger2 = FileLogger.getInstance();

        logger1.log("Uruchomiono aplikację", LogType.INFO);
        logger1.log("Wystąpił błąd podczas logowania", LogType.ERROR);
        logger2.log("Użytkownik otrzymał ostrzeżenie", LogType.WARNING);

        if (logger1 == logger2) {
            System.out.println("Obiekty są tą samą instancją.");
        }
    }
}
