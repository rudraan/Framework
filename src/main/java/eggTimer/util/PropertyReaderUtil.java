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

    //function to load the properties file
    public void loadConfigProperties(){
        properties = new Properties();
        String fileName = System.getProperty("user.dir") + "/src/test/resources/config.properties";

        //load properties file
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            throw new RuntimeException(fileName + "not found");
        }
    }

    //function to get the properties from properties file
    public String getProperties(String propertyName) {
        return properties.getProperty(propertyName);
    }




}
