package com.carsguide.propertyreader;

import com.carsguide.utility.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader extends Utility {
    private static volatile PropertyReader propInstance;

    //Create Private constructor Because of prevent the Instantiation of class
    private PropertyReader() {

    }

    public static synchronized PropertyReader getInstance(){
        if (propInstance == null){
            propInstance = new PropertyReader();
        }
        return propInstance;
    }

    public String getProperty(String propertyName){

        Properties prop = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/propertiesfile/config.properties");
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null){
                return prop.getProperty(propertyName);
            }
        } catch (Exception e) {
            System.out.println("Property not found");
        }
        return null;
    }
}
