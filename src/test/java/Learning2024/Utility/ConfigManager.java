package Learning2024.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager instance;
    private Properties properties;

    // Private constructor to prevent instantiation
    private ConfigManager() {
        properties = new Properties();
        try {
            // Load properties file
            properties.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Public method to provide access to the instance
    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    // Method to get property value by key
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
