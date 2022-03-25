package dBTOOBJECTOBJECTTOPOJO.SqlConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;



public class GetPropertyvalue {
    static String key;
    static String value="";





    public static String getpropertyvalue(String key){


        Properties prop = new Properties();


        try {
            prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/config.properties")));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        String value =	prop.getProperty(key);
        return value;}

    public static String generateStringFromResource(String path) throws IOException {

        return new String(Files.readAllBytes(Paths.get(path)));

    }


}