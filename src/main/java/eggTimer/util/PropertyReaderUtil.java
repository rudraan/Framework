package eggTimer.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {

    static Properties properties;

    public PropertyReaderUtil(){
        loadConfigProperties();

    }

    /**function to load the properties file
     *
     * this function is used to load the config properties file
     * */
    public void loadConfigProperties(){
        properties = new Properties();
        String fileName = System.getProperty("user.dir") + "/src/test/resources/config.properties";

        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            throw new RuntimeException(fileName + "not found");
        }
    }

    /**function to get the properties from properties file
     * @param propertyName this is used to get the property name from config.properties file
     * @return the property value from the config.properties
     * */
    public String getProperties(String propertyName) {
        return properties.getProperty(propertyName);
    }




}
