package com.CN.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static String readPropertyfile(String key)  {
        FileInputStream fis = null;
        Properties prop = null;
        try {
           fis=new FileInputStream("C:\\Users\\Anurag\\IdeaProjects\\dataDriven\\src\\test\\java\\com\\CN\\utilities\\PropertyrelatedFramework\\Dummy.properties");
             new Properties();
             prop.load(fis);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
         try{
             fis.close();
         }   catch(IOException e){
             e.printStackTrace();
         }
        }
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        String str =readPropertyfile("browser");
        System.out.print(str);
    }
}
