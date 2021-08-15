package services.jsonCreator;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

public class JSONFileCreator {
    private String jsonFileName;

    public JSONFileCreator(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

    public void create(TreeMap<String, Long> treeMapOfCharacters) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFileName));
        int i = treeMapOfCharacters.size() + 1;
        while (i != 0) {
            bw.write(JSONStringCreator.createJSONContent(treeMapOfCharacters));
            i--;
        }
    }
}
