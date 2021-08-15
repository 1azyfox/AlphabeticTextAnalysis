package services.jsonCreator;

import java.io.*;
import java.util.HashMap;

public class JSONFileCreator {
    private String jsonFileName;

    public JSONFileCreator(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void create(HashMap<String,Long> hashMapOfCharacters) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFileName));
        bw.write(JSONStringCreator.createJSONContent(hashMapOfCharacters));
    }
}
