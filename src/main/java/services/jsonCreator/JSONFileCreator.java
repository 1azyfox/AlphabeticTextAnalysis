package services.jsonCreator;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

public class JSONFileCreator {
    private String jsonFileName;

    public JSONFileCreator(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void create(TreeMap<String,Long> treeMapOfCharacters) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFileName));
        bw.write(JSONStringCreator.createJSONContent(treeMapOfCharacters));
    }
}
