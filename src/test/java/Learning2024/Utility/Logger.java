package Learning2024.Utility;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    // Private constructor to prevent instantiation
    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("automation.log", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        writer.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " - " + message);
        writer.flush();
    }

    // Close the writer when the application ends
    public void close() {
        writer.close();
    }
}
