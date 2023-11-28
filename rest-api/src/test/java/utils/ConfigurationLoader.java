package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationLoader {
    private static Properties properties;

    public static String getUser() throws IOException {
        loadConfig();
        return properties.getProperty("user");
    }

    public static String getPass() throws IOException {
        loadConfig();
        return properties.getProperty("pass");
    }

    private static void loadConfig() throws IOException {
        if (properties == null) {
            FileReader reader = new FileReader("src/main/resources/config.properties");
            properties = new Properties();
            properties.load(reader);
        }
    }
}
