package com.fourteen31.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

/** Represents a Config Get Property Values.
 * @author Phetho Malope
 * @author phetomalope@gmail.com
 * @version 1.0
 *
 * TODO:
 *  - make this class static, apply design pattern if needed
 *  - Refactor Class name
 */
public class ConfigGetPropertyValues {
    private String result = "";
    private HashMap<String, String> props = new HashMap<>();
    private InputStream inputStream;

    public HashMap<String, String> getPropValues() throws IOException {
        try {
            Properties properties = new Properties();
            String propertiesFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("Property file '" + propertiesFileName + "' not found in the classpath");
            }

            // FIXME: use a loop to populate the hashmap
            props = parseConfigProperties(properties);
            props.put("headless-mode", properties.getProperty("headless-mode"));
        } catch (Exception e) {
            // FIXME: handle this exception
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return props;
    }

    private HashMap<String, String> parseConfigProperties(Properties properties) {
        return null;
    }
}
