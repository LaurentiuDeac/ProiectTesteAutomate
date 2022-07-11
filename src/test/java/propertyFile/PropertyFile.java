package propertyFile;

import com.google.j2objc.annotations.Property;
import org.checkerframework.checker.units.qual.K;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.util.HashMap;
import java.util.Properties;

public class PropertyFile {

    private Properties properties;
    private FileInputStream fileInputStream;

    public PropertyFile(String fileName){
        readFromPropertiesFile(fileName);
    }

    private void readFromPropertiesFile (String fileName){
        this.properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/inputData/"+fileName+"Data.properties");
            this.properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, String> getAllValues(){
        HashMap<String,String> keyValue = new HashMap<>();
        for(Object key: properties.keySet()){
            keyValue.put(key.toString(),properties.getProperty(key.toString()));
        }
        return  keyValue;
    }


}
