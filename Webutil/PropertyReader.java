package Webutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    Properties properties = new Properties();
    public PropertyReader()
    {
        loadProperties();
    }

    public void loadProperties(){
        try{
            FileInputStream input = new FileInputStream("F:\\Testing\\src\\test\\resources\\config.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getProperty(String key)
    {
        return properties.getProperty(key);
    }
}
