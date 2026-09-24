import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    private static FileLogger instance;

    private FileLogger() {
        System.out.println("Utworzono obiekt FileLogger");
    }

    public static FileLogger getInstance() {
        if (instance == null) {
            instance = new FileLogger();
        }

        return instance;
    }

    public void log(String message, LogType type) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String date = now.format(formatter);

        String logMessage =
                date + " [" + type + "] " + message + "\n";

        try (FileWriter writer = new FileWriter("application.log", true)) {
            writer.write(logMessage);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisywania logu.");
        }
    }
}
